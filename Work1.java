import java.util.Arrays;

//�������������
public class Work1 {
	public static void main(String[]agse){
		int[] array ={1,3,-1,5,-2};
		System.out.println("ԭ���飺");
		for(int i:array){
			System.out.print(i+"\t");
		}
		Arrays.sort(array);   //��������
		System.out.println("\n��������飺");
		for(int i:array){
			System.out.print(i+"\t");
		}
		
	}
}
