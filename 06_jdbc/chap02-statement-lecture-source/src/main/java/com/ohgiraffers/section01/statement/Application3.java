package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application3 {
    public static void main(String[] args) {
        Connection con = getConnection();

        Statement stmt = null;
        ResultSet rset = null;

        try {
            stmt = con.createStatement();
            Scanner sc = new Scanner(System.in);
            String empId = sc.nextLine();
            String query = "select emp_id, emp_name from employee where emp_id = '" + empId + "'";

            System.out.println(query);

            rset = stmt.executeQuery(query);
            if (rset.next()) {
                System.out.println(rset.getString("emp_id")+", "+rset.getString("emp_name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(stmt);
            close(rset);
            close(con);
        }
    }
}
