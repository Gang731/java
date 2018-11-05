package jbit.io;

import java.io.*;

/*
 * 当hello.txt编码格式是ANSI时，程序可以正常读取数据，（InputStreamReader fr=new InputStreamReader(fis,"gbk"); ）；
 * 当hello.txt编码格式改为UTF-8时，代码改为InputStreamReader fr=new InputStreamReader(fis,"UTF-8"); 时才可以正常读取数据。
 * */

public class BufferedReaderTest {
	public static void main(String[] args) {
		InputStreamReader fr = null;
		BufferedReader br = null;
		try {
			FileInputStream fis = new FileInputStream("c:\\myDoc\\hello.txt");
			// 指定编码格式
			fr = new InputStreamReader(fis, "utf-8");
			br = new BufferedReader(fr);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			try {
				br.close();
				fr.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e.getMessage());
		}
	}

}
