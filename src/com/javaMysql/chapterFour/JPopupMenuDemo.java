package com.javaMysql.chapterFour;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;

public class JPopupMenuDemo extends JFrame {
	private JPanel p;
	// ���������˵�
	private JPopupMenu popMenu;
	// �����˵�ѡ��
	private JMenuItem miUndo, miCopy, miPost, miCut;

	public JPopupMenuDemo() {
		super("JPopupMenu�����˵�");
		p = new JPanel();
		// ���������˵�����
		popMenu = new JPopupMenu();

		// �����˵�ѡ��
		miUndo = new JMenuItem("Undo");
		miCopy = new JMenuItem("Copy");
		miPost = new JMenuItem("Post");
		miCut = new JMenuItem("Cut");

		// ���˵�ѡ����ӵ��˵���
		popMenu.add(miUndo);
		popMenu.addSeparator();
		popMenu.add(miCopy);
		popMenu.add(miPost);
		popMenu.add(miCut);

		// ע��������
		p.addMouseListener(new MouseAdapter() {
			// ��д������¼�������
			public void mouseClicked(MouseEvent e) {
				// ����������Ҽ�
				if (e.getButton() == MouseEvent.BUTTON3) {
					int x = e.getX();
					int y = e.getY();
					// ������������λ����ʾ�����˵�
					popMenu.show(p, x, y);
				}
			}
		});

		// �������ӵ�����
		this.add(p);
		// �趨���ڴ�С
		this.setSize(400, 300);
		// �趨�������Ͻ�����
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new JPopupMenuDemo();
	}
}
