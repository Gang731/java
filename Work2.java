import java.util.*;
//�ü���¼��10�������Ϸ�����Ϊ1.2.3��������3 ����Ϊ�Ƿ����֣��ֱ�ͳ�����ǵĸ���

public class Work2 {
	public static void main(String[]geas){
		Scanner input=new Scanner(System.in);
		System.out.println("������10������");
		int[] array= new int[10];		//��������
		
		//ѭ��¼������
		for(int i=0;i<array.length;i++){
			int num=input.nextInt();
			array[i]=num;
		}
		
		//ѭ���������
		System.out.print("�����10����Ϊ:"+"\t");
		for(int i:array){
			System.out.print(i+"\t");
		}
		
		//ͳ�Ƹ���
		Arrays.sort(array);
		int num1=0;			//����������1�ĸ���
		int num2=0;			//����������2�ĸ���
		int num3=0;			//����������3�ĸ���
		int num4=0;			//����������4�ĸ���
		for(int i=0;i<array.length;i++){
			/*if(array[i]==1){
				num1++;
			}else if(array[i]==2){
				num2++;
			}else if(array[i]==3){
				num3++;
			}else{
				num4++;
			}*/
			switch(array[i]){
				case 1:
					num1++;
					break;
				case 2:
					num2++;
					break;
				case 3:
					num3++;
					break;
				default:
					num4++;
					break;
			}
			
		}
		System.out.print("\n����1�ĸ�����"+num1+"\n");
		System.out.print("����2�ĸ�����"+num2+"\n");
		System.out.print("����3�ĸ�����"+num3+"\n");
		System.out.print("�����ֵĸ�����"+num4+"\n");
	}	
}
