package cn.bdqn.qichezulinxitong;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		YeWu yw=new YeWu();
		yw.add();
		String brand=null;
		String type=null;
		int seat=0; 
		System.out.println("***********欢迎光临国泰汽车租赁公司***********");
		System.out.println("1、轿车\t2、客车");
		System.out.print("请选择你要你租赁的汽车：");
		int num =input.nextInt();
		if(num==1){
			System.out.print("请选择你的汽车品牌：1、宝马   2、别克");
			num = input.nextInt();
			if (num==1) {
				brand="宝马";
				System.out.print("请选择你的汽车类型：1、X6  2、550i");
				num = input.nextInt();
				type=num==1?"X6":"550i";
			}else {
				brand="别克";
				System.out.print("请选择你的汽车类型：1、GL8 2、林荫大道");
				num = input.nextInt();
				type=num==1?"GL8":"林荫大道";
			}
			
		}else {
			System.out.print("请选择你的汽车品牌：1、金 龙  2、金杯");
			num = input.nextInt();
			if (num==1) {
				brand="金龙";
				System.out.print("请选择座位数：1、16座   2、32座");
				num = input.nextInt();
				seat=num==1?16:32;
			}else {
				brand="金杯";
				System.out.print("请选择座位数：1、16座   2、32座");
				num = input.nextInt();
				seat=num==1?16:32;
			}
		}
		System.out.print("请输入你要租赁的天数：");
		int days=input.nextInt();
		Automobile automobile = yw.find(brand, type, seat);
		double money = automobile.rental(days);
		System.out.println("租车成功！你的车牌号是："+automobile.getPlatNumber());
		System.out.println("租车总共费用是："+money+"元");
		System.out.println("欢迎下次光临！！！");
	}
}
