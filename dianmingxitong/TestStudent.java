package cn.bdqn.dianmingxitong;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
//���׵���ϵͳ
public class TestStudent {
	public static void main(String[] args) {
		String whether="";
		do{
			Map<String, String> student=new HashMap<String,String>();
			student.put("1","����");
			student.put("2","���");
			student.put("3","�����");
			student.put("4","��־��");
			student.put("5","����Ϊ");
			student.put("6","������");
			student.put("7","����");
			student.put("8","ҶС��");
			student.put("9","���ϸ�");
			student.put("10","ռ��׳");
			student.put("11","����ϼ");
			student.put("12","��÷��");
			student.put("13","Ѧ��ǿ");
			student.put("14","�޴���");
			student.put("15","������");
			student.put("16","�Ż�");
			student.put("17","���ΰ");
			student.put("18","������");
			student.put("19","������");
			student.put("20","�׺�");
			student.put("21","������");
			student.put("22","��˼Զ");
			student.put("23","���ӳ�");
			student.put("24","����");
			Random random = new Random();
			int num=random.nextInt(25);
			String StrNum = Integer.toString(num);
			for(String str:student.keySet()){
				String key = str;
				if(key.equals(StrNum)){
					String value = student.get(key);
					System.out.println("��ϲ"+key+"��\t"+value);
				}
			}
			Scanner input = new Scanner(System.in);
			System.out.print("�Ƿ����(y/n)");
			whether = input.next();
		}while(whether.equals("y"));
		System.out.println("ллʹ�ã�");
	}
}	
