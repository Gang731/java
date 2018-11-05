package cn.com.jbit;

public class PrintScore {

	/**
	 * 打印成绩单
	 * 
	 */
	public static void main(String[] args) {
		int sqlScore = 80;        	//SQL成绩
		int javaScore = 90;       	//Java成绩
		double htmlScore = 86.7;  	//HTML成绩

		//成绩单
		String scoreSheet = "SQL:" + sqlScore + "  Java:" + javaScore  + "  HTML:" + htmlScore;  
		
		//打印成绩单
        System.out.println("*****成绩单*****");
        System.out.println(scoreSheet);   

        String bottom = "\n\t\t版权所有：".concat("课工场");
        System.out.println(bottom);
		
	}

}
