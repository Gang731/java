import java.util.Scanner;


public class Work {
	public static void main(String[] args) {
		String[] a=new String[5];
		Scanner input =new Scanner(System.in);
		System.out.println("请输入5句话:");
		for(int i=0;i<a.length;i++){
			System.out.print("第"+(i+1)+"句话:");
			a[i]=input.next();
		}
		System.out.println("逆序输出5句话：");
		for(int i=a.length-1; i>=0;i--){
			System.out.println(a[i]);
		}
	}
}
