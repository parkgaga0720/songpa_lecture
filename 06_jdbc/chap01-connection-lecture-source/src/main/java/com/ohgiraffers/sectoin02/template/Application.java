package com.ohgiraffers.sectoin02.template;


import java.sql.Connection;

import static com.ohgiraffers.sectoin02.template.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {
        Connection con = getConnection();
        System.out.println(con);
        close(con);
    }
}
