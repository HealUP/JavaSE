package com.javaMysql.chapterOne;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo {

	public static void main(String[] args) {

		// ����һ���Ӽ��̽������ݵ�ɨ����
		Scanner scanner = new Scanner(System.in);

		// �����ļ��ַ������
		FileWriter fw = null;
		try {
			// ʵ�����ļ��ַ������
			fw = new FileWriter("D:\\mytest2.txt");
			System.out.println("���������ݣ�");
			String str = scanner.nextLine();
			// ������д���ļ���
			fw.write(str);
			System.out.println("�ѱ��棡");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// �ر��ļ��ַ������
				fw.close();
				scanner.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
