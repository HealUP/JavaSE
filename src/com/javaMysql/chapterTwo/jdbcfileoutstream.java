package com.javaMysql.chapterTwo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//ʹ��IO�����Ӳ�ѯ���ݿ�����
public class jdbcfileoutstream {

    public static void main(String[] args) {

        // �����ļ��ֽ������
        FileOutputStream fos = null;
        try {
            // ʵ�����ļ��ַ������
            fos = new FileOutputStream("D:\\JAVAresoures\\JDBCtest\\jdbctofileoutstream.txt");
            // ����mysql����
            Class.forName("com.mysql.cj.jdbc.Driver");
            // �������ݿ�����
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test02", "root", "Dzh441826");
            System.out.println("���ӳɹ���");
            // ����Statment����
            Statement stmt = conn.createStatement();
            // ��ȡ��ѯ�����
            ResultSet rs = stmt.executeQuery("SELECT * FROM userdetails");
            System.out.println("��ѯ�ɹ���");
            // ���ʽ�����е�����
            while (rs.next()) {
                System.out.println(rs.getString(1)+"  " +rs.getString("username")+"  " +rs.getString(3)+"  " +rs.getNString(4));
                String ka = rs.getString(1)+"  " +rs.getString("username")+"  " +rs.getString(3)+"  " +rs.getNString(4)+"\n";
                fos.write(ka.getBytes());
            }
            fos.close();
            // �رս����
            rs.close();
            //�ر�����
            stmt.close();
            //�ر�����
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

