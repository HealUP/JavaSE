package com.javaMysql.chapterThree;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class ImageIconDemo extends JFrame {
	public ImageIconDemo() {
		super("ImageIconͼ��");
		
	    //����ImageIconͼ��
		ImageIcon qstIcon=new ImageIcon("images\\qst.png");
		
		//���ô����Icon
		this.setIconImage(qstIcon.getImage());
	
		// �趨���ڴ�С�����400���أ��߶�300���أ�
		this.setSize(400, 300);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		 //����ImageIconͼ��
		ImageIcon booksIcon =new ImageIcon("images\\books.jpg");
		//�ڴ����л�ͼ��
	    g.drawImage(booksIcon.getImage(), 0, 20, this);
	    //��ʾͼ��Ŀ�Ⱥ͸߶�
	    g.drawString("��:"+booksIcon.getIconWidth()+"px����:"+booksIcon.getIconHeight()+"px", 20,210);
	}
	public static void main(String[] args) {
		new ImageIconDemo();
	}

}
