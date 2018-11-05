package cn.jbit.thread2;

public class MyThread extends Thread{
    //ÖØĞ´run()·½·¨
	public void run(){
		for(int i=1;i<100;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}

