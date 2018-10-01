package cn.bdqn.chihuodingcanxitong;

import java.util.Scanner;

/**
 * 吃货联盟订餐系统
 * @author liuhegang
 * “吃货联盟定餐系统�?�?��
 * 现今已进入网络时代，网上购物、看新闻、交友等人们的日常生活已离不�?��络�?“只 要点点手指，就能送餐上门”，
 * 网上定餐越来越受到都市年轻人的青�?现要求开发一�?网上订餐系统，其具体功能如下�?
 * �??我要订餐 完成用户订餐，每条订单包含如下信息： �?
 * 订餐人姓名：要求用户输入 �?
 * 选择菜品及份数：显示三个菜单序号、名称�?单价、点赞数，提示用户输入要 选择的菜品序号及份数 �?
 * 送餐时间：要求当�?10 �?20 点间整点送餐，要求用户输�?10~20 的整数，�?入错误，重复输入�?
 * 送餐地址：要求用户输�?�?
 * 状�?：两种状态：0：已预定（默认状态） 1、已完成（订单已签收�?�?
 * 总金额： 总金�?= 菜品单价*份数-送餐�?（�?餐费：当单笔订单金额达到 50 元时，免送餐费，否则，需交纳 6 元�?餐费�?
 * 订餐成功后，显示订单信息�?
 * 二�? 查看订单 遍历显示已有定单内容包括：序号�?订餐人姓名�?订餐信息（菜品名和份数）、�?餐时间�?送餐地址�?状�?（已预定或已完成）�? 总金�?
 * 三�? 签收定单 将定单中状�?改为已完�?
 * 四�?删除定单 用户输入订单序号，如该序号定单为已完成状态，可以删除，其它情况给出相应提 示信�?
 * 五�?我要点赞 显示菜品序号、菜品名、单价�?点赞数，提示用户输入要点赞的菜品序号完成对菜 品的点赞�?
 * 六�?�?��系统 �?��整个系统，显示�?谢谢使用，欢迎下次光临�?�?
 *  七�?菜单切换 用户可根据显示的主菜单，输入功能编号执行相应的功能，当输�?1~5 时，执行相应�?
 */
