package DataStruct.SparseArray;

public class SparseArrayDemo {
    /*0:没有棋子
    * 1：黑色子
    * 2：蓝色子*/
    public static void main(String[] args) {
        //创建一个原始的二维数组11*11
        int chessArray[][] = new int[11][11];
        //赋值
        chessArray[1][2] = 4;
        chessArray[2][3] = 2;
//        chessArray[5][9] = 29;
        //输出原始的二维数组
        System.out.println("原始二维数组！");
        for (int[] row : chessArray) {
            for (int data:row){//读取每一个以为数组的值
                System.out.printf("%d\t", data);//\t tab键
            }
            System.out.println();//输出完每一行的11个数就换行
        }

        //将二维数组转为稀疏数组
        /*1 先遍历二维数组，得到非零的个数
        * 2 创建对应的稀疏数组 */

        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0){
                    sum += 1;
                }
            }
        }
        System.out.println("非零值的个数为:"+sum);

        //2 根据非零值，来创建对应的稀疏数组
        int sparseArray[][] = new int[sum + 1][3];
        //给稀疏数组的第一行，即0行，赋值
        sparseArray[0][0] = 11;//行
        sparseArray[0][1] = 11;//列
        sparseArray[0][2] = sum;//非零值的个数
        //遍历二维数组，将非零值存放到稀疏数组中
        int count = 0;//记录是第几个非零数据  从0开始
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArray[i][j] != 0){//将非零值放入稀疏数组中
                    count++;
                   /* 一个非零值放到稀疏数组的行，需要三个值来确定：行总是从第一个非零值开始，即从1开始，再递增，
                   第1列记录非零值的行，第2列记录非零值的列，第3列记录非零值的值本身。
                    所以————>行的确定通过是第几个非零值来确定,列的确定分为三个，一个是非零值对应的第几行*/
                    sparseArray[count][0] = i;// count 就表示出现的第几个非零值，非零值对应的i 放到第一列
                    sparseArray[count][1] = j;// count 就表示出现的第几个非零值，非零值对应的j 放到第二列
                    sparseArray[count][2] = chessArray[i][j];//  第count个非零值的第三列对应的就是值本身
                }
            }
        }
        System.out.println();
        System.out.println("稀疏数组（达到压缩的效果）：");
        //输出稀疏数组
      /*  for (int i = 0; i < sparseArray.length; i++) {
            for (int j = 0; j < sparseArray.length; j++) {
                System.out.printf("%d\t",sparseArray[i][j]);
            }
            System.out.println();
        }*/

        //或者这样 更为严谨，因为不确定稀疏数组的行列是否一样
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",sparseArray[i][0],sparseArray[i][1],sparseArray[i][2]);
        }

        //2、稀疏数组转化为原始数组
        //读取稀疏数组的第一行，创建原始数组大小的数组
        int chessArray2[][] = new int [sparseArray[0][0]][sparseArray[0][1]];
        for (int i = 1; i < sparseArray.length; i++) {//第二行开始读
            //读取稀疏数组,把行列分别付给原始数组的行列，最后再把值写到原始数组的值里
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println("恢复的原始数组为：");
        for (int[] data : chessArray2) {
            for (int datum : data) {
                System.out.printf("%d\t",datum);
            }
            System.out.println();//换行
        }
    }
}
