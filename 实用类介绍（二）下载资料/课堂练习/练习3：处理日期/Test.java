package cn.com.jbit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
public class Test {
	public static void main(String[] args) {
		Date date = new Date(); //创建日期对象
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");//定制日期格式
		System.out.println("当前日期为："+formater.format(date));
		
		
		Calendar cal=Calendar.getInstance();
		cal.set(Calendar.YEAR, 2015);
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 6);
		int week=cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("2015年4月6日是一年中的第"+week+"星期。");

	}

}