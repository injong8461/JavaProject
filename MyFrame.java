package NumBaseball;

import java.util.Scanner;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame {
	NumBaseball nBase = new NumBaseball();
	public MyFrame() {
		setTitle("숫자야구.exe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 닫으면 프로그램 종료

		Container c = getContentPane();
		c.setBackground(Color.DARK_GRAY); // 바탕 색
		c.setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80)); // 배치 관리자
		JButton bBase = new JButton("숫자 야구");
		bBase.addActionListener(event -> {
			nBase.Frame();
		});
		JButton made = new JButton("제작자 황인종");
		c.add(bBase);
		c.add(made);

		setSize(450,250);
		setVisible(true);
	}
	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
	}
}



