package com.Heimajinjie.Fanxing.Practice1;

import java.util.HashMap;
import java.util.List;

//����DAO��Ķ��󣬴���User���͵����ݣ��ֱ����save,get,update,list,delete ������User����
public class Test {


    public static void main(String[] args) {
       DAO<User> dao = new DAO<User>();//��ʡ��User
       dao.map = new HashMap<String,User>();//map�ĳ�ʼ��
        //����User���͵�Ԫ��,��Map�����У�˫�м��ϣ�
       dao.save("1000",new User("01",20,"DENG"));
       dao.save("1001",new User("02",21,"ZHI"));
       dao.save("1002",new User("03",19,"HAO"));
       //��ȡid��Ӧ��ֵ
        User user = dao.get("1002");
        System.out.println(user);//User���գ���ȡ��ӡһ��
        //����ֵ
        dao.update("1002",new User("04",21,"YA"));
        User user1 = dao.get("1002");//User���գ���ȡ��ӡһ��
        System.out.println(user1);
        //���ؼ���Ӧ��ֵ
       List<User> list2= dao.list();//����List����
        System.out.println(list2);
        //ɾ��
        dao.delete("1000");
        List<User> list3= dao.list();
        System.out.println(list3);

    }
}
