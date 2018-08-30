import java.util.*;

//分别录入统计3个班的个5名同学成绩
public class Score {
	public static void main(String[]ages){
		Scanner input=new Scanner(System.in);
		int[][]array=new int[2][5];
		
		for(int i=0; i<array.length;i++){
			System.out.println("...............请输入第"+(i+1)+"个班的成绩................");
			for(int j=0;j<array[i].length;j++){
				System.out.print("请输入第"+(j+1)+"名学生成绩");
				array[i][j]=input.nextInt();
			}
		}
		 
		System.out.println("..............成绩统计............."); 
		int sum=0;
		for(int i=0; i<array.length;i++){
			System.out.print("这是第"+(i+1)+"个班,");
			sum=0;
			for(int j=0;j<array[i].length;j++){
				sum += array[i][j];
			}
			System.out.println("这个班的总成绩是："+sum);
		}
		
	}
}
