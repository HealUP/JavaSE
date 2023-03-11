package com.javaMysql.chapterTwo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;

//��ȡ���ݿ�汾�š��������͵�����

public class DatabaseMetaDataDemo {

    public static void main(String[] args) {
        try {
            // ����DBUtil����
            DBUtil db = new DBUtil();
            // ͨ���������ȡ���ݿ�����
            Connection conn = db.getConnection();
            System.out.println("���ӳɹ���");

            // ����DatabaseMetaData����
            DatabaseMetaData dmd = conn.getMetaData();

            System.out.println("���ݿ��Ʒ����" + dmd.getDatabaseProductName());
            System.out.println("���ݿ�汾�ţ�" + dmd.getDatabaseProductVersion());
            System.out.println("������������" + dmd.getDriverName());
            System.out.println("���ݿ�URL��" + dmd.getURL());

            // �ر�����
            db.closeAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}