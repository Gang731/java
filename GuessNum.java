import java.util.Scanner;

 /*
  ��һ�����У�8,4,2,1,23,344,12
 ѭ��������е�ֵ
 ��������������ֵ�ĺ�
 �²���Ϸ���Ӽ������������һ�����ݣ��ж��������Ƿ��������
 */
public class GuessNum {
	public static void main(String[]ages){
		Scanner input =new Scanner(System.in);
		int[] nums={8,4,2,1,23,344,12};
		
		//��ʾ���û������Ƿ�¶�   true��ʾ�¶�    false��ʾû�¶�
		boolean flag=false;
		
		//�ܺ�
		int sum = 0;
		 
		//ѭ��������е�ֵ
		System.out.println("�����е�ֵΪ��");
		for(int i=0;i<nums.length;i++){
			System.out.print(nums[i]+"\t");
			sum += nums[i];
		}
		System.out.println("\n�����е���ֵ�ĺ��ǣ�"+sum);
		 
		 
		 //�������֣��������Ƿ��������
		do{
			System.out.print("��²����ĸ�����");
		 	int num = input.nextInt();
		 	for(int nums1:nums){
		 		if(num==nums1){
		 			flag = true;
		 			break;
		 		}
		 	}
		 	if(flag){
		 		System.out.println("��ϲ��²Ŷ���");
			}else{
				System.out.println("���ź�û�¶� ,�������ͣ�");
			}
		}while(!flag);	//û�в¶ԵĻ�������
	 }
}
