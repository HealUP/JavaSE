package com.javaMysql.chapterTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//�������ݿⲢ��������
public class ConnectionDemo {

    public static void main(String[] args) {
        try {
            // ????oracle????
            Class.forName("com.mysql.cj.jdbc.Driver");
            // ?????????????
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test02", "root", "Dzh441826");
            System.out.println("????????");
            // ????Statment????
            Statement stmt = conn.createStatement();
            // ???????????
            ResultSet rs = stmt
                    .executeQuery("SELECT id,username FROM userdetails");
            System.out.println("????????");
            // ?????????����?????
            while (rs.next()) {
                System.out.println(rs.getString(1)+" "+rs.getString("username"));
            }
            // ???????
            rs.close();
            //???????
            stmt.close();
            //???????
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

