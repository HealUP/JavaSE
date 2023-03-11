package com.JDBC;

import com.mysql.jdbc.Driver;

import java.sql.*;

public class jdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.��������
        Class.forName("com.mysql.cj.jdbc.Driver");//���䣬��ȡclass�Ķ���  �̶�д��
        //2.�û���Ϣ��url
        String url = "jdbc:mysql://localhost:3306/bank?autoReconnect=true&useUnicode=true&characterEncoding=utf8&serverTimezone=GMT%2B8&useSSL=false&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "a123456";
        //3.���ӳɹ�����ȡ���ݿ����  Connection �������ݿ�
        Connection connection = DriverManager.getConnection(url, username, password);
        //4.��ȡִ��sql�Ķ���Statement
        Statement statement = connection.createStatement();
        //5.ִ��SQL, ���ܴ��ڽ��  �鿴���ؽ��
        String sql = "select * from account";
        //���ؽ��
        ResultSet resultSet = statement.executeQuery(sql);//���ص��ǽ��������װ�����еĽ��
        //��ȡ
        while(resultSet.next()){
            System.out.println("id="+resultSet.getObject("id"));
            System.out.println("name="+resultSet.getObject("name"));
            System.out.println("money="+resultSet.getObject("money"));
        }

        //�ͷ�����
        resultSet.close();
        statement.close();
        connection.close();
    }
}
