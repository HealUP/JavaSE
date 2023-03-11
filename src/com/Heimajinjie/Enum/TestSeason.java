package com.Heimajinjie.Enum;

public class TestSeason {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;//创建对象
        System.out.println(autumn);
        autumn.show();
        System.out.println(autumn.getSeasonDesc());

    }
}
class Season{
    //1、提供类的属性，声明为private final
    private final String seasonName;
    private final String seasonDesc;

    //构造器
    public Season(String seasonName, String seasonDesc) {
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
    public void show(){
        System.out.println("季节！");
    }

    //4、创建枚举类的对象 和公共的public 类一起加载的 static 不可修改 常量fianl(将类的对象声明为public static fianl)
    public static  final  Season SPRING = new Season("spring","warm");
    public static  final  Season SUMMER = new Season("summer","hot");
    public static  final  Season AUTUMN = new Season("autumn","cool");
    public static  final  Season WINTER = new Season("winTer","cold");

















}
