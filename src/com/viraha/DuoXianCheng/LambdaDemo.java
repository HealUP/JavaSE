package com.viraha.DuoXianCheng;
//Lambda表达式  本质是”“：单方法接口的实现类的实例
//1、 定义一个函数式接口：就是一个接口里面只有一个抽象方法
interface ILove{
    void lambdademo();
}
//2、实现类
class Like implements ILove {
    @Override
    public void lambdademo() {
        System.out.println("i like lambda!");
    }
}

//main()
public class LambdaDemo{
    //3、外面麻烦，把类放里面，即静态内部类 在一个类的内部
    static class Like2 implements ILove{
        @Override
        public void lambdademo() {
            System.out.println("静态内部类！i like lambda!");
        }
    }

    public static void main(String[] args) {

        ILove like = new Like();//自动转 向上转型 这个很重要  后面第5点那里，like的定义从这里来的，理解好向上转型
       /* like.lambdademo();

        Like2 like2 = new Like2();
        like2.lambdademo();
        //4、再麻烦，放到方法中，即局部(方法)内部类： 在一个方法内部
        class Like3 implements ILove{
            @Override
            public void lambdademo() {
                System.out.println("局部内部类 i like lambda!");
            }
        }
        Like3 like3 = new Like3();
        like3.lambdademo();*/
//5、为了更简便，简化写法，即匿名内部类  没有类的名字，必须借助 接口！或者父类！
        like = new ILove() {
            @Override
            public void lambdademo() {
                System.out.println("匿名内部类  i like lambda!");
            }
        };
        like.lambdademo();

//        6.最终简化版，即：只需要一个接口，采用lambda简化

        like = ()->{
            System.out.println("lambda 表达式 i like lambda！");
        };
        like.lambdademo();

    }

}

