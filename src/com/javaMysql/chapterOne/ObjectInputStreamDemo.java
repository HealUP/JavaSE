package com.javaMysql.chapterOne;


import java.io.FileInputStream;
import java.io.ObjectInputStream;

//�����л�
public class ObjectInputStreamDemo {

	public static void main(String[] args) {

		// ����һ��ObjectInputStream����������
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:\\PersonObject.txt"))) {
			// ��ObjectInputStream�����������ж�ȡһ�����󣬲�ǿ��ת����Person����
			Person person =(Person)ois.readObject();	
			System.out.println("���л���ϣ������Ķ�����Ϣ���£�");
			System.out.println(person);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
