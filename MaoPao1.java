import java.util.*;
public class MaoPao1 {
	public static void main(String[]ages){
		//ʹ��ð������ʵ��5�����Ľ�������
		Scanner input=new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("������5��ѧ���ĳɼ���");
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
		System.out.print("ѧԱ�ɼ����������У�");
		for(int num:nums){
			System.out.print(num+"\t");
		}
		
		
		//ʹ��ð�������N�������򣬹��Ƚϼ��οɵõ����
		int cishu=0;
		for(int i=3;i<=nums.length;i++){
			cishu+=i;
		}
		int zongcishu=cishu-(nums.length-3);
		System.out.print("\nʹ��ð�������N�������򣬹��Ƚ�"+zongcishu+"�οɵõ����");
	}	
}
