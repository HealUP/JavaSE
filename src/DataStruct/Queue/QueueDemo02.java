package DataStruct.Queue;

import java.util.Scanner;

//数组实现循环队列
public class QueueDemo02 {
    public static void main(String[] args) {
        CircleArray arrayQueue = new CircleArray(3);
        char key = ' ';//接收用户输入
        Scanner scanner = new Scanner(System.in);
        //定义一个循环的标记
        boolean roll = true;
        while (roll) {
            System.out.println("\n输入s：显示队列");
            System.out.println("输入a：添加数据到队列");
            System.out.println("输入h：查看队头数据");
            System.out.println("输入g：获取数据");
            System.out.println("输入e：退出程序");
            //接收用户输入的一个字符
            System.out.println("==============请输入对应的字母进行选择======================");
            key = scanner.next().charAt(0);
            //选择语句
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("请输入要添加的数：");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':

                    int ar = 0;
                    try {
                        ar = arrayQueue.getQueue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());//捕获异常
                    }
                    //提示一下
                    System.out.printf("您获取的数据是：%d\t", ar);
                    break;
                case 'h':
                    try {
                        int a = arrayQueue.headQueue();
                        System.out.printf("队头的数据是：%d\t", a);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());//捕获异常
                    }
                    break;
                //退出，退出之前，要关闭scanner
                case 'e':
                    scanner.close();
                    roll = false;//退出while循环
                    break;//退出
                default:
                    break;
            }
        }
        System.out.println("程序已退出！");
    }
}

//使用数组模拟队列，先编写一个类
class CircleArray {
    private int maxSize;//表示数组的最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//存放数据的数组，模拟队列

    //创建该队列的构造器
    public CircleArray(int maxsize) {
        this.maxSize = maxsize;
        arr = new int[maxSize];
        //初始化队头队尾
        front = 0;//指向队列的第一个元素 初始值为0
        rear = 0;//指向队列最后一个元素的后一个位置，空出一个空间作为约定 初始值为0
    }


    //判断队列是否满
    public boolean isFull() {
        return (rear + 1) % maxSize == front;//相等返回true，反之
    }

    //判断队列是否空
    public boolean isNull() {
        return rear == front;//队头指向队尾
    }
    /*使用场景：*/
    // 1 添加数据到队列
    public void addQueue(int n) {
        //添加先判断是否满
        if (isFull()) {
            System.out.println("队列已满，不能添加数据！");
        }
        arr[rear] = n;//当前的rear可以添加进去
        rear = (rear + 1) % maxSize;//移动rear
    }

    //1 获取队列数据
    public int getQueue() {
        //判断是否为空
        if (isNull()) {
            //抛出异常
            throw new RuntimeException("队列为空，不能获取数据！");
        }
        //先保存
        //后移
        //打印
        int value = arr[front];
        front = (front + 1) % maxSize; //大于maxsize了就回到起点  环形
        return value;//front指向队列的第一个元素
    }

    //2 显示当前队列所有的数据
    //即遍历
    //判断是否为空
    public void showQueue() {
        if (isNull()) {
            System.out.println("队列为空，没有数据可以显示！");
            return;
        }
        //从front开始遍历，要遍历多少个元素呢？
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    //查看队列中的有效位个数
    public int size() {//rear = 1, front = 0,maxsize = 3
        return (rear  + maxSize- front) % maxSize;
    }


    //3 查看队列的头部数据，而不取出
    public int headQueue() {
        if (isNull()) {
            System.out.println("空队列！");
            throw new RuntimeException("队列为空！");
        }
        return arr[front] + '\n';//队列头指向第一个元素

    }


}