package xunhuan;

import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������༶��������");
		int number = input.nextInt();
		
		int statistics = 0;   //ͳ�Ʒ�������80�ֵ�ѧ���м���
		for (int i = 1; i <= number; i++) {
			System.out.print("�������"+i+"λѧ���ɼ���");
			double num = input.nextDouble();
			if(num>=80){
				statistics++;
			}
		}
		//ͳ��80�����ϵ�ѧ������
		System.out.println("80�����ϵ�ѧ�������ǣ�"+statistics);
		
		//ͳ��80������ѧ����ռ�ı���       (double)statisticsת������
		double ratio = (double)statistics*100/number;
		System.out.println("ͳ��80�����ϵ�ѧ����ռ�ı���Ϊ��"+ratio+"%");
	}
}
