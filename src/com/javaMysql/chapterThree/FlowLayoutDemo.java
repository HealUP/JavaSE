package com.javaMysql.chapterThree;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame {
	// �������
	private JPanel p;
	private JButton btn1, btn2, btn3;

	public FlowLayoutDemo() {
		super("FlowLayout������");
//		// �������
//		p = new JPanel();
//		// ����һ�������ֶ��󣬶��뷽ʽ������룬ˮƽ���10���أ���ֱ���15����
//		FlowLayout layout = new FlowLayout(FlowLayout.LEFT, 10, 15);
//		// �������Ĳ���
//		p.setLayout(layout);

		// �������д�����Լ򻯳�����һ�����
		 p=new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 15));

		//������ť 
		btn1 = new JButton("��ť 1");
		btn2 = new JButton("��ť 2");
		btn3 = new JButton("��ť 3");

		//����ť��ӵ������
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(200, 200);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutDemo();
	}
}
