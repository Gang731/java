package xunhuan;

public class Kao {
	public static void main(String[] args) {
		int reseult= 0;
		int i= 1;
		while (i<=10) {
			if(i%3==0){
				reseult = i++;
			}else {
				reseult = ++i;
			}
			
		}
		System.out.println(reseult);
	}
}
