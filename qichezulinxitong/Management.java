package cn.bdqn.qichezulinxitong;

import java.util.Scanner;

//汽车租赁管理类
public class Management {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String yes;//控制循环的全局变量
		String brand=null;
		String type=null;
		int seat=0;
		Business buss = new Business();
		buss.init();//调用初始化车辆信息
		System.out.println("**********欢迎来到腾飞汽车租赁公司**********");
		do {
			System.out.println("1、轿车       2、货车");
			System.out.print("请选择您要租赁的车型：");
			int num = input.nextInt();
			while(num<0 || num>=3){
				System.out.print("您的输入有误！请重新选择(1、轿车       2、货车)");
				num = input.nextInt();
			}
			switch (num) {
				case 1:
					//轿车
					System.out.println("**********租赁价格**********");
					System.out.println("宝马：X6(800/天)  550i(600/天) \n别克：GL8(600/天)  林荫大道(300/天)");
					System.out.println("租赁天数：>7天（9折）;>30（8折）;>150天（7折）");
					System.out.println("***********************************");
					System.out.print("请选择您要租赁的汽车品牌（1、宝马   2别克）");
					int num1 = input.nextInt();
					while(num1<0 || num1>=3){
						System.out.print("您的输入有误！请重新选择(1、宝马   2别克)");
						num1 = input.nextInt();
					}
					if (num1==1) {
						brand="宝马";
						System.out.print("请选择您租赁的汽车类型(1、X6 2、550i)");
						int num2=input.nextInt();
						type=(num2==1)?"X6":"550i";
					}else if(num1==2){
						brand="别克";
						System.out.print("请选择您租赁的汽车类型(1、GL8 2、林荫大道)");
						int num2=input.nextInt();
						type=(num2==1)?"GL8":"林荫大道";
					}
					break;

				case 2:
					//客车
					type = null;  //汽车型号赋空值
					System.out.println("金杯：16座(800/天)  34座(1500/天) \n金龙：16座(800/天)  34座(1500/天)");
					System.out.println("租赁天数：>=3天（9折）;>=30（8折）;>=30天（7折）;>=150天（6折）");
					System.out.println("***********************************");
					System.out.print("请选择您要租赁的汽车品牌（1、金杯   2、金龙）");
					num1 = input.nextInt();
					while(num1<0 || num1>=3){
						System.out.print("您的输入有误！请重新选择(1、金杯   2、金龙)");
						num1 = input.nextInt();
					}
					if (num1==1) {
						brand="金杯";
						System.out.print("请选择您租赁汽车的座位数(1、16座 2、32座)");
						int num2=input.nextInt();
						seat=(num2==1)?16:32;
					}else if(num1==2){
						brand="金龙";
						System.out.print("请选择您租赁汽车的座位数(1、16座 2、32座)");
						int num2=input.nextInt();
						seat=(num2==1)?16:32;
					}
					break;
			}
			
//			buss.auto(brand, type, seat);
			System.out.print("选择你要租赁的天数:");
			int days = input.nextInt();
			Automobile at = buss.auto(brand, type, seat);
			double money=at.rental(days);
			if (brand.equals("金龙")|| brand.equals("金杯")) {
				System.out.println("租车成功！\n你租的车是："+at.getBrand()+"\t"+seat+"座\n车牌号是："+at.getPlatNumber());
			}else {
				System.out.println("租车成功！\n你租的车是："+at.getBrand()+"\t型号："+type+"\n车牌号是："+at.getPlatNumber());
			}
			System.out.println("您租车的应付租金是："+money+"元");
			System.out.print("是否要继续操作（y/n）");	
			yes=input.next();
			
		} while (yes.equals("y"));
		System.out.println("**************欢迎下次光临****************");
	}
}
