package com.javaMysql.chapterOne;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) {

		try (PrintStream ps = new PrintStream(new FileOutputStream(
				"D:\\test.txt"))) {
			// ʹ��PrintStream��ӡһ���ַ���
			ps.println("����PrintStream��ӡ�����ļ���д���ݣ�");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
