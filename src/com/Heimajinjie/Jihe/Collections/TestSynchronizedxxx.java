package com.Heimajinjie.Jihe.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//�߳�ͬ������Ĺ��߷�����ֻҪ����Synchronizedxxx��������߳�ͬʱ����һ������ʱ������Synchronizedxxx�ܱ�֤�̰߳�ȫ
//Collections.synchronizedMap(map)��Collections.synchronizedList(list)

public class TestSynchronizedxxx {

    public static void main(String[] args) {
        List list = new ArrayList();
        Collections.synchronizedList(list);//��ɰ�ȫ��list��

}


}