package cn.bdqn.AngryBirds;

//ը����
public class BombBrid extends Birds {

	
	public BombBrid() {}

	public BombBrid(String type, BirdCry birdCry) {
		super(type, birdCry);
	}

	public void attack() {
		System.out.println("��ը����");
	}

}
