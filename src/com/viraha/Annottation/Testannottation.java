package com.viraha.Annottation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class Testannottation {//注解可以显示复制，如果没有，就必须设置默认值
    @MyAnnotation()//当设置了默认值,就可以不用填写具体的值  否则 需要添加

    public void test(){

    }
    @MyAnnotation2("")
    public void test1(){

    }
//元注解来定义注解
    @Target({ElementType.TYPE,ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation{
       // String name();//注解的参数 : 参数类型 + 参数名()
        String name() default "";

    }

    @interface MyAnnotation2{
        String value();//默认值是value()
    }
}
