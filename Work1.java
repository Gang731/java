import java.util.Arrays;

//升序后排列数组
public class Work1 {
	public static void main(String[]agse){
		int[] array ={1,3,-1,5,-2};
		System.out.println("原数组：");
		for(int i:array){
			System.out.print(i+"\t");
		}
		Arrays.sort(array);   //升序数组
		System.out.println("\n排序后数组：");
		for(int i:array){
			System.out.print(i+"\t");
		}
		
	}
}
