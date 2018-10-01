package cn.bdqn.chihuodingcanxitong;
import java.sql.Time;
import java.util.Scanner;

/**
 * 吃货联盟订餐系统
 * @author liuhegang
 *“吃货联盟定餐系统�?�?��说明
	现今已进入网络时代，网上购物、看新闻、交友等人们的日常生活已离不�?��络�?“只 要点点手指，就能送餐上门”，
	网上定餐越来越受到都市年轻人的青�?现要求开发一�?网上订餐系统，其具体功能如下�?
  �??我要订餐 完成用户订餐，每条订单包含如下信息： �?
  	订餐人姓名：要求用户输入 �?
  	选择菜品及份数：显示三个菜单序号、名称�?单价、点赞数，提示用户输入要 选择的菜品序号及份数 �?
  	送餐时间：要求当�?10 �?20 点间整点送餐，要求用户输�?10~20 的整数，�?入错误，重复输入�?
  	送餐地址：要求用户输�?�?
  	状�?：两种状态：0：已预定（默认状态） 1、已完成（订单已签收�?�?
  	总金额： 总金�?= 菜品单价*份数-送餐�?（�?餐费：当单笔订单金额达到 50 元时，免送餐费，否则，需交纳 6 元�?餐费�?
  	订餐成功后，显示订单信息�?
   二�? 查看订单 遍历显示已有定单内容包括：序号�?订餐人姓名�?订餐信息（菜品名和份数）、�?餐时间�?送餐地址�?状�?（已预定或已完成）�? 总金�?
   三�? 签收定单 将定单中状�?改为已完�?
   四�?删除定单 用户输入订单序号，如该序号定单为已完成状态，可以删除，其它情况给出相应提 示信�?
   五�?我要点赞 显示菜品序号、菜品名、单价�?点赞数，提示用户输入要点赞的菜品序号完成对菜 品的点赞�?
   六�?�?��系统 �?��整个系统，显示�?谢谢使用，欢迎下次光临�?�?
    七�?菜单切换 用户可根据显示的主菜单，输入功能编号执行相应的功能，当输�?1~5 时，执行相应�?
 */
