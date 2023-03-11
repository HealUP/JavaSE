package com.javaMysql.chapterFour;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JColorChooserDemo extends JFrame {
	private JPanel p;
	// ������ɫѡȡ��
	private JColorChooser ch;
	// ����һ�������ɫ�ĶԻ���
	private JDialog colorDialog;
	private JButton btnChange;

	public JColorChooserDemo() {
		super("��ɫ�Ի���");
		p = new JPanel();
		// ʵ������ɫѡȡ������
		ch = new JColorChooser();
		// ����һ����ɫ�Ի�����ɫѡȡ��������Ϊ���е�һ������
		colorDialog = JColorChooser.createDialog(this, "ѡȡ��ɫ", true, ch, null,
				null);
		btnChange = new JButton("�ı���屳����ɫ");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ʾ��ɫ�Ի���
				colorDialog.setVisible(true);
				// ������屳����ɫΪ�û�ѡȡ����ɫ
				p.setBackground(ch.getColor());
			}
		});

		p.add(btnChange);

		// �������ӵ�����
		this.add(p);
		// �趨���ڴ�С
		this.setSize(800, 600);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JColorChooserDemo();
	}
}
