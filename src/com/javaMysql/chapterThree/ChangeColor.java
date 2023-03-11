package com.javaMysql.chapterThree;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChangeColor extends JFrame {
	JPanel p;
	JButton btnRed, btnGreen, btnYellow;

	public ChangeColor() {
		super("�¼�����-�ı���ɫ");

		// �������
		p = new JPanel();
		btnRed = new JButton("��ɫ");
		btnGreen = new JButton("��ɫ");
		btnYellow = new JButton("��ɫ");

		//2. ����һ����������
		ButtonListener btnListener = new ButtonListener();

		//3. ע�����
		btnRed.addActionListener(btnListener);
		btnGreen.addActionListener(btnListener);
		btnYellow.addActionListener(btnListener);

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

	// 1. ������չActionListener�ļ�����
	// �ü�������һ���ڲ��࣬�Ա����ֱ�Ӷ��ⲿ���е���Դ���з���
	class ButtonListener implements ActionListener {
		// ��дActionListener�ӿ��е��¼�������actionPerformed()
		public void actionPerformed(ActionEvent e) {
			// ��ȡ�¼�Դ
			Object source = e.getSource();
			// �ж��¼�Դ��������Ӧ�Ĵ���
			if (source == btnRed) {
				// �������ı�����ɫ�Ǻ�ɫColor.red
				p.setBackground(Color.red);
			} else if (source == btnGreen) {
				// �������ı�����ɫ����ɫColor.green
				p.setBackground(Color.green);
			} else {
				// �������ı�����ɫ�ǻ�ɫColor.yellow
				p.setBackground(Color.yellow);
			}
		}
	}

	public static void main(String[] args) {
		new ChangeColor();
	}
}
