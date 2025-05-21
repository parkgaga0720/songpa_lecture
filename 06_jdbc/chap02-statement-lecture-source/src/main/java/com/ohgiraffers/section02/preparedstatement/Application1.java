package com.ohgiraffers.section02.preparedstatement;

import java.sql.*;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application1 {
    public static void main(String[] args) {
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        try {
            pstmt = con.prepareStatement("select emp_id from employee;");
            rset = pstmt.executeQuery();

            while(rset.next()) {
                System.out.println(rset.getString("emp_id"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(pstmt);
            close(con);
        }


    }
}
