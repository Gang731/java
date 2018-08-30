package xunhuan;

import java.util.Scanner;

//输出等腰三角行

public class JinZiTai {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("你想要几行数字：");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			//j:等于输出空白
			for (int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
			//i:输出每一行数字的个数    列数
				System.out.print(i);
			}
			//每一行输完换行
			System.out.println("");
		}
	}
}
