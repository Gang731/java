import java.util.Scanner;


public class Work {
	public static void main(String[] args) {
		String[] a=new String[5];
		Scanner input =new Scanner(System.in);
		System.out.println("������5�仰:");
		for(int i=0;i<a.length;i++){
			System.out.print("��"+(i+1)+"�仰:");
			a[i]=input.next();
		}
		System.out.println("�������5�仰��");
		for(int i=a.length-1; i>=0;i--){
			System.out.println(a[i]);
		}
	}
}
