package com.javaMysql.chapterTwo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class CallableStatementDemo {

    public static void main(String[] args) {
        try {
            // ����mysql����
            Class.forName("com.mysql.jdbc.Driver");
            // �������ݿ�����
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test02", "root", "Dzh441826");
            System.out.println("���ӳɹ���");

            // ����CallableStatement���󣬵��ô�IN�����Ĵ洢����
            CallableStatement cstmt = conn
                    .prepareCall("{call addUserdetails(?,?,?,?)}");
            // ΪIN������ֵ
            cstmt.setInt(1, 8);
            cstmt.setString(2, "linghuchong");
            cstmt.setString(3, "123456");
            cstmt.setByte(4, (byte) 1);
            // ִ�в�ѯ
            cstmt.execute();
            System.out.println("�ɹ������¼");

            // ///////////////////////////////////////////////////
            // �����з���ֵ�ĺ���
            cstmt = conn.prepareCall("{?=call changePwd(?,?)}");
            // ע��OUT����������
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            // ΪIN������ֵ
            cstmt.setString(2, "linghuchong");
            cstmt.setString(3, "888888");
            // ִ��
            cstmt.execute();
            // ͨ������������ȡ����ֵ
            int r = cstmt.getInt(1);
            System.out.println("�޸����룬����ֵΪ��" + r);

            // ///////////////////////////////////////////////////
            // ���ô�OUT�����Ĵ洢����
            cstmt = conn.prepareCall("{call getUserCount(?)}");
            // ע��OUT����������
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            // ִ��
            cstmt.execute();
            int count = cstmt.getInt(1);
            System.out.println("������Ϊ:" + count);
            // ///////////////////////////////////////////////////
            // ���ô�IN/OUT�����Ĵ洢����
            cstmt = conn.prepareCall("{call addSub(?,?)}");
            // ΪIN������ֵ
            cstmt.setInt(1, 8);
            cstmt.setInt(2, 6);
            // ע��OUT����������
            cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
            cstmt.registerOutParameter(2, java.sql.Types.INTEGER);
            cstmt.execute();
            // ͨ������������ȡ����ֵ
            int sum = cstmt.getInt(1);
            int sub = cstmt.getInt(2);
            System.out.println("��:" + sum + ",��:" + sub);

            // �ر�
            cstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}