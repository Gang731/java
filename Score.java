import java.util.*;

//�ֱ�¼��ͳ��3����ĸ�5��ͬѧ�ɼ�
public class Score {
	public static void main(String[]ages){
		Scanner input=new Scanner(System.in);
		int[][]array=new int[2][5];
		
		for(int i=0; i<array.length;i++){
			System.out.println("...............�������"+(i+1)+"����ĳɼ�................");
			for(int j=0;j<array[i].length;j++){
				System.out.print("�������"+(j+1)+"��ѧ���ɼ�");
				array[i][j]=input.nextInt();
			}
		}
		 
		System.out.println("..............�ɼ�ͳ��............."); 
		int sum=0;
		for(int i=0; i<array.length;i++){
			System.out.print("���ǵ�"+(i+1)+"����,");
			sum=0;
			for(int j=0;j<array[i].length;j++){
				sum += array[i][j];
			}
			System.out.println("�������ܳɼ��ǣ�"+sum);
		}
		
	}
}
