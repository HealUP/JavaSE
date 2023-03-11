package com.viraha.others.ChouxLDuotai;

public class testing {
    public static void main(String[] args) {
//        dog12 dog121 = new dog12();
//        Dongwu dongwu1 = dog121;
  //或者这样写多态  此处是 向上转型：子类->父类
        Dongwu dongwu1 = new dog12();
        //dongwu1.shout();
//此处是向下转型：父类->子类 在发生向下转型前必须先向上转型
        dog12 dog121 = (dog12)dongwu1;
        dog121.shout();
        dog121.eat();
    }

}
