package com.ohgiraffers.section02.run;

import com.ohgiraffers.section02.model.dao.MenuDAO;

import java.sql.Connection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {
        Connection con = getConnection();
        MenuDAO registDAO = new MenuDAO();
        int maxMenuCode = registDAO.selectLastMenuCode(con);
        System.out.println(maxMenuCode);


        List<Map<Integer, String>> categoryList = registDAO.selectAllCategory(con);
        for (Map<Integer, String> category : categoryList) {
            System.out.println(category);
        }

        
    }
}
