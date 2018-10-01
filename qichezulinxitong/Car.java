package cn.bdqn.qichezulinxitong;
//�γ���
public class Car extends Automobile {
	//�γ�˽�����ԣ��ͺ�
	private String type;
	
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String brand, String plateNumber, int dailyRent,String type ){
		super(brand,plateNumber,dailyRent);
		this.type = type;
	}
	
	//��д���������𷽷�
	public double rental(int days) {
		double rental=0;
		if (days>0 && days<=7) {
			rental = super.getDailyRent()*days;
		}else if (days>7) {
			rental = super.getDailyRent()*days*0.9;
		}else if (days>30) {
			rental = super.getDailyRent()*days*0.8;
		}else if (days>150) {
			rental = super.getDailyRent()*days*0.7;
		}
		return rental;
	}
}
