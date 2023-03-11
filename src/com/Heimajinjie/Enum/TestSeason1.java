package com.Heimajinjie.Enum;

import static com.Heimajinjie.Enum.Season1.*;

//二、使用enum关键字定义枚举类
/*
常用方法
1values()以数组的形式，返回枚举类的所有对象，
2valueOf()
*实现接口
原本是通过任何一个枚举类的对象都能调用show,都是一样的
现在让每一个枚举类的对象，分别调用出不一样的show 可以让不同的枚举类的对象调用被重写的抽象方法，执行不同的效果（相当于让每个对象重写抽象方法）
*/
public class TestSeason1 {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;//创建对象
        System.out.println(autumn);
        autumn.show();
        System.out.println(autumn.getSeasonDesc());
        //1values()以数组的形式，返回枚举类的所有对象，
        Season1[] season1s = Season1.values();
        for (int i = 0; i < season1s.length; i++) {
            System.out.println(season1s[i]);
        }

        //2传入String类型，valueOf返回枚举类的对象
        String str = "SUMMER";
        Season1 sea = Season1.valueOf(str);
        System.out.println(sea);
    }

    //3、线程也有一个枚举类 可以看看 state
//        Thread.State[] states = Thread.State.values();.......

}
//枚举类
enum Season1 implements Info{
    //4 创建枚举类的对象 和公共的public 类一起加载的 static 不可修改 常量fianl(将类的对象声明为public static fianl)
        SPRING ("spring","warm"){
            public void show(){
                System.out.println("春天！");
            }
    },
        SUMMER ("summer","hot"){
            public void show(){
                System.out.println("夏天！");
            }

        },
        AUTUMN ("autumn","cool"){
            public void show(){
                System.out.println("秋天！");
            }
        },
        SWINTER("winTer","cold"){
            public void show(){
                System.out.println("冬天！");
            }
        };

    //1、提供类的属性，声明为private final
    private final String seasonName;
    private final String seasonDesc;

    //构造器
    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //getter 通过公共方法来调用属性，而不能修改  因为为final


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
   /* public void show(){
        System.out.println("好季节！");
    }
*/
















}
