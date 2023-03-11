package com.utils;

import javax.swing.plaf.nimbus.State;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

//加载工具类
public class jdbcUtils {
    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;

    static {
        try {
            InputStream in = jdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");//获取到输入流
            Properties properties = new Properties();
            properties.load(in);
            //获取到配置文件中的相应值
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");

            //1.加载驱动，驱动只加载一次
            Class.forName(driver);//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接:封装到了getConnection()方法中了
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
    //释放资源：封装到了release方法中了
    public static void release(Connection conn, Statement st, ResultSet rs){
        if (rs!=null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
            if (st!=null){
                try {
                    st.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

    }
}
