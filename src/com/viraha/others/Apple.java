package com.viraha.others;

public class Apple {
    private String color;
    private String kind;
    String changeColor;
    String changeKind;

    // 构造方法
    public Apple(String color, String kind) {
        this.color = color;
        this.kind = kind;
    }
    public void show(){
        System.out.println("构造方法赋值："+"颜色="+this.color+" 品种="+this.kind);

    }


}