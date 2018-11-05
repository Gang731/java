

/**
* 宠物类，狗狗和企鹅的父类。
* @author 北大青鸟
*/
public abstract class Pet {
	protected String name = "无名氏";// 昵称
	protected int health = 100;// 健康值
	protected int love = 0;// 亲密度
	
	public abstract void eat();  //抽象方法eat(),负责宠物吃饭功能。
	
	/**
	 * 无参构造方法。
	 */
	public Pet() {	
	}
	/**
	 * 有参构造方法。
	 * @param name  昵称
	 */
	public Pet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getLove() {
		return love;
	}
	/**
	 * 输出宠物信息。
	 */
	public void print() {
		System.out.println("宠物的自白：\n我的名字叫" + this.name + 
				"，健康值是"	+ this.health + "，和主人的亲密度是"
				+ this.love + "。");
	}
}

