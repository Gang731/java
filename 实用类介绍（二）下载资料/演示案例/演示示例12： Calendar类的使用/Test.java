package cn.com.jbit;
import java.util.Calendar;

public class Test {
	public static void main(String[] args) {
		Calendar t = Calendar.getInstance();
		System.out.println("今天是"+t.get(Calendar.YEAR)+"年"
				+(t.get(Calendar.MONTH)+1)+"月"+t.get(Calendar.DAY_OF_MONTH)+"日");
		//Calendar.DAY_OF_WEEK 中 Sunday是1
		System.out.println("今天是星期"+(t.get(Calendar.DAY_OF_WEEK)-1));
	}
}