package com.javaMysql.chapterOne;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterDemo {

	public static void main(String[] args) {
		// ����·�����ƴ���File����
		File file = new File("C:\\Program Files\\Java\\jdk1.8.0_05");
		// �õ��ļ����б�
		if (file.exists() && file.isDirectory()) {
			// ��ʾ��Ŀ¼�������ļ��б�
			String[] allFileNames = file.list();
			
			for (String name : allFileNames) {
				System.out.println(name);
			}
			System.out.println("--------------------");

			// ����FileNameFilter���͵������࣬����Ϊ�������뵽list()������
			String[] filterFileNames = file.list(new FilenameFilter() {
				public boolean accept(File dir, String name) {
					// ���ļ������й��ˣ��ļ����ĺ�׺Ϊ.zip��.txt
					return (name.endsWith(".zip") || name.endsWith(".txt"));
				}
			});
			System.out.println("���˺���ļ��б�");
			for (String name : filterFileNames) {
				System.out.println(name);
			}
		}

	}

}
