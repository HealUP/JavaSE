package com.javaMysql.chapterThree;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColorAnonymous extends JFrame {
	JPanel p;
	JButton btnRed, btnGreen, btnYellow;

	public ChangeColorAnonymous() {
		super("�¼�����-�ı���ɫ");

		// �������
		p = new JPanel();
		btnRed = new JButton("��ɫ");
		btnGreen = new JButton("��ɫ");
		btnYellow = new JButton("��ɫ");

		// ʹ������������ķ�ʽע�����
		btnRed.addActionListener(new ActionListener() {
			// ��дActionListener�ӿ��е��¼�������actionPerformed()
			public void actionPerformed(ActionEvent e) {
				// �������ı�����ɫ�Ǻ�ɫColor.red
				p.setBackground(Color.red);
			}
		});

		btnGreen.addActionListener(new ActionListener() {
			// ��дActionListener�ӿ��е��¼�������actionPerformed()
			public void actionPerformed(ActionEvent e) {
				// �������ı�����ɫ����ɫColor.green
				p.setBackground(Color.green);
			}
		});

		btnYellow.addActionListener(new ActionListener() {
			// ��дActionListener�ӿ��е��¼�������actionPerformed()
			public void actionPerformed(ActionEvent e) {
				// �������ı�����ɫ�ǻ�ɫColor.yellow
				p.setBackground(Color.yellow);
			}
		});

		// ����ť��ӵ������
		p.add(btnRed);
		p.add(btnGreen);
		p.add(btnYellow);

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
		new ChangeColorAnonymous();
	}
}
