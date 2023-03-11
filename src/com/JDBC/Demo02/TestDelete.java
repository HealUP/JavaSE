package com.JDBC.Demo02;

import com.utils.jdbcUtils;

import java.sql.*;

public class TestDelete {
    public static void main(String[] args) {
        /*�ȶ���� ���ݿ���󣬲���sql���󣬽����,�˴�����ʾ��ʱ������������Խ�����ı��������ò���*/
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        try {
            //��ȡ���ݿ�����
            conn = jdbcUtils.getConnection();
            //��������sql���
            String sql = "delete from account where id = ?";
            //��ȡsql��ִ�ж���ʱ����Ԥ����
            st = conn.prepareStatement(sql);
            //���ʺ� ��������ֵ
            st.setInt(1,4);
            //�ж��Ƿ����ɹ�������ɹ��᷵��Ӱ�������������ж������Ƿ����0����
            int i = st.executeUpdate();
            if (i>0){
                System.out.println("ɾ���ɹ���");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,null);//rs����û�õ������
        }
    }
}
