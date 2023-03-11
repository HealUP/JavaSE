package com.javaMysql.chapterThree;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutDemo extends JFrame {
	private JPanel p;
	private JButton btn1, btn2, btn3, btn4, btn5;

	public BorderLayoutDemo() {
		super("BorderLayout�߽粼��");
		p = new JPanel();

		// ����һ���߽粼�ֹ��������󣬲����ò������õ������
		p.setLayout(new BorderLayout());
		
		//������ť
		btn1 = new JButton("��ť 1");
		btn2 = new JButton("��ť 2");
		btn3 = new JButton("��ť 3");
		btn4 = new JButton("��ť 4");
		btn5 = new JButton("��ť 5");

		// ����ť���õ������ָ��λ��
		p.add(btn1, BorderLayout.EAST);
		p.add(btn2, BorderLayout.WEST);
		p.add(btn3, BorderLayout.SOUTH);
		p.add(btn4, BorderLayout.NORTH);
		p.add(btn5, BorderLayout.CENTER);

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(300, 200);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}
