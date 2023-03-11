package com.javaMysql.chapterOne;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// �Ե�ǰ·��������һ��File����,"."����ǰ·��
		File file = new File(".");
		// ֱ�ӻ�ȡ�ļ��������"."
		System.out.println(file.getName());
		// ��ȡ���·���ĸ�·�����ܳ�������������null
		System.out.println(file.getParent());
		// ��ȡ����·��
		System.out.println(file.getAbsoluteFile());
		// ��ȡ��һ��·��
		System.out.println(file.getAbsoluteFile().getParent());
		// ��ָ�����ļ�������File����
		File newFile = new File("C:\\qst.txt");
		System.out.println("newFile�����Ƿ���ڣ�" + newFile.exists());
		try {
			// ��ָ��newFile����������һ���ļ�
			newFile.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// ��newFile����������һ��Ŀ¼����ΪnewFile�Ѿ�����
		// �������淽������false�����޷�������Ŀ¼
		System.out.println("����Ŀ¼��"+newFile.mkdir());
		// ʹ��list()�������г���ǰ·���µ������ļ���·��
		String[] fileList = file.list();
		System.out.println("====��ǰ·���������ļ���·������====");
		for (String fileName : fileList) {
			System.out.println(fileName);
		}
		// listRoots()��̬�����г����еĴ��̸�·����
		File[] roots = File.listRoots();
		System.out.println("====ϵͳ���и�·������====");
		for (File root : roots) {
			System.out.println(root);
		}

	}

}
