package com.viraha.DuoXianCheng;
//��̬����ģʽ�ܽ� ��˼·���ǣ���Ҫ��飬���˰���ȥ�����飬ֻ��Ҫ������������
/*1����ʵ����ʹ������Ҫʵ��ͬһ���ӿ�
* 2��������������ʵ��ɫ
* 3���������������ܶ���ʵ���������˵����飬��ʵ����רע�����Լ�����
* */
public class StaticProxyDemo {
    public static void main(String[] args) {

        //ʵ�ֶ��̣߳�ʵ��Runnable�ӿ�   ����Ĵ�����������ʵ�������£��������ʵ����ʵ����ͬһ���ӿ� �磺 Thread ��new Runnable()��ʵ����Runnable�ӿ�
    /*    new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("i love you!");
            }*/
        //lambda���ʽ jdk8 ������
           new Thread(()->System.out.println("i love you")).start();
       //��������д��run()����
       // You you = new You();
        WeddingCommpany weddingCommpany = new WeddingCommpany(new You());//�������� ���뵽������
        weddingCommpany.GetMarry();//���õ��ǻ��칫˾�����ǽ�����you
        /* ���������д���򻯳�һ�д��룺new WeddingCommpany(new You()).GetMarry()*/
    }

}
//����һ�����Ľӿ�
interface Marry{
    void GetMarry();
}

//��ʵ��ɫ ʵ�ֽӿ�
class You implements Marry{
    //��ʵ��ɫרע�����Լ�������
    @Override
    public void GetMarry() {
        System.out.println("you����ˣ��ܿ��ģ�");
    }
}
//�����ɫ ���칫˾ ʵ�ֽӿ�
class WeddingCommpany implements Marry{
    private Marry target;//�������͵�target,��new You() ��������Ĵ��룩
    //���췽��
    public WeddingCommpany(Marry target) {
        this.target = target;
    }

    //��д����  �÷�����װ����ʵ�����request����
    @Override
    public void GetMarry() {
        before();//�������ʵ����û�еķ���
        target.GetMarry();//���õ��� ������
        after();//�������ʵ����û�еķ���
    }
    private void before() {
        System.out.println("���֮ǰ,�ﱸ����");
    }
    private void after() {
        System.out.println("���֮�󣬽���β�");
    }


}
