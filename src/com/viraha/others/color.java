package com.viraha.others;

public class color {
    private String color;
    private String kind;

    public void setColor(String color) {
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;

    }
    public String getColor() {
        return color;
    }
    public String getKind() {
        return kind;
    }

    public void show2(){
        System.out.println("get,set方法赋值："+"颜色="+color+" 品种="+kind);

    }
}

