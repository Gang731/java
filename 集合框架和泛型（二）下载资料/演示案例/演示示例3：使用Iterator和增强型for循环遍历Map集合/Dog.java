package cn.jbit.epet.poly;

/**
 * 狗狗类，宠物的子类。
 * @author 北大青鸟
 */
public class Dog extends Pet {
	private String strain;// 品种
	/**
	 * 有参构造方法。
	 * @param name   昵称
	 * @param strain   品种
	 */
	public Dog(String name, String strain) {
		super(name); 
		this.strain = strain;
	}
	public String getStrain() {
		return strain;
	}
	/**
	 * 重写父类的print方法。
	 */
	public void print(){
		super.print(); //调用父类的print方法
		System.out.println("我是一只 " + this.strain + "。");
	}
	/**
	 * 实现吃饭方法。 
	 */
	public void eat() {
		super.health = super.health + 3;
		System.out.println("狗狗"+super.name + "吃饱啦！健康值增加3。");
	}
}
