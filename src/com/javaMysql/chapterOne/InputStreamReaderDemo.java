package com.javaMysql.chapterOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

	public static void main(String[] args) {
		try (
		// ??Sytem.in?????????InputStream??????????Reader?????
		InputStreamReader reader = new InputStreamReader(System.in);
				// ?????Reader?????BufferedReader
				BufferedReader br = new BufferedReader(reader)) {
			String line = null;
			// ?????????????????????
			while ((line = br.readLine()) != null) {
				// ??????????????"exit"?????????
				if (line.equals("exit")) {
					System.exit(1);
				}
				// ????????????
				System.out.println("?????????:" + line);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}