package com.Heimajinjie.JavaApi.Date.DateFormat;
/*

 1、java.text.SimpleDateFormat extends DateFormat

 2、DateFormat类的两个成员方法
 String format(Date date)  和  Date parse (String source)

 3、DateFormat是一个抽象类，无法直接创建对象，可以使用其子类：SimpleDateFormat
 研究一个类，要研究他的构造方法： SimpleDateFormat(String pattern)  String pattern 是他的构造方法传递的参数   看看他传递的参数

 子类：SimpleDateFormat
 需要传递指定的模式  yyyy年MM月dd日  HH时mm分ss秒 转化成相应的日期和时间
 也可以 yyyy-MM-dd  HH-mm-ss
 模式：
 M 月   d   日   H   时
 m 分   s   秒

可以调用DateFormat中的两个成员方法

String format(Date date)  和  Date parse (String source)

  */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D01 {

    public static void main(String[] args) throws ParseException {
        demo01();
        demo02();
    }



    private static void demo01() {
        //1、创建子类（构造方法）SimpleDateFormat的对象 构造方法中传递指定模式
        SimpleDateFormat dar = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");

//    2、调用SimpleDateFormat对象中的format成员方法，按照构造方法中的模式转化为符合构造方法的字符串

        Date date= new Date();//format中传递的是Date类型，因此创建Date对象，再传递
        String d=dar.format(date);//Date()返回的是现在的时间，现在的时间转化成字符串

        System.out.println(date);//输出现在的时间
        System.out.println(d);//输出格式化后的时间
    }



    /*使用DateFormat 类中的方法parse  把文本解析为日期
    * 使用步骤：
    * 1、创建SimpleDateFormat对象，构造方法中指定传递模式
    * 2、调用SimpleDateFormat对象中的方法Parse,把符合构造方法中的字符串，解析为Date日期
    * 注意事项：
    * parse方法声明了一个异常叫做ParseException
    * 如果字符串和构造方法的模式不一样，那么程序就会抛出异常
    * 调用一个抛出了异常的方法，就必须处理，要么throws继续抛出这个异常，要么try catch  自己处理
    * */
    private static void demo02() throws ParseException {
        //1、创建子类（构造方法）SimpleDateFormat的对象 构造方法中传递指定模式
        SimpleDateFormat da = new SimpleDateFormat("yyyy年MM月dd日  HH时mm分ss秒");
//        返回的是Date
        Date date2=da.parse("2021年10月03日  12时12分47秒");

        System.out.println(date2);

    }


}
//Format->DateFormat是一个抽象类->子类SimpleDateFormat 子类中创建对象可以调用DateFormat类中的成员方法