package cn.bdqn.qichezulinxitong;
//汽车类
public abstract class Automobile {
	//属性：品牌 车牌  日租金
	private String brand;
	private String plateNumber;
	private int dailyRent;
	
	//构造方法
	public Automobile() {
		
	}
	public Automobile(String brand, String plateNumber, int dailyRent) {
		this.brand = brand;
		this.plateNumber = plateNumber;
		this.dailyRent = dailyRent;
	}
	//getter/setter方法
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPlatNumber(){
		return plateNumber;
	}
	public void setPlatNumber(String platNumber){
		this.plateNumber = platNumber;
	}
	public int getDailyRent(){
		return dailyRent;
	}
	public void setDailyRent(int dailyRent){
		this.dailyRent = dailyRent;
	}
	
	//抽象方法：计算租金
	public abstract double rental (int days);
}
