package com.javaMysql.chapterFour;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

public class JTreeDemo extends JFrame {
	private DefaultMutableTreeNode root;
	private DefaultTreeModel model;
	private JTree tree;
	private JTextArea textArea;
	private JPanel p;

	public JTreeDemo() {
		super("JTree��");

		// ʵ�������ĸ��ڵ�
		root = makeSampleTree();
		// ʵ��������ģ��
		model = new DefaultTreeModel(root);
		// ʵ����һ����
		tree = new JTree(model);
		// ��������ѡ��ģʽ�ǵ�һ�ڵ��ѡ��ģʽ��һ��ֻ��ѡ��һ���ڵ㣩
		tree.getSelectionModel().setSelectionMode(
				TreeSelectionModel.SINGLE_TREE_SELECTION);

		// ע�����ļ������󣬼���ѡ��ͬ�����ڵ�
		tree.addTreeSelectionListener(new TreeSelectionListener() {
			// ��д ����ѡ���¼�������
			public void valueChanged(TreeSelectionEvent event) {
				// ��ȡѡ�нڵ��·��
				TreePath path = tree.getSelectionPath();
				if (path == null)
					return;
				// ��ȡѡ�еĽڵ����
				DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) path
						.getLastPathComponent();
				// ��ȡѡ�нڵ�����ݣ�����ʾ���ı�����
				textArea.setText(selectedNode.getUserObject().toString());
			}
		});

		// ʵ����һ�������󣬲�����1��2��
		p = new JPanel(new GridLayout(1, 2));
		// ��������������
		p.add(new JScrollPane(tree));
		textArea = new JTextArea();
		// ����Ҳ�����ı���
		p.add(new JScrollPane(textArea));

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

	// ����һ��������ķ���
	public DefaultMutableTreeNode makeSampleTree() {
		// ʵ�������ڵ㣬�����ڵ���ӵ���Ӧ�ڵ���
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("QST����ʵѵ");
		DefaultMutableTreeNode comp = new DefaultMutableTreeNode("������Դ�������޹�˾");
		root.add(comp);
		DefaultMutableTreeNode dpart = new DefaultMutableTreeNode("�з���");
		comp.add(dpart);
		DefaultMutableTreeNode emp = new DefaultMutableTreeNode("�Կ���");
		dpart.add(emp);
		emp = new DefaultMutableTreeNode("����");
		dpart.add(emp);
		dpart = new DefaultMutableTreeNode("��ѧ��");
		comp.add(dpart);
		emp = new DefaultMutableTreeNode("����");
		dpart.add(emp);
		return root;
	}

	public static void main(String[] args) {
		new JTreeDemo();
	}
}
