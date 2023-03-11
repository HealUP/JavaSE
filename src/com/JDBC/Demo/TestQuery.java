package com.JDBC.Demo;

import com.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestQuery {
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
            String sql = "select * from account";
            //���ؽ����
            rs = st.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,rs);//rs����û�õ�����������Ա���
        }
    }
}
