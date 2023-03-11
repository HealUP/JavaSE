package com.Heimajinjie.JavaApi;

import java.util.Enumeration;
import java.util.Properties;

// ============System��ĳ��÷���=========
/*1��arraycopy() ʵ�����鸴��
*2��currentTimeMillis() ��ȡ��ǰϵͳʱ�� ��ʾ��ǰʱ����1970��1��1��0ʱ0��0��֮���ʱ����λʱ���룬Ҳ��Ϊʱ���
*3����ȡ��ǰϵͳ��ȫ�����ԣ��᷵��һ��Properties���󣩣�getProperties(),��ͨ��getProperty()������������ȡ��Ӧ������ֵ
* 4��gc�����������ջ��ƣ��ֶ����պ��Զ����գ��������ֵΪ��ʱ��jvm������Զ���������
* */
public class TestSystem {

    //���óɾ�̬�ģ�����һ����أ��������
    public static void test01(){//1��arraycopy() ʵ�����鸴��
        int[] array01 = {1,4,5};
        int[] array02 = {3,5,7,9};
        System.arraycopy(array01,0,array02,1,3);
        //Դ���飬Դ������ʼλ�ã�Ŀ�����飬Ŀ��������ʼλ�ã�����(���ݸ��Ƶ�ʵ�ʳ��������������Ļ����������±�Խ���쳣)
        System.out.println("���ƺ������Ԫ��Ϊ��");
        for (int i = 0; i < array02.length; i++) {
            System.out.println(i+":"+array02[i]);
        }
    }

    public static void test02(){//2��currentTimeMillis() ��ȡ��ǰϵͳʱ�� ��ʾ��ǰʱ����1970��1��1��0ʱ0��0��֮���ʱ����λʱ���룬Ҳ��Ϊʱ���
        long startTime = System.currentTimeMillis();//��ʼʱ��
        int sum = 0;
        for (int i = 0; i < 100000000; i++) {
            sum += i;
        }
        long endTime = System.currentTimeMillis();//����ʱ��
       long consume = endTime-startTime;
        System.out.println("forѭ�����ĵ�ʱ��Ϊ��"+consume+"���룡");


    }
    //
        public static void test03() {//3����ȡ��ǰϵͳ��ȫ�����ԣ��᷵��һ��Properties���󣩣�getProperties(),��ͨ��getProperty()������������ȡ��Ӧ������ֵ
            Properties properties = System.getProperties();//��ȡȫ������
            //��ȡ����ϵͳ���Ե�key������Enumeration����
            Enumeration propertyNames = properties.propertyNames();//��ȡproperties��keyֵ

            while (propertyNames.hasMoreElements()) {
                //��ȡkeyֵ
                String key = (String) propertyNames.nextElement();
                String value = System.getProperty(key);
                System.out.println(key+"---->"+value);
            }
        }

        //����һ����
    static class St{//��дfinalize()
        @Override
        public void finalize(){
            System.out.println("������Ϊ���������ˣ�");
        }
        }
    public static void main(String[] args) {
//        TestSystem.test01();
//        TestSystem.test02();
//        TestSystem.test03();
        St student1 = new St();
        St student2 = new St();
        //����Ϊnull�������������Ϊ���� �۲�ϵͳ�Զ����յĹ���
        student1 = null;
        student2 = null;
        System.gc();
        //���ֶ�����
        for (int i = 0; i < 10000000; i++) {
            //�˴���forѭ��������ʱ�۲�  ���ڳ����������������Ҳ����ֹ����Ҫ�۲죬���ӳ��������е�ʱ�䣬���ܹ۲쵽

        }


    }


}
