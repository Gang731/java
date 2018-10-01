package cn.bdqn.AngryBirds;

//����
public abstract class Birds {
	//���ԣ�����    ���
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
	
	//���
	public void shout(){
		birdCry.birdCry();
	}
	//����������
	public void  flight(){
		System.out.println(this.type+"�����");
	}
	
	//����������
	public abstract void attack ();
}
