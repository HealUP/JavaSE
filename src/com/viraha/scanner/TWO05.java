package com.viraha.scanner;
import java.util.Scanner;
public class TWO05 {
    //输入多个数字，求其总和和平均数，输入一个数字用回车确认，通过输入非数字来结束并输出执行结果：
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in );

        System.out.println("请输入数据：");
        double sum=0;
        int m=0;
        //通过循环判断是否还有输入，并且在里面对每一次进行求和统计、
        while (scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            m=m+1;
            sum=sum+x;
            System.out.println("你输入了第"+m+"个数据,当前总和为sum："+sum);
        }
        System.out.println(m +"个数的总和为："+sum);
        System.out.println(m +"个数的平均数为："+sum/m );
        scanner.close();

    }
}
