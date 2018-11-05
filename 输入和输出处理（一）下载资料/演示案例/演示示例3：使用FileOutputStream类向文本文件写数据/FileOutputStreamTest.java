import java.io.*;

public class FileOutputStreamTest {
	public static void main(String[] args){
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("d:\\myDoc\\hello.txt",true);
			String str="好好学习Java";
			byte[] words=str.getBytes();
			fos.write(words,0,words.length);
			System.out.println("hello文件已更新");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件更新时出错！");
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
