import java.util.Scanner;


public class GetMax {
	//获取5名同学考试成绩，取最高分输出
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] scores =new double[5];
		double max=0;
		for(int i=0;i<scores.length;i++){
			System.out.print("请输入第"+(i+1)+"名同学的成绩:");
			scores[i] = input.nextDouble();
				if(scores[i]>max){
					max=scores[i];
				}
		}
		System.out.print("最高分是："+max);
	}
}
