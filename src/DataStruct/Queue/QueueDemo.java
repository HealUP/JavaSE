package DataStruct.Queue;

import java.util.Scanner;

//���棺����ģ�����
public class QueueDemo {
    //���ԣ���������
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';//�����û�����
        Scanner scanner = new Scanner(System.in);
        //����һ��ѭ���ı��
        boolean roll = true;
        while (roll){
            System.out.println("\n����s����ʾ����");
            System.out.println("����a��������ݵ�����");
            System.out.println("����h���鿴��ͷ����");
            System.out.println("����g����ȡ����");
            System.out.println("����e���˳�����");
            //�����û������һ���ַ�
            System.out.println("==============�������Ӧ����ĸ����ѡ��======================");
            key = scanner.next().charAt(0);
            //ѡ�����
            switch (key){
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
                    System.out.printf("����ȡ�������ǣ�%d\t",ar);
                    break;
                case 'h':
                    try {
                        int a = arrayQueue.headQueue();
                        System.out.printf("��ͷ�������ǣ�%d\t",a);
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
class ArrayQueue{
    private int maxSize;//��ʾ������������
    private int front;//����ͷ
    private int rear;//����β
    private int[] arr;//������ݵ����飬ģ�����

    //�����ö��еĹ�����
    public ArrayQueue(int maxsize){
        this.maxSize = maxsize;
        arr = new int[maxSize];
        //��ʼ����ͷ��β
        front = -1;//����ͷ����ָ����Ƕ�ͷ��ǰһ��λ��
        rear = -1;//���е�β����ָ���β�����һ������
    }


    //�ж϶����Ƿ���
    public boolean isFull(){
        return rear == maxSize - 1;//��ȷ���true����֮
    }

    //�ж϶����Ƿ��
    public boolean isNull(){
        return rear == front;//��ͷָ���β
    }

    //������ݵ�����
    public void addQueue(int n){
        //������ж��Ƿ���
        if (isFull()){
            System.out.println("��������������������ݣ�");
        }
        rear++;//��rear����  ���Լ�дΪ arr[++rear]
        //����ö���
        arr[rear] = n;
    }
/*ʹ�ó�����*/
    //1 ��ȡ��������
    public int getQueue(){
        //�ж��Ƿ�Ϊ��
        if (isNull()){
            //�׳��쳣
            throw new RuntimeException("����Ϊ�գ����ܻ�ȡ���ݣ�");
        }
        front++;
        return arr[front];//front++ arr[front]
    }
    //2 ��ʾ��ǰ�������е�����
    //������
    //�ж��Ƿ�Ϊ��
    public void showQueue(){
        if (isNull()){
            System.out.println("����Ϊ�գ�û�����ݿ�����ʾ��");
            return ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\t\n",i,arr[i]);
        }
    }
    //3 �鿴���е�ͷ�����ݣ�����ȡ��
    public int headQueue(){
        if (isNull()){
            System.out.println("�ն��У�");
            throw new RuntimeException("����Ϊ�գ�");
        }
        return arr[front + 1]+'\n';//����ͷָ��ǰһ������  ����+1

    }


}