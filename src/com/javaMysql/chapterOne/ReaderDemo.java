package com.javaMysql.chapterOne;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderDemo {

	public static void main(String[] args) {
		// ����һ��BufferedReader���Ķ���
		BufferedReader br = null;
		try {
			// ʵ����BufferedReader��������FileReader�����ڶ��ļ�
			br = new BufferedReader(new FileReader(
					"src\\com\\qst\\chapter01\\ReaderDemo.java"));
			String result = null;
			//ѭ�����ļ���һ�ζ�һ��
			while ((result = br.readLine()) != null) {
				//���
				System.out.println(result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// �رջ�����
				br.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
