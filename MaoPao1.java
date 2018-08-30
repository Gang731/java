import java.util.*;
public class MaoPao1 {
	public static void main(String[]ages){
		//使用冒泡排序实现5个数的降序排列
		Scanner input=new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("请输入5名学生的成绩：");
		for(int i=0;i<nums.length;i++){
			nums[i]=input.nextInt();
		}
		for(int i=0;i<nums.length-1;i++){
			for(int j=0;j<nums.length-1-i;j++){
				if(nums[j]<nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.print("学员成绩按降序排列：");
		for(int num:nums){
			System.out.print(num+"\t");
		}
		
		
		//使用冒泡排序对N数字排序，共比较几次可得到结果
		int cishu=0;
		for(int i=3;i<=nums.length;i++){
			cishu+=i;
		}
		int zongcishu=cishu-(nums.length-3);
		System.out.print("\n使用冒泡排序对N数字排序，共比较"+zongcishu+"次可得到结果");
	}	
}
