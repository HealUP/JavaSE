package com.Heimajinjie.JavaApi;

import java.util.Enumeration;
import java.util.Properties;

// ============System类的常用方法=========
/*1、arraycopy() 实现数组复制
*2、currentTimeMillis() 获取当前系统时间 表示当前时间与1970年1月1日0时0分0秒之间的时间差，单位时毫秒，也称为时间戳
*3、获取当前系统的全部属性（会返回一个Properties对象），getProperties(),再通过getProperty()根据属性名获取对应的属性值
* 4、gc（）垃圾回收机制，手动回收和自动回收，当对象的值为空时，jvm虚拟机自动回收垃圾
* */
public class TestSystem {

    //设置成静态的，和类一起加载，方便调用
    public static void test01(){//1、arraycopy() 实现数组复制
        int[] array01 = {1,4,5};
        int[] array02 = {3,5,7,9};
        System.arraycopy(array01,0,array02,1,3);
        //源数组，源数组起始位置，目标数组，目标数组起始位置，长度(根据复制的实际长度来，否则过大的话报错数组下标越界异常)
        System.out.println("复制后的数组元素为：");
        for (int i = 0; i < array02.length; i++) {
            System.out.println(i+":"+array02[i]);
        }
    }

    public static void test02(){//2、currentTimeMillis() 获取当前系统时间 表示当前时间与1970年1月1日0时0分0秒之间的时间差，单位时毫秒，也称为时间戳
        long startTime = System.currentTimeMillis();//开始时间
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();//结束时间
       long consume = endTime-startTime;
        System.out.println("for循环消耗的时间为："+consume+"毫秒！");


    }
    //
        public static void test03() {//3、获取当前系统的全部属性（会返回一个Properties对象），getProperties(),再通过getProperty()根据属性名获取对应的属性值
            Properties properties = System.getProperties();//获取全部属性
            //获取所有系统属性的key，返回Enumeration对象
            Enumeration propertyNames = properties.propertyNames();//获取properties的key值

            while (propertyNames.hasMoreElements()) {
                //读取key值
                String key = (String) propertyNames.nextElement();
                String value = System.getProperty(key);
                System.out.println(key+"---->"+value);
            }
        }

        //创建一个类
    static class St{//重写finalize()
        @Override
        public void finalize(){
            System.out.println("对象被作为垃圾回收了！");
        }
        }
    public static void main(String[] args) {
//        TestSystem.test01();
//        TestSystem.test02();
//        TestSystem.test03();
        St student1 = new St();
        St student2 = new St();
        //设置为null，让两个对象变为垃圾 观察系统自动回收的过程
        student1 = null;
        student2 = null;
        System.gc();
        //先手动回收
        for (int i = 0; i < 10000000; i++) {
            //此处的for循环用于延时观察  由于程序结束后，垃圾回收也会终止，想要观察，先延长程序运行的时间，才能观察到

        }


    }


}
