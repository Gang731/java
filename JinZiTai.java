package xunhuan;

import java.util.Scanner;

//�������������

public class JinZiTai {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("����Ҫ�������֣�");
		int num = input.nextInt();
		
		for (int i = 1; i <= num; i++) {
			//j:��������հ�
			for (int j=1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i-1; j++) {
			//i:���ÿһ�����ֵĸ���    ����
				System.out.print(i);
			}
			//ÿһ�����껻��
			System.out.println("");
		}
	}
}
