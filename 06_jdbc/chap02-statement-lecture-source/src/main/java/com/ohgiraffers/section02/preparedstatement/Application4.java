package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.modle.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application4 {
    public static void main(String[] args) {
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        EmployeeDTO selectEmp = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("사번 입력");
        String empId = sc.nextLine();

        String query = "select * from employee where emp_id=?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);

            rset = pstmt.executeQuery();

            if(rset.next()) {
                selectEmp = new EmployeeDTO();

                selectEmp.setEmpId(rset.getString("emp_id"));
                selectEmp.setEmpName(rset.getString("emp_name"));
                selectEmp.setEmpNo(rset.getString("emp_no"));
                selectEmp.setEmail(rset.getString("email"));
                selectEmp.setPhone(rset.getString("phone"));
                selectEmp.setDeptCode(rset.getString("dept_code"));
                selectEmp.setJobCode(rset.getString("job_code"));
                selectEmp.setSalLevel(rset.getString("sal_level"));
                selectEmp.setSalary(rset.getInt("salary"));
                selectEmp.setBonus(rset.getDouble("bonus"));
                selectEmp.setManagerId(rset.getString("manager_id"));
                selectEmp.setHireDate(rset.getDate("hire_date"));
                selectEmp.setEntDate(rset.getDate("ent_date"));
                selectEmp.setEntYn(rset.getString("ent_yn"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(pstmt);
            close(con);
        }
        System.out.println(selectEmp);
    }
}
