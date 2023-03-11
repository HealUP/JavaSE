package com.viraha.Arrays;

public class A09 {
    public static void main(String[] args) {
        //1、创建一个二维数组，11*11   0：没有棋子   1：白棋  2：、黑棋
        int [][] b= new int [11][11];//创建二维数组
        b[1][2]=1;
        b[2][4]=1;
        //输出原始的数组
        System.out.println("输出原始的数组：");
//二维数组    增强for循环
        for (int [] a:b) {
            for (int c:a) {
                System.out.print(c+"\t");
            }
            System.out.println();

        }
//转化为稀疏数组保存
//        1、获取有效值的个数
        int sum=0;

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (b[i][j]!=0){
                    sum++;//记录有效值  不为0
                }
            }
        }
        System.out.println("有效值的个数是："+sum);
//2、创建一个稀疏数组，确定行数，为有效值加1，  列数就是3，包括行列值三个关键字

        int[][]array2=new int[sum+1][3];//稀疏数组的行数等于有效值的个数加1   即sum+1
        array2[0][0]=11;//行数
        array2[0][1]=11;//列数
        array2[0][2]=sum;//有效值的个数
//        3、遍历二维数组，将非零的值存到稀疏数组中
        int count=0;
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
               if (b[i][j]!=0) {
                   count++;//count  是从1开始的  不是从0
                   array2[count][0] = i;//稀疏数组第一行第0列记录 行数

                   array2[count][1] = j;//第二行第1列记录  列数

                   array2[count][2] = b[i][j];//第三行第2列记录 有效值
               }
            }

        }
//        4、输出稀疏数组
        System.out.println("稀疏数组：");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0]+"\t"+array2[i][1]+"\t"+array2[i][2]+"\t");

        }


        //还原稀疏数组
//        1、读取稀疏数组

        int [][]array3=new int[array2[0][0]][array2[0][1]];//即11 行  11 列
//        把稀疏数组中的值赋值给新创建的数组，从而还原
        for (int i = 1; i < array2.length; i++) {//从1开始是因为第0行是 行 列 值这三个字段
            array3[array2[i][0]][array2[i][1]]=array2[i][2];//array3[1][2]=1  array3[2][4]=1

        }
//        3、打印还原后的数组
        System.out.println("打印还原后的数组:2");
        for (int []ints:array3) {
            for (int anint:ints) {
                System.out.print(anint+"\t");
            }
            System.out.println();

        }

    }
}
