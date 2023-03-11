package com.javaMysql.chapterTwo;
import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.Statement;
//连接数据库，读出数据
public class JDBCDemo {
    public static void main(String[] args) throws Exception{
        //注册驱动
// Class.forName("com.mysql.jdbc.Driver");               //JDBC5之后可以不用注册驱动
        //获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadata","root","Dzh441826");
        //定义sql语句
       String sql= "select * from javadata.user;";
        //获取执行sql的对象Statement*/

        Statement stmt = conn.createStatement();
        //执行sql
        ResultSet resultSet = stmt.executeQuery(sql);

        //处理结果
        while(resultSet.next()) {                                     //让游标移动到下一行,true 表示有数据行,可以到下一行
            int id = resultSet.getInt(1);                    //获取id
            String NAME = resultSet.getString("NAME");             //获取姓名
            System.out.println("id:" + id + " name:" +NAME );
        }
        //释放资源
        stmt.close();//释放执行sql的资源
        conn.close();//释放连接的资源
    }
}

/*1、DriverManager:驱动管理器(注册驱动，获取数据库连接)
        获取数据库连接对象：DriverManager.getConnection(String url,String user,String password);
        url语法：jdbc:mysql://ip地址(域名):端口号/数据库名称(若为主机，ip地址和端口号可以不写)
        2、Connection:数据库连接对象
        功能：(1)获取sql对象：Statement createStatement();
        PreparedStatement preparedStatement(String sql);
        (2)管理事务：开启事务：setAutoCommit(boolean autoCommit):调用方法设置参数为false，即开启事务
        提交事务；commit();
        回滚事务：rollback();
        3、Statement:执行sql数据库
        获取sql的对象：
        boolean execute(String sql);   可以执行任意的sql （了解）
        int executeUpdate(String sql);   执行DML(insert,update,delete)、DDL(create,alter,drop)语句返回值影响行数，通过行数判断是否执行成功
        ResultSet executeQuery(String sql);   执行DDL(select)语句
        4、ResultSet:结果集对象
        next();         游标向下一定一行
        getXxx();      获取数据，如：getInt(),getDouble();    代表列的数据类型
        参数：int 如getString(1);   代表列的编号
        String 如 getDouble("balance");     代表列的名称
        点击运行就能正常输出数据库的信息了。*/

/*


        （3）注意事项
        1.JDBC5之后可以不用注册驱动，不写也行

        2.如果不能正常显示中文，在 jdbc:mysql://localhost:3306/××× 的l后面添加“?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8”即可

        3.如果出现“No suitable driver found for jdbc:mysql://localhost:3306/×××”的报错信息，注意看是否成功导入了mysql的jar包，即3（2）这一步。如果反复导入都不行，打开“Project Structure...”
        选择 Modules --> 你的项目(mysql) --> Dependencies --> + ，选择已下载的mysql的jar包，导入即可。*/
