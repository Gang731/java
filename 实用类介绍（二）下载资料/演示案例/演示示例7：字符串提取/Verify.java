package cn.com.jbit;
import java.util.*;


public class Verify{
	public static void main(String[] args) {
        // 声明变量
        boolean fileCorrect = false; 	//标识文件名是否正确
        boolean emailCorrect = false; 	//标识E-mail是否正确
        System.out.print("---欢迎进入作业提交系统---");
        Scanner input = new Scanner(System.in);
        System.out.println("请输入Java文件名: ");
        String fileName = input.next();
        System.out.print("请输入你的邮箱:");
        String email = input.next();
        
        //检查Java文件名
        int index = fileName.lastIndexOf(".");  //"."的位置
        if(index!=-1 && index!=0 && 
            fileName.substring(index+1, 
            fileName.length()).equals("java")){
 
            fileCorrect = true;   	//标识文件名正确
        }else{
            System.out.println("文件名无效。");
        }        
        //检查你的邮箱格式
        if(email.indexOf('@')!=-1 &&
            email.indexOf('.')>email.indexOf('@')){  
            emailCorrect = true;   	//标识E-mail正确
        }else{
            System.out.println("E-mail无效。");
        }        
        //输出检测结果
        if(fileCorrect && emailCorrect){
            System.out.println("作业提交成功!");
        }else{
            System.out.println("作业提交失败!");
        }
    }
}

