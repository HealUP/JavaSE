package com.Heimajinjie.Enum;

import static com.Heimajinjie.Enum.Season1.*;

//����ʹ��enum�ؼ��ֶ���ö����
/*
���÷���
1values()���������ʽ������ö��������ж���
2valueOf()
*ʵ�ֽӿ�
ԭ����ͨ���κ�һ��ö����Ķ����ܵ���show,����һ����
������ÿһ��ö����Ķ��󣬷ֱ���ó���һ����show �����ò�ͬ��ö����Ķ�����ñ���д�ĳ��󷽷���ִ�в�ͬ��Ч�����൱����ÿ��������д���󷽷���
*/
public class TestSeason1 {
    public static void main(String[] args) {
        Season1 autumn = Season1.AUTUMN;//��������
        System.out.println(autumn);
        autumn.show();
        System.out.println(autumn.getSeasonDesc());
        //1values()���������ʽ������ö��������ж���
        Season1[] season1s = Season1.values();
        for (int i = 0; i < season1s.length; i++) {
            System.out.println(season1s[i]);
        }

        //2����String���ͣ�valueOf����ö����Ķ���
        String str = "SUMMER";
        Season1 sea = Season1.valueOf(str);
        System.out.println(sea);
    }

    //3���߳�Ҳ��һ��ö���� ���Կ��� state
//        Thread.State[] states = Thread.State.values();.......

}
//ö����
enum Season1 implements Info{
    //4 ����ö����Ķ��� �͹�����public ��һ����ص� static �����޸� ����fianl(����Ķ�������Ϊpublic static fianl)
        SPRING ("spring","warm"){
            public void show(){
                System.out.println("���죡");
            }
    },
        SUMMER ("summer","hot"){
            public void show(){
                System.out.println("���죡");
            }

        },
        AUTUMN ("autumn","cool"){
            public void show(){
                System.out.println("���죡");
            }
        },
        SWINTER("winTer","cold"){
            public void show(){
                System.out.println("���죡");
            }
        };

    //1���ṩ������ԣ�����Ϊprivate final
    private final String seasonName;
    private final String seasonDesc;

    //������
    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //getter ͨ�������������������ԣ��������޸�  ��ΪΪfinal


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //toString

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
   /* public void show(){
        System.out.println("�ü��ڣ�");
    }
*/
















}