public class VersionAlliances {
	public static void main(String[]ages){
		//数据主体：一组订单信�?
		String[] names = new String[4];             //订餐人姓�?
		String[] dishMegs =new String[4];     //�??菜品信息
		int[] times = new int[4];					//送餐时间
		String[] addresse = new String[4]; 	//送餐地址
		int[] staes = new int[4];					//订单状�?     0表示已预�?�?表示已完�?
		double[] sumPrices =new double[4];			//订单的�?金额     
		
		//共�?择的菜品信息
		String[] disName ={"红烧带鱼","鱼香肉丝","时令蔬菜"};
		double[] prices =new double[] {38.0,20.0,10.0};
		int[] pricesNums = new int[3];
		
		//初始化第�?��订单信息
		names[0] = "张晴";
		dishMegs[0] = "红烧带鱼 2份"	;
		times[0] = 12 ;
		addresse[0] = "天成路 12号";
		staes[0] = 1;
		sumPrices[0] = 76.0;
		
		//初始化第二条订单信息
		names[1] = "张晴";
		dishMegs[1] = "鱼香肉丝 2份";
		times[1] = 18 ;
		addresse[1] = "天成路 12号" ;
		staes[1] = 0;
		sumPrices[1] = 45.0;
		
		
		System.out.println("欢迎使用“吃货联盟订餐系统”");
		
		
		//实现菜单切换
		Scanner input = new Scanner(System.in);
		
		//用户输入0时返回，否则�?��系统
		int num = -1;
		
		//标识：用户是否�?出系�?  true表示�?��系统   false表示没有�?��
		boolean isExit = false;
		
		do{
			//显示菜单
			System.out.println("*************************************");
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");	//：要求当�?10 �?20 点间整点送餐，要求用户输�?10~20 的整数，�?入错误，重复输入�?
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");   
			System.out.println("6、退出系统");
			System.out.println("*************************************");
			
			System.out.print("请选择：");
			int choose = input.nextInt();		//记录用户选择的功能编�?
	
			switch(choose){
				case 1:
					//我要订餐
					System.out.println("***我要订餐***");
					
					//记录是否可以订餐     true 表示可以订餐
					boolean isAdd = false;
					for(int j=0;j<names.length;j++){
						if(names[j]==null){
							isAdd = true;		//true 找到空的位置，表示可以订�?
							System.out.print("请输入订单人姓名:");	
							String name = input.next();
							//显示�?��课共选择的商�?
							System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t"+"点赞数");
							
							for(int i=0;i<disName.length;i++){
								String price = prices[i]+"元";
								String praise = pricesNums[i]>0?pricesNums[i]+"赞":"0";
								System.out.println((i+1)+"\t"+disName[i]+"\t"+price+"\t"+praise);	
							}	
							//输入�??餐品编号以及分数
							System.out.print("请你选择要点的菜品编号：");
							int chooseDish = input.nextInt();
							System.out.print("请选择你要订的份数：");
							int number = input.nextInt();
							String disMeg = disName[chooseDish-1]+" "+number+"份";
							
							//点餐�?
							double sumPrice = prices[chooseDish-1]*number;
							
							//餐费�?0�?，免送餐�?�?
							double dieliCharge = (sumPrice>=50?0:5);
							//送餐时间
							System.out.print("请输入订餐时间(送餐时间是0点至20点间整点送餐)");
							int time = input.nextInt();
							while(time<10||time>20){
								System.out.print("您的输入有误，请输入10~20间的整数");
								time = input.nextInt();							
							}
							
							//送餐地址
							System.out.print("请输入送餐地址：");
							String address = input.next();
							
							System.out.println("定餐成功！");
							System.out.println("您的订单是："+disMeg);
							System.out.println("送餐时间是："+time);
							System.out.println("餐费:"+sumPrice+"元，"+"送餐费："+dieliCharge+"元，"+"总计:"+(sumPrice+dieliCharge)+"元");
							
							//添加数据
							names[j] = name;
							dishMegs[j] =disMeg; 
							times[j] = time;
							addresse[j] = address;
							sumPrices[j] = sumPrice;
							break;
						
						}
					}
					//如果没有找到，则提示信息
					if(!isAdd){
						System.out.println("对不起，您的餐袋已满");
					}
					break;
				case 2:
					//查看餐袋
					System.out.println("***查看餐袋***");
					System.out.println("序号\t订餐人\t餐品信息  \t送餐时间  \t送餐地址  \t总金额  \t订单状");
					for(int i=0;i<names.length;i++){
						if(names[i]!=null){
							String state =(staes[i]==0?"已预订":"已完成");
							String date = times[i]+"点";
							System.out.println((i+1)+"\t"+names[i]+"\t"+dishMegs[i]+"\t"+date+"\t\t"+addresse[i]+"\t"+sumPrices[i]+"元"+"\t"+state);
						}
					}
					break;
				case 3:
					//签收订单
					System.out.println("***签收订单***");
					//找到要签收的订单
					boolean isSingFind = false;
					System.out.print("请选择要签收的订单序号：");
					int  singOrderId = input.nextInt();
					for(int i=0;i<names.length;i++){
						if(names[i]!=null && staes[i]==0 && singOrderId==i+1){
							staes[i]=1;		//将状态�?置为已完成状�?
							System.out.println("订单签收成功!");
							isSingFind = true;  //标记已找到此订单
						}else if(names[i]!=null && staes[i]==1 && singOrderId==i+1){
							System.out.println("您的订单已完成签收，不能再次签收!");
							isSingFind = true;  //标记已找到此订单
						}
 					}
					//未找到的订单序号：不可签�?
					if(!isSingFind){
						System.out.println("您选择的订单不存在！");
					}
					break;
				case 4:
					//删除订单
					System.out.println("***删除订单***");
					//标记是否找到要删除的订单
					boolean isDelFind = false;
					System.out.print("请输入要删除的订单序号：");
					int intDelId = input.nextInt();
					for (int i = 0; i < names.length; i++) {
						if(names[i]!=null && staes[i]==1 && intDelId==i+1){
							isDelFind = true;  //标记已找到此订单
							//执行删除操作：删除位置后元素�?��前移
							for (int j = intDelId-1; j < names.length-1; j++) {
								names[j] = names[j+1];
								dishMegs[j] = dishMegs[j+1];
								times[j] = times[j+1];
								addresse[j] = addresse[j+1];
								staes[j] = staes[j+1];
								sumPrices[j] = sumPrices[j+1];
							}
							//清空�?���?��
							int endIndex = names.length-1;
							names[endIndex] = null;
							dishMegs[endIndex] = null;
							times[endIndex] = 0;
							addresse[endIndex] = null;
							staes[endIndex] = 0;
							sumPrices[endIndex] = 0;
							System.out.println("删除订单成功!");
							break;
						}else if(names[i]!=null && staes[i]==0 && intDelId==i+1){
							System.out.println("你�?选择的订单未签收，不能删除！");
							isDelFind = true; //标记找到订单
							break;
						}
					}
					//未找到该序号的订单：不能删除
					if (!isDelFind) {
						System.out.println("你要删除的订单不存在!");
					}
					break;
				case 5:
					//我要点赞
					System.out.println("***我要点赞***");
					//显示菜品信息
					System.out.println("序号"+"\t"+"菜名"+"\t"+"单价"+"\t");
					
					for(int i=0;i<disName.length;i++){
						String price = prices[i]+"元";
						String praiseNum = (pricesNums[i]>0?pricesNums[i]+"赞":"");
						System.out.println((i+1)+"\t"+disName[i]+"\t"+price+"\t"+praiseNum);	
					}
					System.out.print("请你选择要点赞的菜品序号");
					int praiseNum = input.nextInt();
					pricesNums[praiseNum-1]++;   //点赞数加1
					System.out.println("点赞成功!");
					break;
				case 6:
					//�?��系统
					break;
				default:
					//�?��系统
					isExit=true;
					break;
			}
			/*//当用户输入的功能标号�?~5之外的数字时，�?出循环，否则会提示输�?返回
			if(choose<1 || choose>5){
				break;
			}else{
				System.out.print("输入0返回�?);
				num = input.nextInt();
			}*/
			if(!isExit){
				System.out.print("输入0返回！");
				num = input.nextInt();
			}else{
				break;
			}
			
		}while(num==0);
	
		System.out.println("谢谢使用，欢迎下次光临!");
		
		
	}
}
