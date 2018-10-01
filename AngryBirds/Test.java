package cn.bdqn.AngryBirds;

public class Test {
	public static void main(String[] args) {
		BirdCry ao = new AoShout();  		//à»à»½Ð
		BirdCry zha = new ZhaShout();		//ÔûÔû½Ð
		BirdCry no = new NoShout();			//²»»á½Ð
		Birds bomb = new BombBrid("Õ¨µ¯Äñ",zha);
		bomb .flight();
		bomb.shout();
		bomb.attack();
		Birds fb = new FattyBird("ÅÖ×ÓÄñ",no);
		fb.flight();
		fb.shout();
		fb.attack();
		Birds rb = new RedBrid("ºìÉ«Äñ",zha);
		rb.flight();
		rb.shout();
		rb.attack();
		Birds rk = new RocketBrid("»ð¼ýÄñ",ao);
		rk.flight();
		rk.shout();
		rk.attack();
		Birds splitb = new SplitBird("·ÖÁÑÄñ",ao);
		splitb.flight();
		splitb.shout();
		splitb.attack();
 	}
}
