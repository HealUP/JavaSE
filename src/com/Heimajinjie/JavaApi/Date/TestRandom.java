package com.Heimajinjie.JavaApi.Date;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

//Random类
/*常用方法
* 1、构造方法
* 2、指定范围：nextInt(int n)
* 3、不指定范围：nextInt()
* 4、不指定范围：nextFloat()
* 5、不指定范围：nextDouble()*/
public class TestRandom {
    //无参构造方法
    public static void main(String[] args) {
        Random rt = new Random();//不传入种子
        //随机产生2个[0,59）的数，不包括59
        for (int i = 0; i < 2; i++) {
//            System.out.println("随机数："+rt.nextInt(59));//[0,59）

            //有参构造
            Random r = new Random(2);
            for (int i1 = 0; i1 < 2; i1++) {
                System.out.println("随机数："+r.nextInt(59));//两组一样的随机数  因为传入了种子
            }
        }

    }
}
