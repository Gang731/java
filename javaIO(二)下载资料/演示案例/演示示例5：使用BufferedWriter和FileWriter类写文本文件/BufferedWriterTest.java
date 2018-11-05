package jbit.io;
import  java.io.*;
public class BufferedWriterTest {
	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		FileReader fr=null;
		BufferedReader br=null;
		try {
	       //创建一个FileWriter 对象
	       fw=new FileWriter("C:\\myDoc\\hello.txt"); 
	       //创建一个BufferedWriter 对象
	       bw=new BufferedWriter(fw); 
	       bw.write("大家好！"); 
	       bw.write("我正在学习BufferedWriter。"); 
	       bw.newLine(); 
	       bw.write("请多多指教！"); 
	       bw.newLine();		       
	       bw.flush();
	       		       
	       //读取文件内容
	        fr=new FileReader("C:\\myDoc\\hello.txt"); 
	        br=new BufferedReader(fr); 
	        String line=null;
	        while((line=br.readLine())!=null){ 
	            System.out.println(line);
	        }
	      
	        fr.close(); 
	       }catch(IOException e){
	            System.out.println("文件不存在!");
	       }finally{
	    	   try{
	    		   if(fw!=null)
	    			   fw.close();
	    		   if(br!=null)
	    			   br.close();
	    		   if(fr!=null)
	    			   fr.close();  
	    	   }catch(IOException ex){
		            ex.printStackTrace();
		       }
	       }
	}
}
