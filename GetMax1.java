import java.util.Scanner;

//��һ��ѧԱ�ɼ�{99,85,82,63,60}�����ǰ���������
//Ҫ����һλѧԱ�ɼ�����������ɼ����У������ֽ���
public class GetMax1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] score = new int[6];
		score[0]=99	;	
		score[1]=85	;
		score[2]=82	;
		score[3]=63	;
		score[4]=60	;
		System.out.print("�����������ɼ���");
		int num=input.nextInt();
		//��num���뵽score��indexλ��
		int index=score.length-1;
		
		//���û�����ĵ����ݺ������е�5�������αȽϣ�ֱ��������һ������С����ֵΪֹ
		// ��һ������С����ֵ���ڵ�λ�ã����������ֵҪ�����λ��index
			for(int i=0;i<score.length;i++){
				if(num>score[i]){
					index = i;
					break;
			}
		}
		//��ԭ��λ�õ���ֵ���������ƶ��������յأ�������ֵ
		for(int j=score.length-1;j>index;j--){
			score[j]=score[j-1];
		}
		score[index]=num;
		System.out.println("����ɼ����±��ǣ�"+index);
		System.out.println("�����������Ԫ�����£�");
		for(int num1:score){
			System.out.print(num1+"\t");
		}
	}
}
