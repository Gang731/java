package xunhuan;
//使用循环输出100,95,90,85，.......5
public class Series {
	public static void main(String[] args) {
	
		 for(int i=100; i>=5; i=i-5){
			 System.out.print(i+"\t");
		 }
		 
		 System.out.println();
		 
		 int j = 100;
		 while(j>=5){
			 if(j%5==0){
				 System.out.print(j+"\t"); 
			 }
			 j--;
		 }
		 
		 System.out.println();
		 int k = 100;
		 do{
			 System.out.print(k+"\t");
			 k-=5;
		 }while(k>=5);
		 
	}
}
