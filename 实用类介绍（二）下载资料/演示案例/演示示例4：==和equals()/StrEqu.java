package cn.com.jbit;

public class StrEqu {
	public static void main(String[] args) {
		String str1="bdqn";
		String str2="bdqn";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3=new String("bdqn");
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		String str4=new String("bdqn");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}
}
