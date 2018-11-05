package cn.com.jbit;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rand=new Random(); //创建一个Random对象
		for(int i=0;i<20;i++){//随机生成20个随机整数，并显示
		      int num=rand.nextInt(10);//返回下一个伪随机数，整型的
		      System.out.println("第"+(i+1)+"个随机数是："+num);
		} 

	}
}
