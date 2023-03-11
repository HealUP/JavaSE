package com.javaMysql.chapterFour;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class JOptionPaneDemo extends JFrame {
	private JPanel p;
	private JTextArea txtContent;
	private JButton btnInput, btnMsg, btnConfirm, btnOption;

	public JOptionPaneDemo() {
		super("JOptionPane��׼�Ի���");

		p = new JPanel();

		btnInput = new JButton("����");
		btnMsg = new JButton("��Ϣ");
		btnConfirm = new JButton("ȷ��");
		btnOption = new JButton("ѡ��");
		txtContent = new JTextArea(20, 10);

		// ע�����
		btnInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ʾ����Ի��򣬲������û�������ַ���
				String strIn = JOptionPane
						.showInputDialog(btnInput, "������һ�����֣�");
				try {
					int num = Integer.parseInt(strIn.trim());
					// ���ı�����׷������
					txtContent.append(num + " * " + num + " = " + (num * num)
							+ "\n");
				} catch (NumberFormatException e1) {
					txtContent.append(strIn + "�������֣����������룡\n");
				}
			}
		});
		btnMsg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ʾ��Ϣ�Ի���
				JOptionPane.showMessageDialog(btnMsg, "�������㿪QSTԱ����ᣡ", "��Ϣ",
						JOptionPane.INFORMATION_MESSAGE);
				txtContent.append("��ʾ��Ϣ�Ի���\n");
			}
		});
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ʾȷ�϶Ի���
				int r = JOptionPane.showConfirmDialog(btnConfirm, "��ȷ��Ҫɾ����",
						"ȷ��", JOptionPane.YES_NO_OPTION);
				if (r == JOptionPane.YES_OPTION) {
					txtContent.append("��ʾȷ�϶Ի�����ѡ����'��'\n");
				} else {
					txtContent.append("��ʾȷ�϶Ի�����ѡ����'��'\n");
				}

			}
		});
		btnOption.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] options = { "Red", "Green", "Blue" };
				// ��ʾѡ��Ի���
				int sel = JOptionPane.showOptionDialog(btnOption, "ѡ����ɫ��",
						"ѡ��", JOptionPane.DEFAULT_OPTION,
						JOptionPane.WARNING_MESSAGE, null, options, options[0]);
				if (sel != JOptionPane.CLOSED_OPTION) {
					txtContent.append("��ʾѡ��Ի�����ɫ: " + options[sel] + "\n");
				}

			}
		});

		// ����ť��ӵ������
		p.add(btnInput);
		p.add(btnMsg);
		p.add(btnConfirm);
		p.add(btnOption);

		// ���ı�����ӵ���������
		this.add(txtContent);
		// �������ӵ���������
		this.add(p, BorderLayout.SOUTH);
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
		new JOptionPaneDemo();
	}
}
