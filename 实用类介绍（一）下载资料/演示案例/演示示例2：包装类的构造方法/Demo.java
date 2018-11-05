package cn.com.jbit;

public class Demo {
	public static void main(String[] args) {
		//所有包装类都可将与之对应的基本数据类型作为参数，来构造它们的实例
		Integer i=new Integer(34);
		Double d=new Double(98.7);
		Boolean b=new Boolean(true);
		Character c=new Character('a');
		System.out.println(i+"\t"+d+"\t"+b+"\t"+c);
		
		//除Character类外，其他包装类可以一个字符串为参数构造它们的实例
		//编译错误
		//Character c2=new Character("a");
		Integer i2=new Integer("34");
		Double d2=new Double("98.7");
		Boolean b2=new Boolean("true");
		System.out.println(i2+"\t"+d2+"\t"+b2);
		
		//Boolean类构造方法参数为String类型时，若该字符串内容为true(不考虑大小写)，则该Boolean对象表示true，否则表示false
		Boolean b3=new Boolean("TRue");
		Boolean b4=new Boolean("false");
		Boolean b5=new Boolean("love");
		System.out.println(b3+"\t"+b4+"\t"+b5);
		
		//当包装类构造方法参数为String 类型时，字符串不能为null，且该字符串必须可解析为相应的基本数据类型的数据，否则编译通过，运行时NumberFormatException异常
		Integer i3=new Integer(null);
		Double d4=new Double("包装类");
		System.out.println(i3+"\t"+d4);
	}
}
