package com.JDBC;

import com.utils.jdbcUtils;

import java.sql.*;

//sqlע������
/*��¼ҵ��ģ��*/
public class Sql {
    public static void main(String[] args) {
        login("dengzh","a123456");//��¼
//        login(" '' or '1=1","a123456");//SQLע��
    }
    public static void login(String name,String password) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        //�������ݿ�
        try {
            conn =jdbcUtils.getConnection();
            //����sql
            String sql = "select * from users where `name` =? and `password`=?";//ע��Ʈ`��˫���š���ʹ��
            st = conn.prepareStatement(sql);//����Statement���󣬽���Ԥ����
            //Ϊ�ʺŸ�ֵ
            st.setString(1,name);//�û�����name
            st.setString(2,password);//�û�����name
           //�����
            rs = st.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

