package com.viraha.oop.jieKou;
//������
public class ceShi {
    public static void main(String[] args) {
        UserServiceImpl userService1 = new UserServiceImpl();
        userService1.delete("������д�˽ӿڵķ�����");
        userService1.add("������д�˽ӿڵķ�����");
        userService1.query("������д�˽ӿڵķ�����");
        userService1.update("������д�˽ӿڵķ�����");
        userService1.timer();
    }
}
