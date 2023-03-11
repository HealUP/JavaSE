package com.javaMysql.chapterTwo;

import java.sql.ResultSet;
//�������ݿ⡢ִ�����ӡ����¡�ɾ������
public class DBDemo {

    public static void main(String[] args) {
        String selectSql = "SELECT id,username,password,sex FROM userdetails";
        String insertSql = "INSERT INTO userdetails(id,username,password,sex) VALUES(?,?,?,?)";
        String updateSql = "UPDATE userdetails SET password=? WHERE username=?";
        String deleteSql = "DELETE FROM userdetails WHERE username=?";
        // ����DBUtil����
        DBUtil db = new DBUtil();
        try {
            // �������ݿ�
            db.getConnection();

            ////////////////////////////////////////////////
            // ��ѯ����ʾԭ��������
            ResultSet rs = db.executeQuery(selectSql, null);
            System.out.println("---------ԭ��������---------");
            while (rs.next()) {
                System.out.println("�� " + rs.getRow() + ":"
                        + rs.getInt(1)+ "\t"
                        + rs.getString(2) + "\t"
                        + rs.getString(3) + "\t"
                        + (rs.getInt(4) == 1 ? "��" : "Ů"));
            }
            System.out.println("-------------------------");

            ////////////////////////////////////////////////
            // ִ�����
            int count = db.executeUpdate(insertSql, new String[] { "20", "Rose2",
                    "1234567", "1" });
            System.out.println("���" + count + "�У�");

            // ִ���޸�
            count = db.executeUpdate(updateSql, new String[] { "6876767","Tom2" });
            System.out.println("�޸�" + count + "�У�");

            // ִ��ɾ��
            count = db.executeUpdate(deleteSql, new String[] { "Rose" });
            System.out.println("ɾ��" + count + "�У�");

            ////////////////////////////////////////////////
            // ��ѯ����ʾ���º������
            rs = db.executeQuery(selectSql, null);
            System.out.println("---------���º������---------");
            while (rs.next()) {
                System.out.println("�� " + rs.getRow() + ":"
                        + rs.getInt(1)+ "\t"
                        + rs.getString(2) + "\t"
                        + rs.getString(3) + "\t"
                        + (rs.getInt(4) == 1 ? "��" : "Ů"));
            }
            System.out.println("-------------------------");
        } catch (Exception e) {
            // �ر�����
            db.closeAll();
            e.printStackTrace();
        }
    }

}
