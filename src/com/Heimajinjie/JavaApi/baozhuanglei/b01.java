package com.Heimajinjie.JavaApi.baozhuanglei;

/*装箱，把基本类型的数据变->包装类
构造方法:
1、integer(int value),构造一个新分配的Integer对象，它表示指定的int值
2、integer(String s)，构造一个新分配的Integer对象，它表示String参数所指示的int值，传递的字符串必须是基本类型的字符串 100 √  a ×
静态方法：拆箱：在包装类中取出基本类型的数据
成员方法：int intValue()  int 类返回integer的值*/

//new的对象输出1，打印的1，说明重写了tostring方法
public class b01 {
    public static void main(String[] args) {
        //装箱
//       构造方法
        Integer int1 = new Integer(1);//传递数字
        System.out.println(int1);

        Integer int2 = new Integer("5");//传递字符串
        System.out.println(int2);
//        静态方法 valueof()
        Integer int3 = Integer.valueOf(2);
        System.out.println(int3);
//        拆箱:在包装类中取出基本类型的数据  intvalue()方法

        int i = int1.intValue();
        System.out.println(i);//打印1
        int a = int2.intValue();
        System.out.println(a);//打印5

    }


}