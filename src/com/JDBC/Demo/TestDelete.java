package com.JDBC.Demo;

import com.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
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
            String sql = "delete from account where id = 3";
            //�ж��Ƿ����ɹ�������ɹ��᷵��Ӱ�������������ж������Ƿ����0����
            int i = st.executeUpdate(sql);
            if (i>0){
                System.out.println("ɾ���ɹ���");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,rs);//rs����û�õ�����������Ա���
        }
    }
}
