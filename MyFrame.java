package NumBaseball;

import java.util.Scanner;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
	NumBaseball nBase = new NumBaseball();
	public MyFrame() {
		setTitle("���ھ߱�.exe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ ������ ���α׷� ����

		Container c = getContentPane();
		c.setBackground(Color.DARK_GRAY); // ���� ��
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80)); // ��ġ ������
		JButton bBase = new JButton("���� �߱�");
		bBase.addActionListener(event -> {
			nBase.Frame();
		});
		JButton made = new JButton("������ Ȳ����");
		c.add(bBase);
		c.add(made);

		setSize(450,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}



