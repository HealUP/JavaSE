package com.Heimajinjie.object;

public class Equals02 {
    public static void main(String[] args) {
//        Person01类默认继承Object类，所以可以使用Object类其中的equals方法
/*        方法源码:
        public boolean equals(Object obj) {
                  return (this == obj);
                  }
        解析：
        this  谁调用的equals ,this就是哪个对象
        obj   传递过来的参数
   }*/
//
//        创建两个对象  由于是有参 构造，所以要赋值
        Person01 p1 = new Person01("java", 10);
        Person01 p2 = new Person01("python", 10);
        System.out.println("p1：" + p1);
        System.out.println("p2：" + p2);

        boolean b = p1.equals(p2);

        System.out.println(b);

    }
}
