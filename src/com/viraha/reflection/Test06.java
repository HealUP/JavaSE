package com.viraha.reflection;
//�������
public class Test06 {
    public static void main(String[] args) {
        //��ȡϵͳ��ļ����� classLoader
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        //��ȡϵͳ��������ĸ��������--> ����չ�������
        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);


        //��ȡ��չ��������ĸ��������-->����������c/c++д�ģ�
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);

        //��λ��ϵͳ���������Լ��ص�·��
        System.out.println(System.getProperty("java.class.path"));
        /*E:\environment\Java\jdk\jre\lib\charsets.jar;
        E:\environment\Java\jdk\jre\lib\deploy.jar;
        E:\environment\Java\jdk\jre\lib\ext\access-bridge-64.jar;
        E:\environment\Java\jdk\jre\lib\ext\cldrdata.jar;
        E:\environment\Java\jdk\jre\lib\ext\dnsns.jar;
        E:\environment\Java\jdk\jre\lib\ext\jaccess.jar;
        E:\environment\Java\jdk\jre\lib\ext\jfxrt.jar;
        E:\environment\Java\jdk\jre\lib\ext\localedata.jar;
        E:\environment\Java\jdk\jre\lib\ext\nashorn.jar;
        E:\environment\Java\jdk\jre\lib\ext\sunec.jar;
        E:\environment\Java\jdk\jre\lib\ext\sunjce_provider.jar;E:\environment\Java\jdk\jre\lib\ext\sunmscapi.jar;
        E:\environment\Java\jdk\jre\lib\ext\sunpkcs11.jar;
        E:\environment\Java\jdk\jre\lib\ext\zipfs.jar;
        E:\environment\Java\jdk\jre\lib\javaws.jar;
        E:\environment\Java\jdk\jre\lib\jce.jar;
        E:\environment\Java\jdk\jre\lib\jfr.jar;
        E:\environment\Java\jdk\jre\lib\jfxswt.jar;
        E:\environment\Java\jdk\jre\lib\jsse.jar;
        E:\environment\Java\jdk\jre\lib\management-agent.jar;
        E:\environment\Java\jdk\jre\lib\plugin.jar;
        E:\environment\Java\jdk\jre\lib\resources.jar;
        E:\environment\Java\jdk\jre\lib\rt.jar;
        E:\CODE\out\production\coding;
        E:\CODE\libs\mysql-connector-java-8.0.29.jar;
        E:\CODE\src\com\lib\commons-io-2.11.0.jar;
        E:\javajihuo\IntelliJ IDEA 2021.3\lib\idea_rt.jar
         */
    }
}
