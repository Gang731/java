package cn.bdqn.AngryBirds;

public class Test {
	public static void main(String[] args) {
		BirdCry ao = new AoShout();  		//�໽�
		BirdCry zha = new ZhaShout();		//������
		BirdCry no = new NoShout();			//�����
		Birds bomb = new BombBrid("ը����",zha);
		bomb .flight();
		bomb.shout();
		bomb.attack();
		Birds fb = new FattyBird("������",no);
		fb.flight();
		fb.shout();
		fb.attack();
		Birds rb = new RedBrid("��ɫ��",zha);
		rb.flight();
		rb.shout();
		rb.attack();
		Birds rk = new RocketBrid("�����",ao);
		rk.flight();
		rk.shout();
		rk.attack();
		Birds splitb = new SplitBird("������",ao);
		splitb.flight();
		splitb.shout();
		splitb.attack();
 	}
}
