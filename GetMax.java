import java.util.Scanner;


public class GetMax {
	//��ȡ5��ͬѧ���Գɼ���ȡ��߷����
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores =new double[5];
		double max=0;
		for(int i=0;i<scores.length;i++){
			System.out.print("�������"+(i+1)+"��ͬѧ�ĳɼ�:");
			scores[i] = input.nextDouble();
				if(scores[i]>max){
					max=scores[i];
				}
		}
		System.out.print("��߷��ǣ�"+max);
	}
}
