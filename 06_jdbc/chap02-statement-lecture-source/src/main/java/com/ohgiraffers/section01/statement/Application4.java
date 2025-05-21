package com.ohgiraffers.section01.statement;

import com.ohgiraffers.modle.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application4 {
    public static void main(String[] args) {
        Connection con = getConnection();

        Statement stmt = null;
        ResultSet rset = null;

        EmployeeDTO selectEmp = null;
        Scanner sc = new Scanner(System.in);
        String empId = sc.nextLine();

        String query = "select * from employee where emp_id = '" + empId + "'";

        try {
            stmt = con.createStatement();
        rset = stmt.executeQuery(query);
        if (rset.next()) {
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
            close(stmt);
            close(con);
        }
        System.out.println(selectEmp);
    }
}
