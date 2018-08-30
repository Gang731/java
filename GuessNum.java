import java.util.Scanner;

 /*
  有一个数列：8,4,2,1,23,344,12
 循环输出数列的值
 求数列中所有数值的和
 猜猜游戏：从键盘中任意输出一个数据，判断数列中是否包含此数
 */
public class GuessNum {
	public static void main(String[]ages){
		Scanner input =new Scanner(System.in);
		int[] nums={8,4,2,1,23,344,12};
		
		//表示：用户输入是否猜对   true表示猜对    false表示没猜对
		boolean flag=false;
		
		//总和
		int sum = 0;
		 
		//循环输出数列的值
		System.out.println("数列中的值为：");
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\t");
			sum += nums[i];
		}
		System.out.println("\n数列中的数值的和是："+sum);
		 
		 
		 //输入数字，数组总是否包含此数
		do{
			System.out.print("你猜猜有哪个数：");
		 	int num = input.nextInt();
		 	for(int nums1:nums){
		 		if(num==nums1){
		 			flag = true;
		 			break;
		 		}
		 	}
		 	if(flag){
		 		System.out.println("恭喜你猜才对了");
			}else{
				System.out.println("很遗憾没猜对 ,继续加油！");
			}
		}while(!flag);	//没有猜对的话继续猜
	 }
}
