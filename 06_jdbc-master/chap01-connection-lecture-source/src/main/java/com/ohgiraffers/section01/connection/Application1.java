package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application1 {

    public static void main(String[] args) {

        /* comment. DB 접속을 위한 Connection Instance 생성 */
        Connection con = null;

        /* 사용할 Driver 등록 */
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            /* DriverManager를 이용해 Connection 생성 */
            con = DriverManager.getConnection("jdbc:mysql://localhost/employeedb", "ohgiraffers", "ohgiraffers");

            System.out.println("con = " + con);

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
