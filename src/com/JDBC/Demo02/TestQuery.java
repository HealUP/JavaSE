package com.JDBC.Demo02;

import com.utils.jdbcUtils;

import java.sql.*;

public class TestQuery {
    public static void main(String[] args) {
        /*先定义好 数据库对象，操作sql对象，结果集,此代码演示的时插入操作，所以结果集的变量后面用不上*/
        Connection conn = null;
        PreparedStatement st = null;
        ResultSet rs = null;//查询使用到了结果集
        try {
            //获取数据库连接
            conn = jdbcUtils.getConnection();
            //插入的sql语句
            String sql = "select * from account where id=?";
            //获取sql的执行对象,进行预编译
            st = conn.prepareStatement(sql);
           //
            st.setInt(1,1);
            //返回结果集
            rs = st.executeQuery();

            while(rs.next()){
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("money"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,rs);//rs这里没用到结果集，所以报黄
        }
    }
}
