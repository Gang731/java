package cn.bdqn.qichezulinxitong;

public class YeWu {
	Automobile[] automobile =new Automobile[8];
	public void add(){
		automobile[0]=new Car("宝马","京N666666",800,"X6");
		automobile[1]=new Car("宝马","京N888888",600,"550i");
		automobile[2]=new Car("别克","京NY666666",600,"GL8");
		automobile[3]=new Car("别克","京NY123456",300,"林荫大道");
		automobile[4]=new Bus("金杯","京NC324534",800,16);
		automobile[5]=new Bus("金龙","京NB432546",800,16);
		automobile[6]=new Bus("金杯","京NC767654",1500,32);
		automobile[7]=new Bus("金龙","京NJ787989",1500,32);
	}
	public Automobile find(String brand,String type,int seat){
		Automobile auto = null;
		for(Automobile at:automobile){
			if (at instanceof Car) {
				Car car = (Car)at;
				if (car.getBrand().equals(brand) && car.getType().equals(type)) {
					auto=car;
					break;
				}
			}else if (at instanceof Bus) {
				Bus bus = (Bus)at;
				if (bus.getBrand().equals(brand) && bus.getSeat()==seat) {
					auto=bus;
					break;
				}
			}
		}
		return auto;
		
	}
}
