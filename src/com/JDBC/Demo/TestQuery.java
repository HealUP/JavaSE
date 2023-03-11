package com.JDBC.Demo;

import com.utils.jdbcUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestQuery {
    public static void main(String[] args) {
        /*先定义好 数据库对象，操作sql对象，结果集,此代码演示的时插入操作，所以结果集的变量后面用不上*/
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            //获取数据库连接
            conn = jdbcUtils.getConnection();
            //获取sql的执行对象
            st = conn.createStatement();
            //插入的sql语句
            String sql = "select * from account";
            //返回结果集
            rs = st.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,rs);//rs这里没用到结果集，所以报黄
        }
    }
}
