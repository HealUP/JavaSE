package com.javaMysql.chapterThree;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelDemo extends JFrame {
	// ����һ��������
	private JPanel p;
	// ����������ť����
	private JButton btnOk, btnCancel;

	public JPanelDemo() {
		super("JPanelDemo");

		// ʵ����������p��Ĭ��Ϊ�����֣�
		p = new JPanel();

		// ʵ����һ����ť���󣬸ð�ť�ϵ��ı�Ϊ��ȷ�ϡ�
		btnOk = new JButton("ȷ��");
		// ʵ����һ����ť���󣬸ð�ť�ϵ��ı�Ϊ��ȡ����
		btnCancel = new JButton("ȡ��");

		// ����ť��ӵ������
		p.add(btnOk);
		p.add(btnCancel);

		// �������ӵ�������
		this.add(p);

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
		new JPanelDemo();
	}

}
