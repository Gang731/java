package cn.bdqn.AngryBirds;

//Õ¨µ¯Äñ
public class BombBrid extends Birds {

	
	public BombBrid() {}

	public BombBrid(String type, BirdCry birdCry) {
		super(type, birdCry);
	}

	public void attack() {
		System.out.println("±¬Õ¨¹¥»÷");
	}

}
