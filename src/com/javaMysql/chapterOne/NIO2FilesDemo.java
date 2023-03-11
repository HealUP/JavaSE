package com.javaMysql.chapterOne;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NIO2FilesDemo {
	public static void main(String[] args) {
		try {
			// �����ļ�
			Files.copy(
					Paths.get("src\\com\\qst\\chapter01\\NIO2FilesDemo.java"),
					new FileOutputStream("a.txt"));
			// �ж�NIO2FilesDemo.java�ļ��Ƿ�Ϊ�����ļ�
			System.out.println("NIO2FilesDemo.java�Ƿ�Ϊ�����ļ���"
					+ Files.isHidden(Paths
							.get("src/com/qst/chapter09/NIO2FilesDemo.java")));
			// һ���Զ�ȡFilesTest.java�ļ���������
			List<String> lines = Files.readAllLines(Paths.get("src", "com",
					"qst", "chapter09", "NIO2FilesDemo.java"), Charset
					.forName("gbk"));
			System.out.println("������" + lines.size());
			// �ж�ָ���ļ��Ĵ�С
			System.out.println("a.txt�ļ��Ĵ�СΪ��" + Files.size(Paths.get("a.txt")));
			List<String> poem = new ArrayList<>();
			poem.add("ʹ��NIO.2����");
			poem.add("���ļ���д����");
			// ֱ�ӽ�����ַ�������д��ָ���ļ���
			Files.write(Paths.get("pome.txt"), poem, Charset.forName("gbk"));
			FileStore cStore = Files.getFileStore(Paths.get("C:"));
			// �ж�C�̵��ܿռ䣬���ÿռ�
			System.out.println("C:���пռ䣺" + cStore.getTotalSpace());
			System.out.println("C:���ÿռ䣺" + cStore.getUsableSpace());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
