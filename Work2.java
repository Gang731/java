import java.util.*;
//用键盘录入10个数，合法数字为1.2.3，不是这3 个数为非法数字，分别统计他们的个数

public class Work2 {
	public static void main(String[]geas){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入10个数：");
		int[] array= new int[10];		//声明数组
		
		//循环录入数组
		for(int i=0;i<array.length;i++){
			int num=input.nextInt();
			array[i]=num;
		}
		
		//循环输出数组
		System.out.print("输入的10个数为:"+"\t");
		for(int i:array){
			System.out.print(i+"\t");
		}
		
		//统计个数
		Arrays.sort(array);
		int num1=0;			//数如数字是1的个数
		int num2=0;			//数如数字是2的个数
		int num3=0;			//数如数字是3的个数
		int num4=0;			//数如数字是4的个数
		for(int i=0;i<array.length;i++){
			/*if(array[i]==1){
				num1++;
			}else if(array[i]==2){
				num2++;
			}else if(array[i]==3){
				num3++;
			}else{
				num4++;
			}*/
			switch(array[i]){
				case 1:
					num1++;
					break;
				case 2:
					num2++;
					break;
				case 3:
					num3++;
					break;
				default:
					num4++;
					break;
			}
			
		}
		System.out.print("\n数字1的个数："+num1+"\n");
		System.out.print("数字2的个数："+num2+"\n");
		System.out.print("数字3的个数："+num3+"\n");
		System.out.print("非数字的个数："+num4+"\n");
	}	
}
