//冒泡排序5个数
public class MaoPao {
	public static void main(String[]ages){
		int[] nums = {98,76,100,6,65};
		//冒泡排序
		for(int i=0;i<=nums.length;i++){
			for(int j=0;j<nums.length-1-i;j++){
				//两个相邻的比较，如果前面数字大，则交换
				if(nums[j]>nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] =temp;
				}
			}
			
		}
		//输出排序后的数组元素
		for(int num:nums){
			System.out.print(num+"\t");
		}
	}
}
