package xunhuan;

import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入班级总人数：");
		int number = input.nextInt();
		
		int statistics = 0;   //统计分数大于80分的学生有几个
		for (int i = 1; i <= number; i++) {
			System.out.print("请输入第"+i+"位学生成绩：");
			double num = input.nextDouble();
			if(num>=80){
				statistics++;
			}
		}
		//统计80分以上的学生人数
		System.out.println("80分以上的学生人数是："+statistics);
		
		//统计80分以上学生所占的比例       (double)statistics转换类型
		double ratio = (double)statistics*100/number;
		System.out.println("统计80分以上的学生所占的比例为："+ratio+"%");
	}
}
