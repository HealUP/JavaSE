package com.Heimajinjie.javaIo.demo;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.Heimajinjie.javaIo.domain.Person;
/*对象写入到文件中,完成序列化,我们读不出对象信息,
但是有能读出这个对象的流,就是对象输入流
*/
public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
// 创建一个 ObjectOutputStream 对象输出流
        try (ObjectOutputStream obs = new ObjectOutputStream(new
                FileOutputStream("d:\\PersonObject.txt"))) {
// 创建一个 Person 类型的对象
            Person person = new Person("这个是对象输出流", 23, "广州工商学院");
// 把对象写入到文件中
            obs.writeObject(person);
            obs.flush();
            System.out.println("序列化完毕！");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
