package com.Heimajinjie.Fanxing.Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//����һ�������� �� ����һ��map ��Ա��������ΪString���ͣ�ֵΪT����
public class DAO <T>{
    Map<String,T> map ;
    //����save���� �������Ԫ�ص�Map��
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //����get��������ȡid��Ӧ�Ķ��� T���͵�
    public T get(String id){
        return map.get(id);
    }
    //����Update����
    public void update(String id,T entity){
        map.put(id,entity);//ֱ�Ӹ���
    }
    // ����list����������map�д�ŵ�����T����ͨ���������ȡ��Ӧ��ֵ����ŵ�List
    public List<T> list(){
        //��������
        List<T> list = new ArrayList<>();
        //forѭ����ӽ�list
        for (String s:map.keySet()
             ) {
             list.add(map.get(s));
        }
        return list;
    }
    //����detele����
    public void delete(String id){
        map.remove(id);

    }
}
