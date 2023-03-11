package com.Heimajinjie.Fanxing.Practice1;

import java.util.HashMap;
import java.util.List;

//创建DAO类的对象，传入User类型的数据，分别调用save,get,update,list,delete 来操作User对象
public class Test {


    public static void main(String[] args) {
       DAO<User> dao = new DAO<User>();//可省略User
       dao.map = new HashMap<String,User>();//map的初始化
        //插入User类型的元素,到Map集合中（双列集合）
       dao.save("1000",new User("01",20,"DENG"));
       dao.save("1001",new User("02",21,"ZHI"));
       dao.save("1002",new User("03",19,"HAO"));
       //获取id对应的值
        User user = dao.get("1002");
        System.out.println(user);//User接收，获取打印一下
        //更新值
        dao.update("1002",new User("04",21,"YA"));
        User user1 = dao.get("1002");//User接收，获取打印一下
        System.out.println(user1);
        //返回键对应的值
       List<User> list2= dao.list();//返回List类型
        System.out.println(list2);
        //删除
        dao.delete("1000");
        List<User> list3= dao.list();
        System.out.println(list3);

    }
}
