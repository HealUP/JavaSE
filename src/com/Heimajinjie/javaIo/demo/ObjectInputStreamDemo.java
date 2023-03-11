package com.Heimajinjie.javaIo.demo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import com.Heimajinjie.javaIo.domain.Person;
public class ObjectInputStreamDemo {
    public static void main(String[] args) {
// 创建一个 ObjectInputStream 对象输入流
        try (ObjectInputStream ois = new ObjectInputStream(new
                FileInputStream("d:\\PersonObject.txt"))) {
// 从 ObjectInputStream 对象输入流中读取一个对象，并强制转换成 Person 对象
            Person person =(Person)ois.readObject();
            System.out.println("序列化完毕！读出的对象信息如下：");
            System.out.println(person);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
