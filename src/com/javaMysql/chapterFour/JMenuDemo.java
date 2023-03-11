package com.javaMysql.chapterFour;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class JMenuDemo extends JFrame {
	private JPanel p;
	// �����˵���
	private JMenuBar menuBar;
	// �����˵�
	private JMenu menuFile, menuEdit, menuHelp, menuNew;
	// �����˵���
	private JMenuItem miSave, miExit, miCopy, miPost, miAbout, miC, miJava,
			miOther;

	public JMenuDemo() {
		super("�����˵�");
		p = new JPanel();
		// �����˵�������
		menuBar = new JMenuBar();
		// ���˵������õ�������
		this.setJMenuBar(menuBar);
		// �����˵�
		menuFile = new JMenu("File");
		menuEdit = new JMenu("Edit");
		menuHelp = new JMenu("Help");
		menuNew = new JMenu("New");
		// ���˵���ӵ��˵���
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuHelp);
		// ���½��˵���ӵ��ļ��˵���
		menuFile.add(menuNew);
		// �ڲ˵�����ӷָ���
		menuFile.addSeparator();
		// �����˵�ѡ��
		miSave = new JMenuItem("Save");
		miExit = new JMenuItem("Exit");
		miCopy = new JMenuItem("Copy");
		miPost = new JMenuItem("Post");
		miAbout = new JMenuItem("About");
		miC = new JMenuItem("Class");
		miJava = new JMenuItem("Java Project");
		miOther = new JMenuItem("Other...");
		// ���˵�����ӵ��˵���
		menuFile.add(miSave);
		menuFile.add(miExit);
		menuEdit.add(miCopy);
		menuEdit.add(miPost);
		menuHelp.add(miAbout);
		menuNew.add(miC);
		menuNew.add(miJava);
		menuNew.add(miOther);

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
		new JMenuDemo();
	}
}
