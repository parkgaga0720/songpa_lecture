package com.ohgiraffers.section02.model.dao;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.*;
import java.util.List;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static java.lang.reflect.Array.setInt;

public class MenuDAO {
    private Properties prop = new Properties();

    public MenuDAO() {
        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int selectLastMenuCode(Connection con) {
        Statement stmt = null;
        ResultSet rset = null;

        int maxMenuCode = 0;

        String query = prop.getProperty("selectLastMenuCode");

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);
            if (rset.next()) {
                maxMenuCode = rset.getInt("Max(A.menu_code)");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(stmt);
        }
        return maxMenuCode;
    }
    public List<Map<Integer, String>> selectAllCategory(Connection con){
        Statement stmt = null;
        ResultSet rset = null;
        List<Map<Integer, String>> categoryList = null;
        String query = prop.getProperty("selectAllCategoryList");

        try {
            stmt = con.createStatement();
        rset = stmt.executeQuery(query);

        categoryList = new ArrayList<>();

        while (rset.next()) {
            Map<Integer, String> category = new HashMap<>();
            category.put(rset.getInt("menu_code"), rset.getString("MenuName"));

            categoryList.add(category);
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            close(rset);
            close(stmt);
        }
        return categoryList;
    }

    public int insertMenu(Connection con, MenuDTO newMenu) {
        PreparedStatement pstmt = null;
        int result = 0;

        String query = prop.getProperty("insertMenu");

        try {
            pstmt = con.prepareStatement(query);
            pstmt=setInt(1, newMenu.getCode());
            pstmt=setString(2, newMenu.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
