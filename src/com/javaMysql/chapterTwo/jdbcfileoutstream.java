package com.javaMysql.chapterTwo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//使用IO流连接查询数据库数据
public class jdbcfileoutstream {

    public static void main(String[] args) {

        // 声明文件字节输出流
        FileOutputStream fos = null;
        try {
            // 实例化文件字符输出流
            fos = new FileOutputStream("D:\\JAVAresoures\\JDBCtest\\jdbctofileoutstream.txt");
            // 加载mysql驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 建立数据库连接
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test02", "root", "Dzh441826");
            System.out.println("连接成功！");
            // 创建Statment对象
            Statement stmt = conn.createStatement();
            // 获取查询结果集
            ResultSet rs = stmt.executeQuery("SELECT * FROM userdetails");
            System.out.println("查询成功！");
            // 访问结果集中的数据
            while (rs.next()) {
                System.out.println(rs.getString(1)+"  " +rs.getString("username")+"  " +rs.getString(3)+"  " +rs.getNString(4));
                String ka = rs.getString(1)+"  " +rs.getString("username")+"  " +rs.getString(3)+"  " +rs.getNString(4)+"\n";
                fos.write(ka.getBytes());
            }
            fos.close();
            // 关闭结果集
            rs.close();
            //关闭载体
            stmt.close();
            //关闭连接
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}

