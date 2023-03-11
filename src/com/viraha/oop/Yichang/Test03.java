package com.viraha.oop.Yichang;

public class Test03 {

//    可能会存在异常的方法
  static void test(int a) throws ZdyYiChang {//抛出方法外

      System.out.println("传递的参数是："+a);
      if (a>10){
          throw new ZdyYiChang(a);//大于10抛出
      }
      System.out.println("没有问题！");//其他情况 则没有异常！

  }

    public static void main(String[] args) {
//      由于把异常抛出方法外，这里要捕获  用try,catch，接回来
        try {
            test(12);//捕获区域
        } catch (ZdyYiChang c) {
            System.out.println("zdyYiChang:"+c);//打印
        }
    }
}
//1、main方法中调用      test方法后   输出  System.out.println("传递的参数是："+a)
//2、走if语句。当a>10,抛出异常
//3、main方法中，try,catch 捕获异常，走catch里面的东西
//4、走to string 的东西