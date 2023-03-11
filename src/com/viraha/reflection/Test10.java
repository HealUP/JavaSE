package com.viraha.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//通过反射获取泛型
/*
* 1、获取方法的泛型信息 先获取Class对象；再通过反射，getMethod()传入参数，获取指定的方法；Method接收，再通过该方法的getGenericParameterTypes()获取泛型，
* 再判断是否是一个结构化参数类型（ParameterizedType）；强转为ParameterizedType；最后通过getActualTypeArguments()获取实际的泛型
* 2、test02演示的是，获取方法的泛型信息 先获取Class对象；再通过反射，getMethod()传入参数，获取指定的方法；Method接收，由于该方法的返回值才有泛型
* 所以再通过该方法的getGenericReturnType()获取泛型，再判断是否是一个结构化参数类型（ParameterizedType）；强转为ParameterizedType；最后通过getActualTypeArguments()获取实际的泛型
* */
public class Test10 {
    //test01
    public void test01(Map<String,User> map,List<User> list){
        System.out.println("test01");

    }
    //test02 Map<String ,User>
    public Map<String ,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        //获取类的对象，再获取类的方法，比如方法test01
        Method me = Test10.class.getMethod("test01", Map.class, List.class);
        Type[] genericParameterTypes = me.getGenericParameterTypes();//获取泛型 即Map,和List
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("=="+genericParameterType
            );
            if(genericParameterType instanceof ParameterizedType){//判断是否是一个结构化参数类型呢，是的话，就强转过来，再继续获得真实的参数类型  数组接收
                //强转
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument
                    );
                }
            }
        }

        System.out.println("======================");
        //通过反射获取泛型 获取方法test02的
        me  = Test10.class.getMethod("test02",null);
        Type genericReturnType = me.getGenericReturnType();//返回值是泛型 ，只有一个，所以只用类型接收，不用数组
        if (genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();//List里面的泛型有两个类型 所有数组接收
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }


    }
}
