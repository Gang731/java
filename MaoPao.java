//ð������5����
public class MaoPao {
	public static void main(String[]ages){
		int[] nums = {98,76,100,6,65};
		//ð������
		for(int i=0;i<=nums.length;i++){
			for(int j=0;j<nums.length-1-i;j++){
				//�������ڵıȽϣ����ǰ�����ִ��򽻻�
				if(nums[j]>nums[j+1]){
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] =temp;
				}
			}
			
		}
		//�������������Ԫ��
		for(int num:nums){
			System.out.print(num+"\t");
		}
	}
}
