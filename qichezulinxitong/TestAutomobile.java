package cn.bdqn.qichezulinxitong;

import java.util.Scanner;

public class TestAutomobile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String brand=null;
		String type=null;
		int seat=0;
		System.out.println("*************欢迎来到北大汽车租赁公司**************");
		System.out.println("1、轿车       2、货车");
		System.out.print("请选择您要租赁的车型：");
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.print("请选择您要租赁的汽车品牌（1、宝马   2、别克）");
			num = input.nextInt();
			switch (num) {
			case 1:
				brand="宝马";
				System.out.print("请选择您租赁的汽车类型(1、X6 2、550i)");
				num = input.nextInt();
				type=num==1?"X6":"550i";
				break;

			default:
				brand="别克";
				System.out.print("请选择您租赁的汽车类型(1、GL8 2、林荫大道)");
				num = input.nextInt();
				type=num==1?"GL8":"林荫大道";
				break;
			}
			break;

		default:
			type=null;
			System.out.print("请选择您要租赁的汽车品牌（1、金杯   2、金龙）");
			num = input.nextInt();
			switch (num) {
			case 1:
				brand="金杯";
				System.out.print("请选择您租赁汽车的座位数(1、16座 2、32座)");
				num = input.nextInt();
				seat=num==1?16:32;
				break;

			default:
				brand="金龙";
				System.out.print("请选择您租赁汽车的座位数(1、16座 2、32座)");
				num = input.nextInt();
				seat=num==1?16:32;
				break;
			}
			break;
		}
		System.out.print("选择你要租赁的天数:");
		int days = input.nextInt();
		Zulin zulin = new Zulin();
		zulin.add();
		Automobile at = zulin.find(brand, type, seat);
		double money=at.rental(days);
		if (brand.equals("金龙")|| brand.equals("金杯")) {
			System.out.println("租车成功！\n你租的车是："+at.getBrand()+"\t"+seat+"座\n车牌号是："+at.getPlatNumber());
		}else {
			System.out.println("租车成功！\n你租的车是："+at.getBrand()+"\t型号："+type+"\n车牌号是："+at.getPlatNumber());
		}
		System.out.println("您租车的应付租金是："+money+"元");
		System.out.println("**************欢迎下次光临****************");
	}
}
