package NumBaseball;

import java.util.Scanner;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BFrame extends JFrame {
	NumBaseball nBase = new NumBaseball();
	public BFrame() {
		setTitle("���� �߱� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.BLACK);

		JLabel hi = new JLabel("���� �߱��� ���� ���� ȯ���մϴ�. ");
		hi.setLocation(130,0);
		hi.setSize(200,50);
		hi.setForeground(Color.white);
		c.add(hi);

		JLabel explain = new JLabel("������ �����Ϸ��� ���̵��� �������ּ���. (��), (��), (��)");
		explain.setLocation(70,40);
		explain.setSize(400,50);
		explain.setForeground(Color.red);
		c.add(explain);

		JButton diff = new JButton("��");
		diff.setLocation(130,80);
		diff.setSize(50,50);
		c.add(diff);

		JButton normal = new JButton("��");
		normal.setLocation(180,80);
		normal.setSize(50,50);
		c.add(normal);

		JButton easy = new JButton("��");
		easy.setLocation(230,80);
		easy.setSize(50,50);
		c.add(easy);

		diff.addActionListener(event -> {
			HBase hBase = new HBase();
			nBase.Start(3);
		});
		normal.addActionListener(event -> {
			NBase noBase = new NBase();
			nBase.Start(2);
		});
		easy.addActionListener(event -> {
			EBase eBase = new EBase();
			nBase.Start(1);
		});

		setSize(450,250);
		setVisible(true);
	}
}


