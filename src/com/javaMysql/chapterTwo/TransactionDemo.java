package com.javaMysql.chapterTwo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

//��SavepointDemo�Ա�

public class TransactionDemo {
    public static void main(String args[]) throws ClassNotFoundException {
        // ����DBUtil����
        DBUtil db = new DBUtil();
        Connection conn = null;

        try {
            conn = db.getConnection();
            // ��ȡ�����Զ��ύ״̬
            boolean autoCommit = conn.getAutoCommit();
            System.out.println("�����Զ��ύ״̬��" + autoCommit);
            if (autoCommit) {
                // �ر��Զ��ύ,��������
                conn.setAutoCommit(false);
            }

            // ����Statement����
            Statement stmt = conn.createStatement();

            // ����DML���������
            stmt.executeUpdate("INSERT INTO userdetails(id,username,password,sex) VALUES(10,'user10','123456',0)");
            stmt.executeUpdate("INSERT INTO userdetails(id,username,password,sex) VALUES(11,'user11','123456',0)");
            // ��������Լ����������佫�׳��쳣
            stmt.executeUpdate("INSERT INTO userdetails(id,username,password,sex) VALUES(11,'user11','123456',0)");

            // ���˳��ִ�����ڴ��ύ
            conn.commit();
            // �ָ�ԭ�������ύ״̬
            conn.setAutoCommit(autoCommit);
            // �ر�����
            db.closeAll();
        } catch (Exception e) {
            // �����쳣
            if (conn != null) {
                try {
                    // �ع�
                    conn.rollback();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }
            e.printStackTrace();
        }
    }
}
