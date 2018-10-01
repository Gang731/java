package cn.bdqn.qichezulinxitong;
//业务类
public class Business {
	//创建对象数组
	Automobile[] amb = new Automobile[8]; 
	
	//初始化汽车信息
	public void init(){
		//向上转型 ：父类指向子类对象
		amb[0] = new Car("宝马","京N666666",800,"X6");    	//Automobile amb = new Car();
		amb[1] = new Car("宝马","京N888888",800,"550i");
		amb[2] = new Car("别克","京NY666666",600,"GL8");
		amb[3] = new Car("别克","京NY123456",800,"林荫大道");
		amb[4] = new Bus("金杯","京NC324534",800,16);
		amb[5] = new Bus("金龙","京NB432546",800,16);
		amb[6] = new Bus("金杯","京NC767654",1500,32);
		amb[7] = new Bus("金龙","京NJ787989",1500,32);
	}
	
	
	//租车
	//收取用户信息要租什么车
	//轿车：型号   	客车 ：座位数
	//多态的应用：使用父类作为方法的返回值
	public Automobile auto(String brand,String type,int seat){
		Automobile auto=null;		//局部变量要赋初始值
		//遍历对象数组
		for (Automobile at:amb) {
			//判断是否是同一类型
			if (at instanceof Car ) {
				Car car =(Car)at;  		//向下转型
				if (car.getBrand().equals(brand) && car.getType().equals(type)) {
					auto = car;
					break;
				}
			}else if(at instanceof Bus){
				Bus bus =(Bus)at;		//向下转型
				if (bus.getBrand().equals(brand) && bus.getSeat()==seat) {
					auto = bus;
					break;
				}	
			}
		}
		return auto;		//返回值
	}  
}
