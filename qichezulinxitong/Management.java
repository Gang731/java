package cn.bdqn.qichezulinxitong;

import java.util.Scanner;

//�������޹�����
public class Management {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String yes;//����ѭ����ȫ�ֱ���
		String brand=null;
		String type=null;
		int seat=0;
		Business buss = new Business();
		buss.init();//���ó�ʼ��������Ϣ
		System.out.println("**********��ӭ�����ڷ��������޹�˾**********");
		do {
			System.out.println("1���γ�       2������");
			System.out.print("��ѡ����Ҫ���޵ĳ��ͣ�");
			int num = input.nextInt();
			while(num<0 || num>=3){
				System.out.print("������������������ѡ��(1���γ�       2������)");
				num = input.nextInt();
			}
			switch (num) {
				case 1:
					//�γ�
					System.out.println("**********���޼۸�**********");
					System.out.println("����X6(800/��)  550i(600/��) \n��ˣ�GL8(600/��)  ������(300/��)");
					System.out.println("����������>7�죨9�ۣ�;>30��8�ۣ�;>150�죨7�ۣ�");
					System.out.println("***********************************");
					System.out.print("��ѡ����Ҫ���޵�����Ʒ�ƣ�1������   2��ˣ�");
					int num1 = input.nextInt();
					while(num1<0 || num1>=3){
						System.out.print("������������������ѡ��(1������   2���)");
						num1 = input.nextInt();
					}
					if (num1==1) {
						brand="����";
						System.out.print("��ѡ�������޵���������(1��X6 2��550i)");
						int num2=input.nextInt();
						type=(num2==1)?"X6":"550i";
					}else if(num1==2){
						brand="���";
						System.out.print("��ѡ�������޵���������(1��GL8 2��������)");
						int num2=input.nextInt();
						type=(num2==1)?"GL8":"������";
					}
					break;

				case 2:
					//�ͳ�
					type = null;  //�����ͺŸ���ֵ
					System.out.println("�𱭣�16��(800/��)  34��(1500/��) \n������16��(800/��)  34��(1500/��)");
					System.out.println("����������>=3�죨9�ۣ�;>=30��8�ۣ�;>=30�죨7�ۣ�;>=150�죨6�ۣ�");
					System.out.println("***********************************");
					System.out.print("��ѡ����Ҫ���޵�����Ʒ�ƣ�1����   2��������");
					num1 = input.nextInt();
					while(num1<0 || num1>=3){
						System.out.print("������������������ѡ��(1����   2������)");
						num1 = input.nextInt();
					}
					if (num1==1) {
						brand="��";
						System.out.print("��ѡ����������������λ��(1��16�� 2��32��)");
						int num2=input.nextInt();
						seat=(num2==1)?16:32;
					}else if(num1==2){
						brand="����";
						System.out.print("��ѡ����������������λ��(1��16�� 2��32��)");
						int num2=input.nextInt();
						seat=(num2==1)?16:32;
					}
					break;
			}
			
//			buss.auto(brand, type, seat);
			System.out.print("ѡ����Ҫ���޵�����:");
			int days = input.nextInt();
			Automobile at = buss.auto(brand, type, seat);
			double money=at.rental(days);
			if (brand.equals("����")|| brand.equals("��")) {
				System.out.println("�⳵�ɹ���\n����ĳ��ǣ�"+at.getBrand()+"\t"+seat+"��\n���ƺ��ǣ�"+at.getPlatNumber());
			}else {
				System.out.println("�⳵�ɹ���\n����ĳ��ǣ�"+at.getBrand()+"\t�ͺţ�"+type+"\n���ƺ��ǣ�"+at.getPlatNumber());
			}
			System.out.println("���⳵��Ӧ������ǣ�"+money+"Ԫ");
			System.out.print("�Ƿ�Ҫ����������y/n��");	
			yes=input.next();
			
		} while (yes.equals("y"));
		System.out.println("**************��ӭ�´ι���****************");
	}
}
