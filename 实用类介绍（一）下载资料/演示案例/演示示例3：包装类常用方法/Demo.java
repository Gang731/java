package cn.com.jbit;

/**
 * 包装类常用方法
 * */
public class Demo {
	public static  void main(String[] args){
		//XXXValue():包装类转换成基本类型
		Integer integerId=new Integer(25);
		int intId=integerId.intValue();
		System.out.println(intId);
		
		Boolean booleanVal=new Boolean(true);
		boolean bool2=booleanVal.booleanValue();
		System.out.println(bool2);
		System.out.println("*************************");
		
		//toString():以字符串形式返回包装对象表示的基本类型数据
		String sex=Character.toString('男');
		String id=Integer.toString(89);
		System.out.println(sex);
		System.out.println(id);
		String sex2='男'+"";
		String id2=89+"";
		System.out.println(sex2);
		System.out.println(id2);
		System.out.println("*************************");
		
		//所有包装类valueOf(type value)
		Integer intValue=Integer.valueOf(21);
		System.out.println(intValue);
		Boolean bool=Boolean.valueOf(false);
		System.out.println(bool);
		System.out.println("*************************");
		
		//除Character类外，其他包装类valueOf(String s)
		intValue=Integer.valueOf("32");
		//bool=Boolean.valueOf("true");
		bool=Boolean.valueOf("love");
		//编译错误
		//Character c=Character.valueOf("a");
		System.out.println(intValue);
		System.out.println(bool);
		System.out.println("*************************");
		
		
		//parseXXX()：把字符串转换为相应的基本数据类型数据（Character除外）
		int i=Integer.parseInt("89");
		System.out.println(i);
		//boolean flag=Boolean.parseBoolean("true");
		//boolean flag=Boolean.parseBoolean("TRue");
		//boolean flag=Boolean.parseBoolean("love");
		boolean flag=Boolean.parseBoolean("false");
		System.out.println(flag);
		System.out.println("*************************");
		
		//基本类型和包装类的自动转换:装箱和拆箱
		//装箱
		Integer intObject=5;
		//拆箱
		int intValue2=intObject;
		System.out.println(intObject+"\t"+intValue2);



	}
}
