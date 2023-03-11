package com.javaMysql.chapterThree;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutDemo extends JFrame {
	private JPanel p;
	// ������ť����
	private JButton[] btns;

	public GridLayoutDemo() {
		super("���񲼾�");

		// ����һ��2��3�е����񲼾ֹ��������󣬲����ò������õ������
		p = new JPanel(new GridLayout(2, 3));

		// ʵ������ť����ĳ���
		btns = new JButton[6];
		// ѭ��ʵ���������е�ÿ����ť����
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("��ť " + (i + 1));
		}

		// ѭ���������еİ�ť��ӵ������
		for (int i = 0; i < btns.length; i++) {
			p.add(btns[i]);
		}

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
		new GridLayoutDemo();
	}
}
