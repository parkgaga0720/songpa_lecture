package com.ohgiraffers.section01.statement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        Connection con = getConnection();

        Statement stmt = null;

        ResultSet rset = null;

        try {
            stmt= con.createStatement();
        rset=stmt.executeQuery("select emp_id from employee");
        while(rset.next()){
            System.out.println(rset.getString("emp_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(stmt);
            close(con);
        }
    }
}
