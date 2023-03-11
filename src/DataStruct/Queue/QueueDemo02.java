package DataStruct.Queue;

import java.util.Scanner;

//����ʵ��ѭ������
public class QueueDemo02 {
    public static void main(String[] args) {
        CircleArray arrayQueue = new CircleArray(3);
        char key = ' ';//�����û�����
        Scanner scanner = new Scanner(System.in);
        //����һ��ѭ���ı��
        boolean roll = true;
        while (roll) {
            System.out.println("\n����s����ʾ����");
            System.out.println("����a��������ݵ�����");
            System.out.println("����h���鿴��ͷ����");
            System.out.println("����g����ȡ����");
            System.out.println("����e���˳�����");
            //�����û������һ���ַ�
            System.out.println("==============�������Ӧ����ĸ����ѡ��======================");
            key = scanner.next().charAt(0);
            //ѡ�����
            switch (key) {
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'a':
                    System.out.println("������Ҫ��ӵ�����");
                    int value = scanner.nextInt();
                    arrayQueue.addQueue(value);
                    break;
                case 'g':

                    int ar = 0;
                    try {
                        ar = arrayQueue.getQueue();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());//�����쳣
                    }
                    //��ʾһ��
                    System.out.printf("����ȡ�������ǣ�%d\t", ar);
                    break;
                case 'h':
                    try {
                        int a = arrayQueue.headQueue();
                        System.out.printf("��ͷ�������ǣ�%d\t", a);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());//�����쳣
                    }
                    break;
                //�˳����˳�֮ǰ��Ҫ�ر�scanner
                case 'e':
                    scanner.close();
                    roll = false;//�˳�whileѭ��
                    break;//�˳�
                default:
                    break;
            }
        }
        System.out.println("�������˳���");
    }
}

//ʹ������ģ����У��ȱ�дһ����
class CircleArray {
    private int maxSize;//��ʾ������������
    private int front;//����ͷ
    private int rear;//����β
    private int[] arr;//������ݵ����飬ģ�����

    //�����ö��еĹ�����
    public CircleArray(int maxsize) {
        this.maxSize = maxsize;
        arr = new int[maxSize];
        //��ʼ����ͷ��β
        front = 0;//ָ����еĵ�һ��Ԫ�� ��ʼֵΪ0
        rear = 0;//ָ��������һ��Ԫ�صĺ�һ��λ�ã��ճ�һ���ռ���ΪԼ�� ��ʼֵΪ0
    }


    //�ж϶����Ƿ���
    public boolean isFull() {
        return (rear + 1) % maxSize == front;//��ȷ���true����֮
    }

    //�ж϶����Ƿ��
    public boolean isNull() {
        return rear == front;//��ͷָ���β
    }
    /*ʹ�ó�����*/
    // 1 ������ݵ�����
    public void addQueue(int n) {
        //������ж��Ƿ���
        if (isFull()) {
            System.out.println("��������������������ݣ�");
        }
        arr[rear] = n;//��ǰ��rear������ӽ�ȥ
        rear = (rear + 1) % maxSize;//�ƶ�rear
    }

    //1 ��ȡ��������
    public int getQueue() {
        //�ж��Ƿ�Ϊ��
        if (isNull()) {
            //�׳��쳣
            throw new RuntimeException("����Ϊ�գ����ܻ�ȡ���ݣ�");
        }
        //�ȱ���
        //����
        //��ӡ
        int value = arr[front];
        front = (front + 1) % maxSize; //����maxsize�˾ͻص����  ����
        return value;//frontָ����еĵ�һ��Ԫ��
    }

    //2 ��ʾ��ǰ�������е�����
    //������
    //�ж��Ƿ�Ϊ��
    public void showQueue() {
        if (isNull()) {
            System.out.println("����Ϊ�գ�û�����ݿ�����ʾ��");
            return;
        }
        //��front��ʼ������Ҫ�������ٸ�Ԫ���أ�
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d\n", i % maxSize, arr[i % maxSize]);
        }
    }

    //�鿴�����е���Чλ����
    public int size() {//rear = 1, front = 0,maxsize = 3
        return (rear  + maxSize- front) % maxSize;
    }


    //3 �鿴���е�ͷ�����ݣ�����ȡ��
    public int headQueue() {
        if (isNull()) {
            System.out.println("�ն��У�");
            throw new RuntimeException("����Ϊ�գ�");
        }
        return arr[front] + '\n';//����ͷָ���һ��Ԫ��

    }


}