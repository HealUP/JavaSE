package com.javaMysql.chapterThree;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxLayoutDemo extends JFrame {
	private JPanel p;
	// ������ť����
	private JButton[] btns;

	public BoxLayoutDemo() {
		super("BoxLayout�в���");
		// ʵ��������
		p = new JPanel();
		// �������Ĳ���Ϊ�в���
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

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
		this.setSize(300, 300);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new BoxLayoutDemo();
	}
}
