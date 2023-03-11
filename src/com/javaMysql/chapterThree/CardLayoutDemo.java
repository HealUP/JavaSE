package com.javaMysql.chapterThree;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayoutDemo extends JFrame {
	private JPanel p;
	// ������ť����
	private JButton[] btns;
	// ������Ƭ���ֹ�����
	private CardLayout cl;

	public CardLayoutDemo() {
		super("CardLayout��Ƭ����");
		// ʵ������Ƭ���ֹ���������
		cl = new CardLayout();
		// ʵ���������䲼��Ϊ��Ƭ����
		p = new JPanel(cl);

		// ʵ������ť����ĳ���
		btns = new JButton[6];
		// ѭ��ʵ���������е�ÿ����ť����
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton("��ť " + (i + 1));
		}

		// ѭ���������еİ�ť��ӵ������
		for (int i = 0; i < btns.length; i++) {
			p.add("��" + (i + 1) + "��", btns[i]);
		}

		// �������ӵ�������
		this.add(p);

		// ��ʾ���һ�ſ�Ƭ
		cl.last(p);
		// ��ʾ������"��3��"�Ŀ�Ƭ
	    cl.show(p, "��3��");

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
		new CardLayoutDemo();
	}
}
