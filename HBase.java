package NumBaseball;

import java.util.Scanner;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class HBase extends JFrame {
	static String sNum = "";
	static String result ="";
	static String fResult ="";
	NumBaseball nBaseball = new NumBaseball();
	public HBase() {
		setTitle("숫자 야구 Hard mode");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.PINK);

		JButton ok = new JButton("OK");
		ok.setLocation(60,80);
		ok.setSize(60,50);
		c.add(ok);
		JButton delite = new JButton("삭제");
		delite.setLocation(630,80);
		delite.setSize(60,50);
		c.add(delite);
		JLabel title = new JLabel("네 개의 숫자를 입력하세요");
		title.setLocation(65,0);
		title.setSize(200,100);
		c.add(title);

		JButton n0 = new JButton("0");
		n0.setLocation(130,80);
		n0.setSize(50,50);
		c.add(n0);
		JButton n1 = new JButton("1");
		n1.setLocation(180,80);
		n1.setSize(50,50);
		c.add(n1);
		JButton n2 = new JButton("2");
		n2.setLocation(230,80);
		n2.setSize(50,50);
		c.add(n2);
		JButton n3 = new JButton("3");
		n3.setLocation(280,80);
		n3.setSize(50,50);
		c.add(n3);
		JButton n4 = new JButton("4");
		n4.setLocation(330,80);
		n4.setSize(50,50);
		c.add(n4);
		JButton n5 = new JButton("5");
		n5.setLocation(380,80);
		n5.setSize(50,50);
		c.add(n5);
		JButton n6 = new JButton("6");
		n6.setLocation(430,80);
		n6.setSize(50,50);
		c.add(n6);
		JButton n7 = new JButton("7");
		n7.setLocation(480,80);
		n7.setSize(50,50);
		c.add(n7);
		JButton n8 = new JButton("8");
		n8.setLocation(530,80);
		n8.setSize(50,50);
		c.add(n8);
		JButton n9 = new JButton("9");
		n9.setLocation(580,80);
		n9.setSize(50,50);
		c.add(n9);
		
		JLabel lNum = new JLabel("");
		lNum.setLocation(130,100);
		lNum.setSize(100,100);
		c.add(lNum);
		
		JLabel lNumResult = new JLabel("");
		lNumResult.setLocation(250,100);
		lNumResult.setSize(100,100);
		c.add(lNumResult);
		
		JLabel lResult = new JLabel("");
		lResult.setLocation(100,0);
		lResult.setSize(1300,500);
		c.add(lResult);
		
		n0.addActionListener(event -> {
			String sNum0 = "0";
			sNum=sNum + sNum0;
			lNum.setText(sNum);
		});
		n1.addActionListener(event -> {
			String sNum1 = "1";
			sNum=sNum + sNum1;
			lNum.setText(sNum);
		});
		n2.addActionListener(event -> {
			String sNum2 = "2";
			sNum=sNum + sNum2;
			lNum.setText(sNum);
		});
		n3.addActionListener(event -> {
			String sNum3 = "3";
			sNum=sNum + sNum3;
			lNum.setText(sNum);
		});
		n4.addActionListener(event -> {
			String sNum4 = "4";
			sNum=sNum + sNum4;
			lNum.setText(sNum);
		});
		n5.addActionListener(event -> {
			String sNum5 = "5";
			sNum=sNum + sNum5;
			lNum.setText(sNum);
		});
		n6.addActionListener(event -> {
			String sNum6 = "6";
			sNum=sNum + sNum6;
			lNum.setText(sNum);
		});
		n7.addActionListener(event -> {
			String sNum7 = "7";
			sNum=sNum + sNum7;
			lNum.setText(sNum);
		});
		n8.addActionListener(event -> {
			String sNum8 = "8";
			sNum=sNum + sNum8;
			lNum.setText(sNum);
		});
		n9.addActionListener(event -> {
			String sNum9 = "9";
			sNum=sNum + sNum9;
			lNum.setText(sNum);
		});
		
		ok.addActionListener(event -> {
			int iNum = Integer.parseInt(sNum);
			nBaseball.Play(iNum);
			lNumResult.setText(result);
			fResult =fResult + sNum + "="+ result+"  ";
			lResult.setText(fResult);
			lNum.setText("");
			sNum="";
		});
		delite.addActionListener(event -> {
			lResult.setText("");
			fResult ="";
		});


		setSize(1300,400);
		setVisible(true);
	}
	static void GetResult(String r) {
		result=r;
	}
}
