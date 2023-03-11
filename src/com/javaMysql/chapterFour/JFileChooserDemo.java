package com.javaMysql.chapterFour;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFileChooserDemo extends JFrame {
	private JPanel p;
	private JScrollPane sp;
	private JTextArea txtContent;
	private JButton btnOpen, btnSave, btnClear;

	public JFileChooserDemo() {
		super("JFileChooser�ļ��Ի���");

		p = new JPanel();

		btnOpen = new JButton("��");
		btnSave = new JButton("����");
		btnClear = new JButton("���");

		txtContent = new JTextArea(20, 10);
		// ���������ı���Ĺ������
		sp = new JScrollPane(txtContent);

		// ע�����
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openFile();
			}
		});
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ����ı���
				txtContent.setText("");
			}
		});

		// ����ť��ӵ������
		p.add(btnOpen);
		p.add(btnSave);
		p.add(btnClear);

		// �����������ӵ���������
		this.add(sp);
		// �������ӵ���������
		this.add(p, BorderLayout.SOUTH);
		// �趨���ڴ�С
		this.setSize(600, 500);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);
	}

	// ���ļ��ķ���
	private void openFile() {
		// ʵ����һ���ļ��Ի������
		JFileChooser fc = new JFileChooser();
		// ��ʾ�ļ��򿪶Ի���
		int rVal = fc.showOpenDialog(this);
		// ������ȷ��(Yes/OK)
		if (rVal == JFileChooser.APPROVE_OPTION) {
			// ��ȡ�ļ��Ի������û�ѡ�е��ļ���
			String fileName = fc.getSelectedFile().getName();
			// ��ȡ�ļ��Ի������û�ѡ�е��ļ����ڵ�·��
			String path = fc.getCurrentDirectory().toString();
			try {
				// ����һ���ļ������������ڶ��ļ�
				FileReader fread = new FileReader(path + "/" + fileName);
				// ����һ��������
				BufferedReader bread = new BufferedReader(fread);
				// ���ļ��ж�һ����Ϣ
				String line = bread.readLine();
				// ѭ�����ļ��е����ݣ�����ʾ���ı�����
				while (line != null) {
					txtContent.append(line + "\n");
					// ����һ��
					line = bread.readLine();
				}
				bread.close();
				fread.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// �����ļ��ķ���
	private void saveFile() {
		// ʵ����һ���ļ��Ի������
		JFileChooser fc = new JFileChooser();
		// ��ʾ�ļ�����Ի���
		int rVal = fc.showSaveDialog(this);
		// ������ȷ��(Yes/OK)
		if (rVal == JFileChooser.APPROVE_OPTION) {
			// ��ȡ�ļ��Ի������û�ѡ�е��ļ���
			String fileName = fc.getSelectedFile().getName();
			// ��ȡ�ļ��Ի������û�ѡ�е��ļ����ڵ�·��
			String path = fc.getCurrentDirectory().toString();
			try {
				// ����һ���ļ������������д�ļ�
				FileWriter fwriter = new FileWriter(path + "/" + fileName);
				// ���ı����е���Ϣд���ļ���
				fwriter.write(txtContent.getText());
				fwriter.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new JFileChooserDemo();
	}
}
