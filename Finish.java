package NumBaseball;

import java.util.Scanner;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Finish extends JFrame {
	NumBaseball nBaseball = new NumBaseball();
	public Finish() {
		setTitle("Congratulation!!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.YELLOW);
		c.setLayout(null);
		
		JLabel count = new JLabel(NumBaseball.count+"번 만에 성공하셨습니다.");
		count.setLocation(45,30);
		count.setSize(300,200);
		c.add(count);
		
		JLabel title = new JLabel("Congratulation!!!");
		title.setLocation(45,30);
		title.setSize(100,100);
		c.add(title);
	
	
		setSize(230,230);
		setVisible(true);
	}
}