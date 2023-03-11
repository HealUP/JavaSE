package com.Heimajinjie.object;

import java.util.Objects;

public class Objects0 {
    public static void main(String[] args) {
//        空不能调用方法，会抛出空指针异常
        String s1 = null;
        String s2 = "A";
//        boolean b=s1.equals(s2);
/*objects源码
 public static boolean equals(Object a, Object b) {
       return (a == b) || (a != null && a.equals(b));
  }*/
        boolean c = Objects.equals(s1, s2);
        System.out.println(c);

    }
}
