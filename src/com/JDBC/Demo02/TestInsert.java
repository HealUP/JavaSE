package com.JDBC.Demo02;

import com.utils.jdbcUtils;

import java.sql.*;

public class TestInsert {
    public static void main(String[] args) {
        /*先定义好 数据库对象，操作sql对象，结果集,此代码演示的时插入操作，所以结果集的变量后面用不上*/
        Connection conn = null;
        PreparedStatement st = null;

        try {
            //获取数据库连接
            conn = jdbcUtils.getConnection();

            // 区别 使用?  先写sql不执行
            String sql = "insert into account(id,`name`,`money`) values (?,?,?)";
            //获取sql的执行对象时，进行预编译
            st = conn.prepareStatement(sql);
            //给？赋值
            st.setInt(1,3);//1 表示第一个参数，3表示该参数的值
            st.setString(2,"dengxm");
            st.setString(3,"900000.00");
            //判断是否插入成功，插入成功会返回影响的行数，因此判断行数是否大于0即可
            int i = st.executeUpdate();
            if (i>0){
                System.out.println("插入成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            jdbcUtils.release(conn,st,null);//rs这里没用到结果集  传一个null
        }
    }
}
