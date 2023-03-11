package com.javaMysql.chapterTwo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;



public class SavepointDemo {

    public static void main(String[] args) {

        // ����DBUtil����
        DBUtil db = new DBUtil();
        Connection conn = null;
        // ������������
        Savepoint s1 = null;

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
            stmt.executeUpdate("INSERT INTO userdetails(id,username,password,sex) VALUES(13,'user13','12345',1)");

            // ���ñ����
            s1 = conn.setSavepoint();

            stmt.executeUpdate("INSERT INTO userdetails(id,username,password,sex) VALUES(14,'user14','13456',0)");
            stmt.executeUpdate("INSERT INTO userdetails(id,username,password,sex) VALUES(15,'user15','12456',1)");

            // �ع������
            if (true) {
                conn.rollback(s1);
            }

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
