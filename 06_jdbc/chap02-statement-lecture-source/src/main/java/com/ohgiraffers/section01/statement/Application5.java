package com.ohgiraffers.section01.statement;

import com.ohgiraffers.modle.dto.EmployeeDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application5 {
    public static void main(String[] args) {
        Connection con = getConnection();

        Statement stmt = null;
        ResultSet rset = null;

        EmployeeDTO row = null;

        List<EmployeeDTO> empList = null;

        String query = "select * from employee";

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);
            empList = new ArrayList<>();
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(stmt);
            close(con);
        }

        for (EmployeeDTO emp : empList) {
            System.out.println(emp);
        }
    }
}
