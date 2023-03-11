package com.viraha.DuoXianCheng;

/* 2022.7.4（和lambda案例对照）lambda案例  思路：按照：先定义一个接口，然后写一个实现类，变换它的位置
形成 1静态内部类 2局部内部类 3匿名内部类 4lambda表达式，逐一理解！ 多敲几次！*/
public class LambdaDemo02 {

        public static void main(String[] args) {
          class Love implements I {
                @Override
                public void love(int a) {
                    System.out.println("i love you " + a);
                }
            }
            I love = new Love();
            // 向上转型  父类是接口I
            /* I love = new I() {
                @Override
                public void love(int a) {
                    System.out.println("i love you " + a);
                }
            };
            love.love(2);*/
            //6.简化版，即：只需要一个接口，采用lambda简化
            /*I love = (int a)->{
                System.out.println("i love you " + a);
            };*/
            //简化括号内的参数，lambda表达式
            /*love = (a)->{
                System.out.println("i love you " + a);
            };
            love.love(5201314);
            * */
            //继续简化括号，lambda表达式
           /* love = a->{
                System.out.println("i love you " + a);
            };
            love.love(5201314);*/
            //因为只有一行语句，所以可以继续简化花括号，lambda表达式
            love = a->
                System.out.println("i love you " + a);
                love.love(5201314);

                /*总结：
                * 1、一行语句，可以省略掉花括号，多行则要用代码块包裹
                * 2、使用lambda表达式的前提是，接口为函数式接口 (一个接口，只含一个方法；向上转型，实例化对象；最后采用lambda表达式)
                * 3、多个参数，也可以去掉参数类型*/
        }
    }

interface I{
    void love (int a);

};

