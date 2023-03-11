package com.javaMysql.chapterTwo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//�������ݿ⡢�������


public class PreparedStatementDemo {

    public static void main(String[] args) {

        try {
            // ����oracle����
            Class.forName("com.mysql.cj.jdbc.Driver");
            // �������ݿ�����
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test02", "root", "Dzh441826");
            // �����������sql���
            String insertSql = "INSERT INTO userdetails(id,username,password,sex) VALUES(?,?,?,?)";
            // ����PreparedStatement����
            PreparedStatement pstmt = conn.prepareStatement(insertSql);
            // ʹ��setXXX()�����Բ�����ֵ
            pstmt.setInt(1, 17);
            pstmt.setString(2, "Tom2");
            pstmt.setString(3, "123459");
            pstmt.setByte(4, (byte) 1);
            // ִ��
            int result = pstmt.executeUpdate();
            System.out.println("����" + result + "�У�");
            // �ر�����
            pstmt.close();
            // �ر�����
            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
