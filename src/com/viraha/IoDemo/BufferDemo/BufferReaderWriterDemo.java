package com.viraha.IoDemo.BufferDemo;
//ʹ�û�����ʵ���ı��ĸ���
/*һ����Ҫ�ķ�����readLine()����һ�ζ�ȡһ���ı�,���췽���зֱ����FileReader��FileWriter���͵Ĳ�����Ϊ����
* */
import java.io.*;

public class BufferReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bfReader = new BufferedReader(new FileReader("random.txt"));
        BufferedWriter bfWriter = new BufferedWriter(new FileWriter("Dest/radomDeom.txt"));

        String str;//��¼��ȡ��str
        //ÿ�ζ�ȡһ�У�ѭ���ж��Ƿ����ĩβ
        try {
            while ((str = bfReader.readLine()) !=null){
                bfWriter.write(str);
                bfWriter.newLine();//���з�
            }
        } finally {

            try {
                if (bfReader != null){
                    bfReader.close();
                }
                if (bfWriter != null){
                    bfWriter.close();//һ��Ҫclose()�ر���Դ������ᵼ���ڻ�����������û�б�д�룡��
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("�ѹر���Դ��");
        }
    }
}
