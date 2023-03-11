package com.JDBC.Demo02;

import com.utils.jdbcUtils;

import java.sql.*;

public class TestQuery {
    public static void main(String[] args) {
        /*�ȶ���� ���ݿ���󣬲���sql���󣬽����,�˴�����ʾ��ʱ������������Խ�����ı��������ò���*/
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;//��ѯʹ�õ��˽����
        try {
            //��ȡ���ݿ�����
            conn = jdbcUtils.getConnection();
            //�����sql���
            String sql = "select * from account where id=?";
            //��ȡsql��ִ�ж���,����Ԥ����
            st = conn.prepareStatement(sql);
           //
            st.setInt(1,1);
            //���ؽ����
            rs = st.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("money"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,rs);//rs����û�õ�����������Ա���
        }
    }
}
