package com.JDBC;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");//反射，获取class的对象  固定写法
        //2.用户信息和url
        String url = "jdbc:mysql://localhost:3306/bank?autoReconnect=true&useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "a123456";
        //3.连接成功，获取数据库对象  Connection 代表数据库
        Connection connection = DriverManager.getConnection(url, username, password);
        //4.获取执行sql的对象Statement
        Statement statement = connection.createStatement();
        //5.执行SQL, 可能存在结果  查看返回结果
        String sql = "select * from account";
        //返回结果
        ResultSet resultSet = statement.executeQuery(sql);//返回的是结果集，封装了所有的结果
        //读取
        while(resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("name"));
            System.out.println("money="+resultSet.getObject("money"));
        }

        //释放连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
