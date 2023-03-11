package com.javaMysql.chapterFour;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JDialogDemo extends JFrame {
	JPanel p;
	JButton btnMod, btnNon, btnMy;
	// ���������Ի������
	JDialog modDialog, nonDialog;
	// �����Զ���ĶԻ������
	MyDialog myDialog;

	public JDialogDemo() {
		super("���ԶԻ���");

		p = new JPanel();
		btnMod = new JButton("ģʽ�Ի���");
		btnNon = new JButton("��ģʽ�Ի���");
		btnMy = new JButton("�Զ���Ի���");

		// ����ģʽ�Ի���
		modDialog = new JDialog(this, "ģʽ�Ի���", true);
		// ���öԻ��������ʹ�С
		modDialog.setBounds(250, 200, 200, 100);

		// ������ģʽ�Ի���
		nonDialog = new JDialog(this, "��ģʽ�Ի���", false);
		// ���öԻ��������ʹ�С
		nonDialog.setBounds(250, 200, 200, 100);

		// �����Զ���Ի���
		myDialog = new MyDialog(this);

		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ʾģʽ�Ի���
				modDialog.setVisible(true);
			}
		});
		btnNon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ʾ��ģʽ�Ի���
				nonDialog.setVisible(true);
			}
		});
		btnMy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// ��ʾ�Զ���Ի���
				myDialog.setVisible(true);
			}
		});

		p.add(btnMod);
		p.add(btnNon);
		p.add(btnMy);

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
		new JDialogDemo();
	}

}

// ����һ���Ի����࣬�̳�JDialog��
class MyDialog extends JDialog {
	// �����Ի����е����
	JPanel p;
	JLabel lblNum;
	JTextField txtNum;
	JButton btnOK;

	public MyDialog(JFrame f) {
		super(f, "�ҵĶԻ���", true);
		// �����Ի����е����
		p = new JPanel();
		lblNum = new JLabel("������һ������");
		txtNum = new JTextField(10);
		btnOK = new JButton("ȷ��");

		// ע�����
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num = Integer.parseInt(txtNum.getText().trim());
					System.out.println(num + " * " + num + " = " + (num * num));
				} catch (NumberFormatException e1) {
					System.out.println(txtNum.getText()+"�������֣����������룡");
					// ����ı���
					txtNum.setText("");
				}
			}
		});

		// �������ӵ������
		p.add(lblNum);
		p.add(txtNum);
		p.add(btnOK);
		// �������ӵ��Ի�����
		this.add(p);
		// ���öԻ�����ʵĴ�С
		this.pack();
		// ���öԻ��������
		this.setLocation(250, 200);
	}
}
