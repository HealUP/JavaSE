package com.viraha.operator;//包

public class Demo04_LJYSF {
    public static void main(String[] args) {
        //and,or  逻辑运算符
        boolean a=true;
        boolean b=false;

        System.out.println("a&&b:"+(a&&b));//字符串 用双引号引起来，加了括号先算括号里面的
        System.out.println("a||b:"+(a||b));
        //短路运算
        int c=5;
        boolean d=(c<3)&&(c++<4);//执行完c<4后，c=c+1
        System.out.println(d);
        System.out.println(c);//c<3已经小于3了， 就是错的，后面不执行，
        // 如果执行了就会变成6




    }
}
