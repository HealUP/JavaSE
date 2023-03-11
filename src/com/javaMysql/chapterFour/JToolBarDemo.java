package com.javaMysql.chapterFour;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class JToolBarDemo extends JFrame {
	private JPanel p;
	// ����������
	private JToolBar toolBar;
	private JButton btnSave, btnPreview, btnDown, btnSearch, btnDelete;

	public JToolBarDemo() {
		super("JToolBar������");

		p = new JPanel();

		// ����������
		toolBar = new JToolBar();
		// ��������������ӵ�����ı������Ϸ���
		this.add(toolBar, BorderLayout.NORTH);

		// ������ť���󣬰�ť�������ֺ�ͼƬ
		btnSave = new JButton("����", new ImageIcon("images\\save.png"));
		btnPreview = new JButton("Ԥ��", new ImageIcon("images\\preview.png"));
		btnDown = new JButton("����", new ImageIcon("images\\down.png"));
		btnSearch = new JButton("��ѯ", new ImageIcon("images\\search.png"));
		btnDelete = new JButton("ɾ��", new ImageIcon("images\\delete.png"));

		// ���ð�ť�Ĺ�����ʾ�ı�
		btnSave.setToolTipText("����");
		btnPreview.setToolTipText("Ԥ��");
		btnDown.setToolTipText("����");
		btnSearch.setToolTipText("��ѯ");
		btnDelete.setToolTipText("ɾ��");

		// ����ť��ӵ���������
		toolBar.add(btnSave);
		toolBar.add(btnPreview);
		toolBar.add(btnDown);
		toolBar.add(btnSearch);
		toolBar.add(btnDelete);

		// �������ӵ�����
		this.add(p);
		// �趨���ڴ�С
		this.setSize(400, 300);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JToolBarDemo();
	}
}
