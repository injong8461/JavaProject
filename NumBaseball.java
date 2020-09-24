package NumBaseball;
import java.util.Scanner;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class NumBaseball {
	static int goalNum1=0;
	static int goalNum2=0;
	static int goalNum3=0;
	static int goalNum4=0;
	static int count=0;

	static void Frame() {
		BFrame bFrame = new BFrame();
	}
	static void Start(int level) {
		NumBaseball ball = new NumBaseball();

		if(level==1) 
			ball.Easy();
		else if(level==2) 
			ball.Normal();
		else if(level==3) 
			ball.Hard();
	}

	static void Easy() {
		double dValue = Math.random();
		goalNum3 = (int) (dValue * 10);
		goalNum4 = (int) ((dValue * 100) - (goalNum3 *10));

		while(goalNum3==goalNum4||goalNum3==0) {
			dValue = Math.random();
			goalNum3 = (int) (dValue * 10);
			goalNum4 = (int) ((dValue * 100) - (goalNum3 *10));
		}
	}

	static void Normal() {
		double dValue = Math.random();
		goalNum2 = (int) (dValue * 10);
		goalNum3 = (int) ((dValue * 100) - (goalNum2 *10));
		goalNum4 = (int) (dValue * 1000 - goalNum2*100 - goalNum3*10);

		while(goalNum2==goalNum3||goalNum2==goalNum4||goalNum3==goalNum4||goalNum2==0) {
			dValue = Math.random();
			goalNum2 = (int) (dValue * 10);
			goalNum3 = (int) ((dValue * 100) - (goalNum2 *10));
			goalNum4 = (int) (dValue * 1000 - goalNum2*100 - goalNum3*10);
		}
	}

	static void Hard() {
		double dValue = Math.random();
		goalNum1 = (int) (dValue * 10);
		goalNum2 = (int) (dValue * 100 - goalNum1 *10);
		goalNum3 = (int) (dValue * 1000 - goalNum1*100 - goalNum2*10);
		goalNum4 = (int) (dValue * 10000 - goalNum1*1000 - goalNum2*100 - goalNum3*10);

		while(goalNum1==goalNum2||goalNum1==goalNum3||goalNum1==goalNum4||goalNum2==goalNum3||goalNum2==goalNum4||goalNum3==goalNum4||goalNum1==0) {
			dValue = Math.random();
			goalNum1 = (int) (dValue * 10);
			goalNum2 = (int) (dValue * 100 - goalNum1 *10);
			goalNum3 = (int) (dValue * 1000 - goalNum1*100 - goalNum2*10);
			goalNum4 = (int) (dValue * 10000 - goalNum1*1000 - goalNum2*100 - goalNum3*10);
		}
	}

	static void Play(int getNum) {
		int getNum1,getNum2,getNum3,getNum4;

		if(goalNum1!=0) { // hard 모드
				getNum1=getNum/1000;
				getNum2=(getNum-getNum1*1000)/100;
				getNum3=(getNum-getNum1*1000-getNum2*100)/10;
				getNum4=(getNum-getNum1*1000-getNum2*100-getNum3*10);
				if(getNum1==getNum2||getNum1==getNum3||getNum1==getNum4||getNum2==getNum3||getNum2==getNum4||getNum3==getNum4||getNum1==0) {
					System.out.println("잘못 입력하셨습니다 다시 입력하세요. ");
				}
				if(Check(getNum1,getNum2,getNum3,getNum4)==false)
					System.out.println("축하합니다");
		}
		else if(goalNum1==0&&goalNum2!=0) { // normal 모드
				getNum2=getNum/100;
				getNum3=(getNum-getNum2*100)/10;
				getNum4=(getNum-getNum2*100-getNum3*10)/1;
				if(getNum2==getNum3||getNum2==getNum4||getNum3==getNum4||getNum2==0) {
					System.out.println("잘못 입력하셨습니다 다시 입력하세요. ");
				}
				if(Check(0,getNum2,getNum3,getNum4)==false)
					System.out.println("축하합니다");
			}
		else { // easy 모드
			{
				getNum3=getNum/10;
				getNum4=(getNum-getNum3*10)/1;
				if(getNum3==getNum4||getNum3==0) {
					System.out.println("잘못 입력하셨습니다 다시 입력하세요. ");
				}
				if(Check(0,0,getNum3,getNum4)==false)
					System.out.println("축하합니다");
			}
		}
	}
	static boolean Check(int num1, int num2, int num3, int num4) {
		int strike = 0;
		int ball = 0;

		if(num1!=0) { // hard 모드
			if(num1==goalNum1) 
				strike++;
			if(num1==goalNum2||num1==goalNum3||num1==goalNum4)
				ball++;
			if(num2==goalNum2) 
				strike++;
			if(num2==goalNum1||num2==goalNum3||num2==goalNum4)
				ball++;
			if(num3==goalNum3) 
				strike++;
			if(num3==goalNum1||num3==goalNum2||num3==goalNum4)
				ball++;
			if(num4==goalNum4) 
				strike++;
			if(num4==goalNum1||num4==goalNum2||num4==goalNum3)
				ball++;
			count++;
			String result =(strike+"S"+ball+"B");
			HBase.GetResult(result);
			if(strike==4) {
				Finish hard = new Finish();
			}
			strike =0;
			ball=0;
		}
		else if(num1==0&&num2!=0) { // normal 모드
			if(num2==goalNum2) 
				strike++;
			if(num2==goalNum3||num2==goalNum4)
				ball++;
			if(num3==goalNum3) 
				strike++;
			if(num3==goalNum2||num3==goalNum4)
				ball++;
			if(num4==goalNum4) 
				strike++;
			if(num4==goalNum2||num4==goalNum3)
				ball++;
			count++;
			String result =(strike+"S"+ball+"B");
			NBase.GetResult(result);
			if(strike==3) {
				Finish normarl = new Finish();
			}
			strike =0;
			ball=0;
		}
		else { // easy 모드
			if(num3==goalNum3)
				strike++;
			if(num3==goalNum4)
				ball++;
			if(num4==goalNum4)
				strike++;
			if(num4==goalNum3)
				ball++;
			count++;
			String result =(strike+"S"+ball+"B");
			EBase.GetResult(result);
			if(strike==2) {
				Finish easy = new Finish();
			}
		}
		return true;
	}
}
