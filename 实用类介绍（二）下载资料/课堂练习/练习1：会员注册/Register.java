package cn.jbit.regist;

import java.util.Scanner;

public class Register {
	/**
	 * 验证注册信息
	 * @return flag 验证信息
	 */
	public boolean verify(String name,String pwd1,String pwd2){
		boolean flag=false;
		if(name.length()<3 || pwd1.length()<6){
			System.out.println("用户名长度不能小于3，密码长度不能小于6！");
		}else if(!pwd1.equals(pwd2)){
			System.out.println("两次输入的密码不相同！");
		}else{
			System.out.println("注册成功！请牢记用户名和密码。");
			flag=true;
		}
		return flag;
	}
	public static void main(String[] args) {
		Register r=new Register();
		Scanner input = new Scanner(System.in);
		String uname,p1,p2;
		boolean resp=false;
		
		System.out.println("***欢迎进入注册系统*** \n");
		do{			
			System.out.print("请输入用户名： ");
			uname=input.next();
			System.out.print("请输入密码： ");
			p1=input.next();
			System.out.print("请再次输入密码： ");
			p2=input.next();		
			resp=r.verify(uname, p1, p2);		
		}while(!resp);
	}
}
