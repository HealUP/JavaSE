package com.JDBC.Demo02;

import com.utils.jdbcUtils;

import java.sql.*;

public class TestInsert {
    public static void main(String[] args) {
        /*�ȶ���� ���ݿ���󣬲���sql���󣬽����,�˴�����ʾ��ʱ������������Խ�����ı��������ò���*/
        Connection conn = null;
        PreparedStatement st = null;

        try {
            //��ȡ���ݿ�����
            conn = jdbcUtils.getConnection();

            // ���� ʹ��?  ��дsql��ִ��
            String sql = "insert into account(id,`name`,`money`) values (?,?,?)";
            //��ȡsql��ִ�ж���ʱ������Ԥ����
            st = conn.prepareStatement(sql);
            //������ֵ
            st.setInt(1,3);//1 ��ʾ��һ��������3��ʾ�ò�����ֵ
            st.setString(2,"dengxm");
            st.setString(3,"900000.00");
            //�ж��Ƿ����ɹ�������ɹ��᷵��Ӱ�������������ж������Ƿ����0����
            int i = st.executeUpdate();
            if (i>0){
                System.out.println("����ɹ���");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,null);//rs����û�õ������  ��һ��null
        }
    }
}
