package com.javaMysql.chapterThree;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseEventAdapterDemo extends JFrame {
	private JPanel p;
	// �����һ�ε�����
	int pre_x = -1, pre_y = -1;
	// ��굱ǰ����
	int x, y;

	public MouseEventAdapterDemo() {
		super("����");
		p = new JPanel();
		// ע��������
		p.addMouseMotionListener(new PaintListener());
		p.addMouseListener(new ResetListenter());

		// �������ӵ�������
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

	// ��дJFrame��paint()�������˷��������ڴ����л�ͼ
	public void paint(Graphics g) {
		// ���û��ʵ���ɫ
		g.setColor(Color.red);
		// ��ʷ����>0
		if (pre_x > 0 && pre_y > 0) {
			// ����һ���߶Σ�����һ������϶��¼��㵽��������϶��¼���
			g.drawLine(pre_x, pre_y, x, y);
		}
		// ���浱ǰ������꣬��Ϊ��һ�ε���ʷ����
		pre_x = x;
		pre_y = y;
	}

	// ��������϶�������
	class PaintListener extends MouseMotionAdapter{
		// ����϶��Ĵ����������𻭻�����
		public void mouseDragged(MouseEvent e) {
			// ��ȡ��굱ǰ������
			x = e.getX();
			y = e.getY();
			// �ػ���repaint()����paint()
			MouseEventAdapterDemo.this.repaint();
		}
	}

	// ������������
	class ResetListenter extends MouseAdapter {
		// ��갴���¼�����
		public void mousePressed(MouseEvent e) {
			// ��ȡ��갴�����ж��Ƿ����Ҽ�
			if (e.getButton() == MouseEvent.BUTTON3) {
				// �ػ���壨����ԭ���Ĺ켣��
				MouseEventAdapterDemo.this.p.repaint();
			}
		}

		// ����ɿ��¼�����������ʷ����
		public void mouseReleased(MouseEvent e) {
			// ����ɿ�ʱ������ʷ��������Ϊ-1�����ã�
			pre_x = -1;
			pre_y = -1;
		}
	}

	public static void main(String[] args) {
		new MouseEventAdapterDemo();
	}
}
