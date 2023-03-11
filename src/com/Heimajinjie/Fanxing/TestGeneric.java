package com.Heimajinjie.Fanxing;
/*泛型：1、在集合中使用泛型 本节
       2、自定义泛型类、泛型接口、泛型方法
       3、泛型与继承的关系
       4、通配符*/
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;


public class TestGeneric {
    /*1、集合中没有使用泛型的情况下:任何Object及其子类的对象都可以添加进来
     *2、泛型就是：对添加到集合中的对象进行类型的限制

    * */
  /*  public void test01(){
        List list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(13);
        list.add(12);
        //试图添加String类型的
        list.add(new String("aaaa"));

        for (int i = 0; i < list.size(); i++) {
            int score = (Integer)list.get(i);//获取指定位置的元素 拆箱
            System.out.println(score);//报错  calssCastExeption 类型转换异常
        }
    }
*/
    public void test02(){
        //1.1、使用泛型的情况下，假设限制存入该集合的元素类型时Integer
        List<Integer> list = new ArrayList<Integer>();
        list.add(96);
        list.add(94);
        list.add(96);
        //使用Iterator迭代器遍历
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }

    public void test03(){
        //1.2、Map集合为例子,常用类：HashMap，使用泛型
        Map<String,Integer> map = new HashMap<String,Integer>();//String,Integer可以不写
        map.put("aa",452);
        map.put("bb",453);
        map.put("cc",454);

        //遍历：通过entrySet()方法
        Set<Map.Entry<String,Integer>> set = map.entrySet();//Set来接收
        for (Map.Entry<String,Integer> me:set) {//增强for循环
            System.out.println(me.getKey()+"--->"+me.getValue());//自定义打印
        }
    }

    //        2、自定义泛型类的使用
    //注意：1、当实例化泛型类的对象时，要指明泛型的类型
    //     2、如果定义了泛型类，但是在实例化的时候没有使用泛型，那么就是默认类型：即Object类的，和集合中的使用是一样的。
    public void test04(){//传入一个Boolean类型的元素
        Order<Boolean> order = new Order<>();//Order没有定义实现的接口，new Order<>()即可.
        order.setT(true);
        System.out.println(order.getT());
        order.add();//将boolean的值添加到list中，是自定义的方法
        List<Boolean> list1 = order.list;//接收 true
        System.out.println(list1);


    }
    private void test05() {
        //2.1继承泛型类或接口时，可以看看List<E> extends Collection<E>
        //已经指明了是Integer类型的了
        Order order = new Order();
        order.add();//定义了添加6这个元素
        List<Integer> list2 = order.list;//调用List<T> list = new ArrayList<T>()，创建一个集合
        System.out.println(list2);
        //泛型方法的使用
        //当通过对象调用泛型方法时，指明泛型方法的类型
//       Integer i = order.getC(34);
//        Double d = order.getC(2.3);




    }
    private void test06(){
        //实现数组到集合的复制
        Integer[] in = new Integer[]{1,2,4,66};
        List<Integer> list1 = new ArrayList<>();
        Order order = new Order();
       List<Integer> list3 = order.fromArrayToList(in,list1);
        System.out.println(list3);
    }
//3、泛型与继承的关系(通配符的体现) 4、通配符？ 尖括号里面存放的类型 写为? List<?> :List<A>,List<B>，List<C>......都是List<?> 的子类
/*
* */
    private void test07(){
      List<String> list1 = new ArrayList<>();
      List<?> list = null;
      list = list1;//因为是其子类，所有可以这样


    }
    private void test08(){//可以读取声明为通配符的集合类的对象：当作Object类型来读
       List<String> list = new ArrayList<>();
       list.add("aaa");
       list.add("gbb");
       list.add("ddd");
       List<?> list2 = list;//list赋给list2
       //迭代器遍历
        Iterator<?> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



    }
    public static void main(String[] args) {
//        new TestGeneric().test01();
//        new TestGeneric().test02();
//        new TestGeneric().test03();
//        new TestGeneric().test04();
//        new TestGeneric().test05();
//        new TestGeneric().test07();
          new TestGeneric().test08();
    }


}
