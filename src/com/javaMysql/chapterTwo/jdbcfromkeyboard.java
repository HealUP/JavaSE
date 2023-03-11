package com.javaMysql.chapterTwo;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//从键盘输入数据到数据库
public class jdbcfromkeyboard {

    public static void main(String[] args) {
        // 建立一个从键盘接收数据的扫描器
        Scanner scanner = new Scanner(System.in);
        // 声明文件字符输出流
        FileWriter fw = null;

        try {
            fw = new FileWriter("D:\\JAVAresoures\\JDBCtest\\mytes01.txt",true);
            System.out.println("请输入要输入数据库里的四行内容：");
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String str3 = scanner.nextLine();

            // 将数据写入文件中

            // 加载oracle驱动
            Class.forName("com.mysql.jdbc.Driver");
            // 建立数据库连接
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test02", "root", "Dzh441826");
            // 定义带参数的sql语句
            String insertSql = "INSERT INTO user(id,NAME,age) VALUES(?,?,?)";
            // 创建PreparedStatement对象
            PreparedStatement pstmt = conn.prepareStatement(insertSql);
            // 使用setXXX()方法对参数赋值
            pstmt.setInt(1, Integer.parseInt(str1));
            pstmt.setString(2, str2);
            pstmt.setString(3, str3);

            // 执行
            int result = pstmt.executeUpdate();
            System.out.println("插入" + result + "行！");
            fw.write(str1+""+str2+""+str3); //写入磁盘文佳

            fw.close();//关闭写入
            pstmt.close(); // 关闭载体

            conn.close();// 关闭连接
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}