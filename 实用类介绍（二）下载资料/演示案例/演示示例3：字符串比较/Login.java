package cn.com.jbit;
import java.util.*;
public class Login {

	/**
	 * 登录
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String uname,pwd;
		
		System.out.print("请输入用户名： ");
		uname=input.next();
		System.out.print("请输入密码： ");
		pwd=input.next();
		
		if(uname.equals("TOM")&&pwd.equals("1234567")){
			System.out.print("登录成功！ ");
		}else{
			System.out.print("用户名或密码不匹配，登录失败！");
		}
	}
}
