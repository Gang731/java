package cn.bdqn.dianmingxitong;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
//简易点名系统
public class TestStudent {
	public static void main(String[] args) {
		String whether="";
		do{
			Map<String, String> student=new HashMap<String,String>();
			student.put("1","彭定淋");
			student.put("2","黎锋");
			student.put("3","刘相佳");
			student.put("4","周志良");
			student.put("5","宋有为");
			student.put("6","刘国庆");
			student.put("7","何礼博");
			student.put("8","叶小文");
			student.put("9","刘合刚");
			student.put("10","占永壮");
			student.put("11","林梦霞");
			student.put("12","许梅芳");
			student.put("13","薛大强");
			student.put("14","邹创创");
			student.put("15","郭晓洲");
			student.put("16","杜欢");
			student.put("17","查光伟");
			student.put("18","刘永海");
			student.put("19","虞砚秋");
			student.put("20","雷鸿");
			student.put("21","李林霖");
			student.put("22","何思远");
			student.put("23","杨子超");
			student.put("24","霍力");
			Random random = new Random();
			int num=random.nextInt(25);
			String StrNum = Integer.toString(num);
			for(String str:student.keySet()){
				String key = str;
				if(key.equals(StrNum)){
					String value = student.get(key);
					System.out.println("恭喜"+key+"号\t"+value);
				}
			}
			Scanner input = new Scanner(System.in);
			System.out.print("是否继续(y/n)");
			whether = input.next();
		}while(whether.equals("y"));
		System.out.println("谢谢使用！");
	}
}	
