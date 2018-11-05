package cn.jbit.classandobject;
import java.util.*;
public class TestInsert {

	/**
	 * 每隔三位插入逗号
	 * 
	 */
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		//接收数字串，存放于StringBuffer类型的对象中
		System.out.print("请输入一串数字： ");
		String nums = input.next();
		StringBuffer str=new StringBuffer(nums);
		//从后往前每隔三位添加逗号
		for(int i=str.length()-3;i>0;i=i-3){
			str.insert(i,',');
		}
		System.out.print(str);
	}
}
