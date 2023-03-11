package com.JDBC;

import com.utils.jdbcUtils;

import java.sql.*;

//sql注入问题
/*登录业务模拟*/
public class Sql {
    public static void main(String[] args) {
        login("dengzh","a123456");//登录
//        login(" '' or '1=1","a123456");//SQL注入
    }
    public static void login(String name,String password) {
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;

        //连接数据库
        try {
            conn =jdbcUtils.getConnection();
            //定义sql
            String sql = "select * from users where `name` =? and `password`=?";//注意飘`和双引号“的使用
            st = conn.prepareStatement(sql);//创建Statement对象，进行预编译
            //为问号赋值
            st.setString(1,name);//用户传的name
            st.setString(2,password);//用户传的name
           //结果集
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

