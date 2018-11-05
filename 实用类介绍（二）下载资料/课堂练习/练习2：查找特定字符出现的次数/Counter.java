package cn.com.jbit;
import java.util.Scanner;

public class Counter {
		public int counter(String inputs,String word){
			int counter=0;//计数器，初始化0
			String[] temps=new String[inputs.length()];
			//字符串转换成数组
			for(int i=0;i<temps.length;i++){
				temps[i]=inputs.substring(i,i+1);			
			}
			//比较字母，计数
			for(int j=0;j<temps.length;j++){
				if(temps[j].equals(word)){
					counter++;
				}
			}
			return counter;
		}
		public static void main(String[] args) {		
			Scanner myinput=new Scanner(System.in);
			Counter cnt=new Counter();
			
			//定义2个变量，接收用户的输入
			String myString;
			String myWord;
			System.out.print("请输入一个字符串：");
			myString=myinput.next();
			System.out.print("请输入要查找的字符：");
			myWord=myinput.next();
			
			//调用方法，输出结果
			int geshu=cnt.counter(myString,myWord);
			System.out.print("\""+myString+"\"中包含"+geshu+"个\""+myWord+"\"。");
		}
	}