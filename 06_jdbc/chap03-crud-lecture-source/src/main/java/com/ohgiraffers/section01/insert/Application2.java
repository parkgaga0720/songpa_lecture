package com.ohgiraffers.section01.insert;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application2 {
    public static void main(String[] args) {
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("insertMenu");

            Scanner sc = new Scanner(System.in);
            System.out.print("메뉴 이름 ");
            String menuName = sc.nextLine();
            System.out.print("메뉴 가격 ");
            int munuPrice = sc.nextInt();
            System.out.print("메뉴 코드 ");
            int menuCode = sc.nextInt();
            System.out.print("판매 여부 ");
            String menuAble = sc.nextLine().toUpperCase();

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, menuAble);
            pstmt.setInt(2, munuPrice);
            pstmt.setInt(3, menuCode);
            pstmt.setString(4, menuAble);

            result = pstmt.executeUpdate();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{
            close(pstmt);
            close(con);
        }
        if(result > 0){
            System.out.println("성공");
        }else{
            System.out.println("실패");
        }
    }
}
