package com.JDBC.Demo;

import com.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
* 1.��ȡ���ݿ���*/
public class TestInsert {
    public static void main(String[] args) {
       /*�ȶ���� ���ݿ���󣬲���sql���󣬽����,�˴�����ʾ��ʱ������������Խ�����ı��������ò���*/
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;


        try {
            //��ȡ���ݿ�����
            conn = jdbcUtils.getConnection();
            //��ȡsql��ִ�ж���
            st = conn.createStatement();
            //�����sql���
            String sql = "insert into account(id,`name`,`money`)"+"values(5,'��',600.00)";
            //�ж��Ƿ����ɹ�������ɹ��᷵��Ӱ�������������ж������Ƿ����0����
            int i = st.executeUpdate(sql);
            if (i>0){
                System.out.println("����ɹ���");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,rs);//rs����û�õ�����������Ա���
        }
    }
}
