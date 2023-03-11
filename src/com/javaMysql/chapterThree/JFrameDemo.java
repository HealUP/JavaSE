package com.javaMysql.chapterThree;

import javax.swing.JFrame;

public class JFrameDemo extends JFrame {
	public JFrameDemo() {
		// ���ø��๹�췽������ָ�����ڱ���
		super("QST����ʵѵ");
		// �趨���ڴ�С�����400���أ��߶�300���أ�
		this.setSize(400, 300);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// ʵ����һ��JFrameDemo����
		new JFrameDemo();
	}

}
