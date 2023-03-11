package com.javaMysql.chapterThree;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyEventDemo extends JFrame {
	private JPanel p;
	private JButton btnMove;

	public KeyEventDemo() {
		super("�����¼�-�������");
		// �������
		p = new JPanel();
		btnMove = new JButton("�߶�");

		// ע����̼���
		btnMove.addKeyListener(new MyListener());

		// �������ӵ������
		p.add(btnMove);

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

	// ����һ�������࣬ʵ�ּ��̼����ӿ�KeyListener
	class MyListener implements KeyListener {

		// �û����̵��¼�������
		public void keyTyped(KeyEvent e) {
		}

		// ���̰��µ��¼�������
		public void keyPressed(KeyEvent e) {
			// ��ȡ���¼��̵���ֵ
			int key = e.getKeyCode();
			// ��ð�ť��ǰ��x,y������
			int x = btnMove.getX();
			int y = btnMove.getY();
			if (key == KeyEvent.VK_RIGHT) {
				// ���ң�x����������
				btnMove.setLocation(x + 5, y);
			} else if (key == KeyEvent.VK_LEFT) {
				// ���ң�x���������
				btnMove.setLocation(x - 5, y);
			} else if (key == KeyEvent.VK_UP) {
				// ���ң�y���������
				btnMove.setLocation(x, y - 5);
			} else if (key == KeyEvent.VK_DOWN) {
				// ���ң�y����������
				btnMove.setLocation(x, y + 5);
			}
		}

		// �����ɿ����¼�������
		public void keyReleased(KeyEvent e) {
		}
	}

	public static void main(String[] args) {
		new KeyEventDemo();
	}
}
