import java.util.Scanner;

/*
 * ������Ϸ
 * ��һ�����У�8,4,2,1,23,344,12
 * 1.ѭ��������е�ֵ
 * 2.������������ֵ֮��
 * 3.�Ӽ���������¼��һ�����ݣ��ж��Ƿ��������
*/
public class Guess {
	public static void main(String[] args) {
		int[] num = {8,4,2,1,23,344,12};
		
		int sum = 0;  //��ʼ�������еĺ�
		
//		1.ѭ��������е�ֵ
		System.out.print("���У�\t");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
			sum += num[i];
		}
//		2.������������ֵ֮��
		System.out.println("\n����������ֵ֮��:"+sum);
		
//		3.�Ӽ�����3.�Ӽ���������¼��һ�����ݣ��ж��Ƿ��������
		String whether = "";	  //ѭ����������ʼֵ
		boolean flag = false;    //��ʶ
		Scanner input = new Scanner(System.in);
		System.out.println("*******������Ϸ********");
		do{
			System.out.print("������¼��һ�����ݣ��²��Ƿ����������");
			int guess = input.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (num[i]==guess) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("��ϲ���¶��ˣ�����");
				System.out.println("���������");
				break;
			}else {
				System.out.print("���ź�û�в��У��Ƿ����(y/n��)");
				whether = input.next();
				
			}
		}while(whether.equals("y"));	
		if(whether.equals("n")){
			System.out.println("���������");
		}
	}
}
