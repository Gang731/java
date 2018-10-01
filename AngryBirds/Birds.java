package cn.bdqn.AngryBirds;

//鸟类
public abstract class Birds {
	//属性：种类    鸟叫
	private String type;
	
	private BirdCry birdCry;
	
	public Birds() {}

	public Birds(String type,BirdCry birdCry) {
		this.type = type;
		this.birdCry=birdCry;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//鸟叫
	public void shout(){
		birdCry.birdCry();
	}
	//方法：飞行
	public void  flight(){
		System.out.println(this.type+"弹射飞");
	}
	
	//方法：攻击
	public abstract void attack ();
}
