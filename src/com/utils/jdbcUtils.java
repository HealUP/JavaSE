package com.utils;

import javax.swing.plaf.nimbus.State;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

//���ع�����
public class jdbcUtils {
    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;

    static {
        try {
            InputStream in = jdbcUtils.class.getClassLoader().getResourceAsStream("db.properties");//��ȡ��������
            Properties properties = new Properties();
            properties.load(in);
            //��ȡ�������ļ��е���Ӧֵ
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");

            //1.��������������ֻ����һ��
            Class.forName(driver);//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //��ȡ����:��װ����getConnection()��������
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
    //�ͷ���Դ����װ����release��������
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
