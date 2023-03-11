package com.Heimajinjie.Jihe.Map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//古老的，线程安全的Map的实现类，测试其子类,实现类Properties，写jdbc.properties属性文件
//Hashtable:不建议使用，
//        -----Properties：处理属性文件，键值都是String
//案例演示：连接数据库，从属性文件获取用户名和密码  涉及到io流
public class TestHashTable {
    public void test06() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream(new File("jdbc.properties")));//载入文件 要把文件放到最外面
       String user =  properties.getProperty("user");
        System.out.println(user);
        String password = properties.getProperty("password");
        System.out.println(password);
    }


    //测试类
    public static void main(String[] args) {
        try {
            new TestHashTable().test06();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
