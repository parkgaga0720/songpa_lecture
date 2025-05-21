package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.modle.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application6 {
    public static void main(String[] args) {
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        EmployeeDTO row = null;
        List<EmployeeDTO> empList = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("성 입력");
        String empName = sc.nextLine();

        Properties prop = new Properties();
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section02/preparedstatement/employee-query.xml"));
            String query = prop.getProperty("selectEmpByFamilyName");
            System.out.println(query);

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empName);

            rset = pstmt.executeQuery();
            empList = new ArrayList<EmployeeDTO>();

            while (rset.next()) {
                row = new EmployeeDTO();

                row.setEmpId(rset.getString("emp_id"));
                row.setEmpName(rset.getString("emp_name"));
                row.setEmpNo(rset.getString("emp_no"));
                row.setEmail(rset.getString("email"));
                row.setPhone(rset.getString("phone"));
                row.setDeptCode(rset.getString("dept_code"));
                row.setJobCode(rset.getString("job_code"));
                row.setSalLevel(rset.getString("sal_level"));
                row.setSalary(rset.getInt("salary"));
                row.setBonus(rset.getDouble("bonus"));
                row.setManagerId(rset.getString("manager_id"));
                row.setHireDate(rset.getDate("hire_date"));
                row.setEntDate(rset.getDate("ent_date"));
                row.setEntYn(rset.getString("ent_yn"));

                empList.add(row);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }
        for (EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }
}
