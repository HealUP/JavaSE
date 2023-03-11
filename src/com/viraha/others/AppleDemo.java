package com.viraha.others;
public class AppleDemo {
        public static void main(String[] args) {
            Apple apple1 = new Apple("鲜红色","冰糖心");//有参构造方法赋初值
            apple1.show();
            color color1=new color();
            color1.setColor("红色");
            color1.setKind("粉沙");
            color1.getColor();
            color1.show2();
            apple1.changeColor="红色";
            apple1.changeKind="红富士";

            System.out.println("创建对象赋初值"+"颜色："+ apple1.changeColor+"品种:"+apple1.changeKind);

    }
}
