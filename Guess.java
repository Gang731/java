import java.util.Scanner;

/*
 * 猜数游戏
 * 有一个数列：8,4,2,1,23,344,12
 * 1.循环输出数列的值
 * 2.求数列中所有值之和
 * 3.从键盘中任意录入一个数据，判断是否包含此数
*/
public class Guess {
	public static void main(String[] args) {
		int[] num = {8,4,2,1,23,344,12};
		
		int sum = 0;  //初始化数列中的和
		
//		1.循环输出数列的值
		System.out.print("数列：\t");
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]+"\t");
			sum += num[i];
		}
//		2.求数列中所有值之和
		System.out.println("\n数列中所有值之和:"+sum);
		
//		3.从键盘中3.从键盘中任意录入一个数据，判断是否包含此数
		String whether = "";	  //循环条件赋初始值
		boolean flag = false;    //标识
		Scanner input = new Scanner(System.in);
		System.out.println("*******猜字游戏********");
		do{
			System.out.print("请任意录入一个数据，猜猜是否包含此数：");
			int guess = input.nextInt();
			for (int i = 0; i < num.length; i++) {
				if (num[i]==guess) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("恭喜您猜对了！！！");
				System.out.println("程序结束！");
				break;
			}else {
				System.out.print("很遗憾没有猜中！是否继续(y/n：)");
				whether = input.next();
				
			}
		}while(whether.equals("y"));	
		if(whether.equals("n")){
			System.out.println("程序结束！");
		}
	}
}
