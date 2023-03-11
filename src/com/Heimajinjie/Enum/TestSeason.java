package com.Heimajinjie.Enum;

public class TestSeason {
    public static void main(String[] args) {
        Season autumn = Season.AUTUMN;//��������
        System.out.println(autumn);
        autumn.show();
        System.out.println(autumn.getSeasonDesc());

    }
}
class Season{
    //1���ṩ������ԣ�����Ϊprivate final
    private final String seasonName;
    private final String seasonDesc;

    //������
    public Season(String seasonName, String seasonDesc) {
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
    public void show(){
        System.out.println("���ڣ�");
    }

    //4������ö����Ķ��� �͹�����public ��һ����ص� static �����޸� ����fianl(����Ķ�������Ϊpublic static fianl)
    public static  final  Season SPRING = new Season("spring","warm");
    public static  final  Season SUMMER = new Season("summer","hot");
    public static  final  Season AUTUMN = new Season("autumn","cool");
    public static  final  Season WINTER = new Season("winTer","cold");

















}