public class VersionAlliance {
//	@SuppressWarnings("unused")
	public static void main(String[]args){
		//数据主体  初始化订单信息
		String[] names = new String[4];		//订单人姓�?
		String[] meums = new String[4];  	//菜品
		int[] times = new int[4];			//送餐时间 要求当天 10 �?20 点间整点送餐
		String[] address = new String[4];	//送餐地址
		int[] status = new int[4];			//订单状�?：两种状态：0：已预定（默认状态） 1、已完成（订单已签收�?
		double[] totalMoney =  new double[4];		//订单金额
		
		//菜单信息
		String[] dishNames = {"红烧带鱼","鱼香肉丝","时令鲜蔬"};		//菜品名称
		double[] prices = {38.0,20.0,10.0};							//菜品价格
		int[] likeNums = new int[3];								//点赞�?
		
		//初始化订�?
		names[0] = "张晴";
		meums[0] = "红烧带鱼 2份";
		times[0] = 12;
		address[0] = "天成路107号";
		status[0] = 1;
		totalMoney[0] = 76.0;
		
		names[1] = "张晴";
		meums[1] = "鱼香肉丝 2份";
		times[1] = 12;
		address[1] = "天成路107号";
		status[1] = 0;
		totalMoney[1] = 46.0; 
		
		//系统主菜�?
		Scanner input = new Scanner(System.in);
		int num = 0;   //全局变量，输�?时返回主菜单
		boolean isExit = false;   //标志用户是否�?��系统    true表示�?��系统
		System.out.println("欢迎使用“吃货联盟订餐系统”");
		do{
			System.out.println("***************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("***************************");
			System.out.print("请选择：");
			num = input.nextInt();
			switch (num) {
				case 1:
					//1、我要订�?
					System.out.println("***我要订餐***");
					boolean isOrderFood = false ; //标志能否定餐   true表示可以订餐
					//判断能否定餐
					for (int j = 0; j < names.length; j++) {
						if (names[j]==null) {
							isOrderFood = true;   //表示可以订餐
							
							System.out.print("请输入订单人姓名：");
							String name = input.next();
							System.out.println("序号\t菜名\t单价");
							for (int i = 0; i < dishNames.length; i++) {
								//输出菜品信息
								System.out.println((i+1)+"\t"+dishNames[i]+"\t"+prices[i]+"元"+"\t"+(likeNums[i]>0?likeNums[i]+"赞":" "));
							}
							System.out.print("请选择你要点的菜品编号：");
							int number = input.nextInt();
							System.out.print("请选择你要点的份数：");
							int copies = input.nextInt();
							String meumss = dishNames[number-1]+" "+copies+"份";    //菜品信息
							int time ;
							//送餐时间：要求当�?10 �?20 点间整点送餐，要求用户输�?10~20 的整数，�?入错误，重复输入�?
							System.out.print("请输入送餐时(送餐时间是0点至20点整点整点送餐)");
							time = input.nextInt();
							do{
								if (time<10 || time>20) {
									System.out.print("输入错误，请重新输入送餐时间(送餐时间是0点至20点整点整点送餐)");
									time = input.nextInt();
								}
							}while(time<10 || time>20);
							System.out.print("请输入送餐地址：");
							String location = input.next();
							//总金�?= 菜品单价*份数+送餐�?（�?餐费：当单笔订单金额达到 50 元时，免送餐费，否则，需交纳 6 元�?餐费�?
							double total = prices[number-1]*copies;		//餐费
							double SongCanFei = total>=50?0:6;			//送餐�?
							double grossAmount =  total + SongCanFei;	//总金�?
							System.out.println("订餐成功!");
							System.out.println("你的订的是："+meumss);
							System.out.println("送餐时间:"+time);
							System.out.println("餐费:"+total+"元，送餐费："+SongCanFei+"，总计："+grossAmount);
							//保存订单
							names[j] = name;
							meums[j] = meumss;
							times[j] = time;
							address[j] = location;
							status[j] = 0;
							totalMoney[j] = grossAmount;
							break;
						}
					}		
					if (!isOrderFood) {				//餐袋已满 ，不能订�?
						System.out.println("餐袋已满");
					}	
					break;
					
				case 2:
					//2、查看餐�?
					System.out.println("***查看餐袋***");
					System.out.println("序号\t订餐人\t餐品信息\t"+"  "+"送餐日期\t"+"     "+"送餐地址\t"+" "+"总金额\t"+" "+"订单状态");
					for (int i = 0; i < names.length; i++) {
						if (names[i]!=null) {
							String state = (status[i]==0)?"已预订":"已完成";		//判断订单状�?
							String  timess = times[i]+"点";
							String totals = totalMoney[i]+"元";
							System.out.println((i+1)+"\t"+names[i]+"\t"+meums[i]+"\t"+timess+"\t"+address[i]+"\t"+totals+"\t  "+state);
						}
					}
					break;
				case 3:
					//3、签收订�?
					System.out.println("***签收订单***");
					System.out.print("请选择要签收的订单编号：");
					boolean isSerial = false;	//标志找到签收定单  true表示找到
					int serial = input.nextInt();
					for (int i = 0; i < names.length; i++) {
						if (names[i]!=null && status[i]==0 && serial==(i+1)){
								status[i] = 1 ;
								isSerial = true;	//表示找到签收订单
							System.out.println("订单签收成功!");
							break;
						}else if (names[i]!=null && status[i]==1 && serial==(i+1)) {
							isSerial = true;		//表示找到签收订单
							System.out.println("您的订单已完成签收，不能再次签收!");
							break;
						}
					}
					if (!isSerial) {
						System.out.println("您选择的订单不存在！");
					}
					break;
				case 4:
					//4、删除订�?
					System.out.println("***删除订单***");
					boolean isDle = false;		//标志找到要删除的订单  true 表示找到
					System.out.print("请输入要删除的定单编号：");
					int del = input.nextInt();
					for (int i = 0; i < names.length; i++) {
						if (names[i]!=null && status[i]==1 && del==(i+1)) {
							isDle = true;
							//订单依次先前�?
							for (int j = del-1; j < names.length-1 && names[j]!=null; j++) {
								names[j]=names[j+1];
								meums[j] = meums[j+1];
								times[j] = times[j+1];
								address[j] = address[j+1];
								status[j] = status[j+1];
								totalMoney[j] = totalMoney[j+1];
							}
							//删除�?���?��订单
							names[names.length-1]=null;
							meums[names.length-1] = null;
							times[names.length-1] = 0;
							address[names.length-1] = null;
							status[names.length-1] = 0;
							totalMoney[names.length-1] = 0;
							
							System.out.println("删除成功!");
							break;
						}else if(names[i]!=null && status[i]==0 && del==(i+1)) {
							isDle = true;
							System.out.println("您的订单状态未签收不能删除！");
							break;
						}
					}
					if (!isDle) {
						System.out.println("您的订单不存在！");
					}
					break;
				case 5:
					//5、我要点�?
					boolean islike = false;		//标志能否点赞   true表示可以
					System.out.println("***我要点赞***");
					System.out.println("序号\t菜名\t单价\t");
					for (int i = 0; i < dishNames.length; i++) {
						System.out.println((i+1)+"\t"+dishNames[i]+"\t"+prices[i]+"元"+"\t"+(likeNums[i]>0?likeNums[i]+"赞":" "));
					}
					System.out.print("请你选择要点赞的菜品:");
					int like = input.nextInt();
					for (int i = 0; i < dishNames.length; i++) {
						if (i+1==like && like<=dishNames.length) {
							likeNums[like-1]++;
							islike = true;
							break;
						}
					}
					if (islike) {
						System.out.println("点赞成功!");
					}else {
						System.out.println("点赞的菜品不存在!");
					}
					break;
				case 6:
					//6、�?出系�?
					isExit = true ;
					break;
				default:
					isExit = true ;
					break;
				}
			if (!isExit) {
				System.out.print("输入0返回:");
				num = input.nextInt();
			}else{
				break;
			}
		}while(num==0);
		System.out.println("谢谢使用，欢迎下次光临！");
	}
}
