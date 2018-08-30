package xunhuan;

import java.util.Scanner;

public class Avg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入学生姓名：");
		String name = input.next();
		double sum = 0; // 成绩总分初始值
		
		boolean flag = false; //标识：false标识没有输错
		//循环录入学生成绩
		for(int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"门课的成绩：");
			double score = input.nextDouble();
			if(score<0){
				System.out.println("抱歉，分数录入错误，请重新录入");
				flag = true;   //表示输入有误
				break;
			}
			sum+=score;     //累计分数
		}
		//平均分
		double avg = sum/5;
		
		if (!flag) {
			System.out.println("学生的5门课成绩的平均分是："+avg);
		}
		
	}
}