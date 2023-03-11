package com.javaMysql.chapterOne;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//���л�
public class ObjectOutputStreamDemo {

	public static void main(String[] args) {

		// ����һ��ObjectOutputStream���������
		try (ObjectOutputStream obs = new ObjectOutputStream(new FileOutputStream("d:\\PersonObject.txt"))) {
			// ����һ��Person���͵Ķ���
			Person person = new Person("����", 25, "�ൺ");
			// �Ѷ���д�뵽�ļ���
			obs.writeObject(person);
			obs.flush();
			System.out.println("���л���ϣ�");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
