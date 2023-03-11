package com.javaMysql.chapterOne;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NIO2PathDemo {
	public static void main(String[] args) {
		// �Ե�ǰ·��������Path����
		Path path = Paths.get(".");
		System.out.println("path�������·��������" + path.getNameCount());
		System.out.println("path�ĸ�·����" + path.getRoot());
		// ��ȡpath��Ӧ�ľ���·����
		Path absolutePath = path.toAbsolutePath();
		System.out.println(absolutePath);
		// ��ȡ����·���ĸ�·��
		System.out.println("absolutePath�ĸ�·����" + absolutePath.getRoot());
		// ��ȡ����·����������·������
		System.out.println("absolutePath�������·��������"
				+ absolutePath.getNameCount());
		System.out.println(absolutePath.getName(3));
		// �Զ��String������Path����
		Path path2 = Paths.get("g:", "publish", "codes");
		System.out.println(path2);
	}
}
