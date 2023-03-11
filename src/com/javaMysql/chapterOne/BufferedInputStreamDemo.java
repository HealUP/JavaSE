package com.javaMysql.chapterOne;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {
		// ???????BufferedInputStream????????
		BufferedInputStream bi = null;
		try {
			// ????FileInputStream????????????????
			bi = new BufferedInputStream(new FileInputStream("src\\com\\qst\\chapter01\\BufferedInputStreamDemo.java"));
			int result = 0;
			//?????????
			while ((result = bi.read()) != -1) {
				//???
				System.out.print((char) result);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ????????
				bi.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

	}

}
