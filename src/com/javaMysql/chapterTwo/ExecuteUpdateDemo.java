package com.javaMysql.chapterTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExecuteUpdateDemo {
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/test02";
    private String user = "root";
    private String pass = "Dzh441826";

    public void createTable(String sql) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
                // 获取数据库连接
                Connection conn = DriverManager.getConnection(url, user, pass);
                // 使用Connection来创建一个Statment对象
                Statement stmt = conn.createStatement()) {
            // 执行DDL,创建数据表
            stmt.executeUpdate(sql);
        }
    }

    public long insertData(String sql) throws Exception {
        // 加载驱动
        Class.forName(driver);
        try (
                // 获取数据库连接
                Connection conn = DriverManager.getConnection(url, user, pass);
                // 使用Connection来创建一个Statment对象
                Statement stmt = conn.createStatement()) {
            // 执行DML,返回受影响的记录条数
            return stmt.executeUpdate(sql);
        }
    }

    public static void main(String[] args) throws Exception {
        ExecuteUpdateDemo elud = new ExecuteUpdateDemo();
        elud.createTable("create table my_test3"
                + "(test_id int primary key, " + "test_name varchar(255))");
        System.out.println("-----建表成功-----");

        long result = elud.insertData("insert into my_test3(test_id,test_name) "
                + "select id,username from userdetails");
        System.out.println("--系统中共有" + result + "条记录受影响--");
    }
}
