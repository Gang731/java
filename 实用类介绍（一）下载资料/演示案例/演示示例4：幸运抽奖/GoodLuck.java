package cn.com.jbit;

import java.util.Scanner;

/*
 * 幸运抽奖：会员号的百位数与系统随机数相同，即为中奖
 * */
public class GoodLuck {
	
	public static void main(String[] args) {
		//随机产生一个0-9之间的任意整数
		int random=(int)(Math.random()*10);
//		System.out.println(random);
		//从控制台接收一个任意的四位数
		System.out.print("请输入4位会员号：");
		Scanner input=new Scanner(System.in);
		int custNo=input.nextInt();
		//获得会员号的百位数
		int baiwei=custNo/100%10;
		if(baiwei==random){
			System.out.println(custNo+"是幸运客户，获得精美MP3一个。");
		}else{
			System.out.println(custNo+" 谢谢您的支持！");
		}
		
	}
}
