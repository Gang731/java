package xunhuan;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ѧ��������");
		String name = input.next();
		double sum = 0; // �ɼ��ֳܷ�ʼֵ
		
		boolean flag = false; //��ʶ��false��ʶû�����
		//ѭ��¼��ѧ���ɼ�
		for(int i=1;i<=5;i++){
			System.out.print("�������"+i+"�ſεĳɼ���");
			double score = input.nextDouble();
			if(score<0){
				System.out.println("��Ǹ������¼�����������¼��");
				flag = true;   //��ʾ��������
				break;
			}
			sum+=score;     //�ۼƷ���
		}
		//ƽ����
		double avg = sum/5;
		
		if (!flag) {
			System.out.println("ѧ����5�ſγɼ���ƽ�����ǣ�"+avg);
		}
		
	}
}