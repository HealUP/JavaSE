package com.viraha.others;
//animal类
class animal{
    private String name;
    private int age;

    //含参数构造方法
    public animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    //get,set方法
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age = age;
    }
    //info1方法
    String info(){
       return "name:"+this.getName()+" age:"+this.getAge();
    }
}

class Dog extends animal{
    private String color;//子类私有属性
    public Dog(String name,int age,String color) {
        super(name, age);//调用父类的构造方法
//  子类自己的属性color
        this.setColor(color);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
    this.color = color;
}
 //子类中重写info（）方法，super关键字调用父类的方法
 public String info(){
    //调用父类的info()方法
    return super.info()+" 颜色："+this.getColor();//扩充父类的方法

 }
//super关键字调用父类的属性
    //子类中定义一个打印名字的方法

}

public class Animals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("lucky",2,"blue");//创建对象
        System.out.println(dog1.info());

    }

}