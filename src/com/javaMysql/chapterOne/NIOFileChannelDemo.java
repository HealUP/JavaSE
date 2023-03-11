package com.javaMysql.chapterOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class NIOFileChannelDemo {

	public static void main(String[] args) {
		File f = new File("src\\com\\qst\\chapter01\\NIOFileChannelDemo.java");
		try (
		// ����FileInputStream���Ը��ļ�����������FileChannel
		FileChannel inChannel = new FileInputStream(f).getChannel();
				// ���ļ����������FileBuffer�����Կ������
				FileChannel outChannel = new FileOutputStream("D:\\channel.txt")
						.getChannel()) {
			// ��FileChannel���ȫ������ӳ���ByteBuffer
			MappedByteBuffer buffer = inChannel.map(
					FileChannel.MapMode.READ_ONLY, 0, f.length()); // ��
			// ʹ��GBK���ַ���������������
			Charset charset = Charset.forName("GBK");
			// ֱ�ӽ�buffer�������ȫ�����
			outChannel.write(buffer); // ��
			// �ٴε���buffer��clear()��������ԭlimit��position��λ��
			buffer.clear();
			// ����������(CharsetDecoder)����
			CharsetDecoder decoder = charset.newDecoder();
			// ʹ�ý�������ByteBufferת����CharBuffer
			CharBuffer charBuffer = decoder.decode(buffer);
			// CharBuffer��toString�������Ի�ȡ��Ӧ���ַ���
			System.out.println(charBuffer);
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}

}
