package com.javaMysql.chapterThree;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NULLLayoutDemo extends JFrame {
	private JPanel p;
	// ����������ť����
	private JButton btnOk, btnCancel;

	public NULLLayoutDemo() {
		super("NULL�ղ���");

		p = new JPanel();
		// ������岼��Ϊ��
		p.setLayout(null);

		// ������ť
		btnOk = new JButton("ȷ��");
		btnCancel = new JButton("ȡ��");

		// ����setBounds()���ð�ť������ʹ�С
		btnOk.setBounds(30, 60, 60, 25);

		// ����setLocation()���ð�ť������
		btnCancel.setLocation(100, 60);
		// ����setSize()���ð�ť�Ĵ�С
		btnCancel.setSize(60, 25);

		// ����ť��ӵ������
		p.add(btnOk);
		p.add(btnCancel);

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
		new NULLLayoutDemo();
	}
}
