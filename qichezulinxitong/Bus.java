package cn.bdqn.qichezulinxitong;
//客车类
public class Bus extends Automobile{
	//客车私有属性  座位数
	private int seat;
	
	public int getSeat(){
		return seat;
	}
	public void setSeat(int seat){
		this.seat = seat;
	}
	public Bus(){
		
	}
	public Bus(String brand, String plateNumber, int dailyRent,int seat ){
		super(brand,plateNumber,dailyRent);
		this.seat = seat;
	}
	
	//方法：重写计算租金
	public double rental(int days) {
		double rental=0;
		if (days>0 && days<3) {
			rental = super.getDailyRent()*days;
		}else if (days>=3) {
			rental = super.getDailyRent()*days*0.9;
		}else if (days>=7) {
			rental = super.getDailyRent()*days*0.8;
		}else if (days>=30) {
			rental = super.getDailyRent()*days*0.7;
		}else if (days>=150) {
			rental = super.getDailyRent()*days*0.6;
		}
		return rental;
	}
}
