package com.ohgiraffers.section02.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application3 {
    public static void main(String[] args) {
        Connection con = getConnection();

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("사번 입력");
        String empId = sc.nextLine();

        String query = "select * from employee where emp_id=?";

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, empId);

            rset = pstmt.executeQuery();
            if (rset.next()) {
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
