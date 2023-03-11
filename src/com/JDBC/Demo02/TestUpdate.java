package com.JDBC.Demo02;

import com.utils.jdbcUtils;

import java.sql.*;

public class TestUpdate {
    public static void main(String[] args) {
        /*�ȶ���� ���ݿ���󣬲���sql���󣬽����,�˴�����ʾ��ʱ������������Խ�����ı��������ò���*/
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;


        try {
            //��ȡ���ݿ�����
            conn = jdbcUtils.getConnection();
            //�����sql���
            String sql = "update account set money = 16400.00 where id = ?";
            //��ȡsql��ִ�ж���,����Ԥ����
            st = conn.prepareStatement(sql);
            //���ʺŸ�ֵ
            st.setInt(1,1);
            //�ж��Ƿ����ɹ�������ɹ��᷵��Ӱ�������������ж������Ƿ����0����
            int i = st.executeUpdate();
            if (i>0){
                System.out.println("���³ɹ���");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,rs);//rs����û�õ�����������Ա���
        }
    }
}
