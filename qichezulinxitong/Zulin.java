package cn.bdqn.qichezulinxitong;
//汽车业务类
public class Zulin {
	//创建对象数组
	Automobile[] auto=new Automobile[8];
	public void add(){
		//初始化汽车信息
		Automobile auto1=new Car("宝马","京N666666",800,"X6");
		Automobile auto2=new Car("宝马","京N888888",800,"550i");
		Automobile auto3 = new Car("别克","京NY666666",600,"GL8");
		Automobile auto4 = new Car("别克","京NY123456",800,"林荫大道");
		Automobile auto5 = new Bus("金杯","京NC324534",800,16);
		Automobile auto6 = new Bus("金龙","京NB432546",800,16);
		Automobile auto7 = new Bus("金杯","京NC767654",1500,32);
		Automobile auto8 = new Bus("金龙","京NJ787989",1500,32);
		auto[0]=auto1;
		auto[1]=auto2;
		auto[2]=auto3;
		auto[3]=auto4;
		auto[4]=auto5;
		auto[5]=auto6;
		auto[6]=auto7;
		auto[7]=auto8;
	}
	//查找汽车
	public Automobile find(String brand,String type,int seat){
		Automobile automobile=null;
		for(int i=0; i<auto.length;i++){
			if (auto[i] instanceof Car) {
				Car car=(Car)auto[i];
				if (car.getBrand().equals(brand) && car.getType().equals(type)) {
					automobile=car;
					break;
				}
			}
		} 
		/*for(Automobile at:auto){
			if (at instanceof Car) {
				Car car=(Car)at;
				if (car.getBrand().equals(brand) && car.getType().equals(type)) {
					automobile=car;
					break;
				}
			}else if(at instanceof Bus){
				Bus bus = (Bus)at;
				if (bus.getBrand().equals(brand) && bus.getSeat()==seat) {
					automobile=bus;
					break;
				}
			}
		}*/
		return automobile;
		
	}
}
