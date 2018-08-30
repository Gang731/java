import java.util.Scanner;

//有一组学员成绩{99,85,82,63,60}将他们按降序排列
//要增加一位学员成绩，将他插入成绩序列，并保持降序
public class GetMax1 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int[] score = new int[6];
		score[0]=99	;	
		score[1]=85	;
		score[2]=82	;
		score[3]=63	;
		score[4]=60	;
		System.out.print("请输入新增成绩：");
		int num=input.nextInt();
		//将num插入到score的index位置
		int index=score.length-1;
		
		//将用户插入的的数据和数组中的5个数依次比较，直到遇到第一个比他小的数值为止
		// 第一个比他小的数值所在的位置，就是这个数值要插入的位置index
			for(int i=0;i<score.length;i++){
				if(num>score[i]){
					index = i;
					break;
			}
		}
		//将原来位置的数值依次往后移动，留出空地；插入新值
		for(int j=score.length-1;j>index;j--){
			score[j]=score[j-1];
		}
		score[index]=num;
		System.out.println("插入成绩的下标是："+index);
		System.out.println("插入的新数组元素如下：");
		for(int num1:score){
			System.out.print(num1+"\t");
		}
	}
}
