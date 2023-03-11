package com.javaMysql.chapterTwo;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
//�Ӽ����������ݵ����ݿ�
public class jdbcfromkeyboard {

    public static void main(String[] args) {
        // ����һ���Ӽ��̽������ݵ�ɨ����
        Scanner scanner = new Scanner(System.in);
        // �����ļ��ַ������
        FileWriter fw = null;

        try {
            fw = new FileWriter("D:\\JAVAresoures\\JDBCtest\\mytes01.txt",true);
            System.out.println("������Ҫ�������ݿ�����������ݣ�");
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            String str3 = scanner.nextLine();

            // ������д���ļ���

            // ����oracle����
            Class.forName("com.mysql.jdbc.Driver");
            // �������ݿ�����
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test02", "root", "Dzh441826");
            // �����������sql���
            String insertSql = "INSERT INTO user(id,NAME,age) VALUES(?,?,?)";
            // ����PreparedStatement����
            PreparedStatement pstmt = conn.prepareStatement(insertSql);
            // ʹ��setXXX()�����Բ�����ֵ
            pstmt.setInt(1, Integer.parseInt(str1));
            pstmt.setString(2, str2);
            pstmt.setString(3, str3);

            // ִ��
            int result = pstmt.executeUpdate();
            System.out.println("����" + result + "�У�");
            fw.write(str1+""+str2+""+str3); //д������ļ�

            fw.close();//�ر�д��
            pstmt.close(); // �ر�����

            conn.close();// �ر�����
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}