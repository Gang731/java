package com.bdqn.test2;

import java.util.Scanner;

/*
 * �����
 */
public class Player {
	private int levelNo;//��ǰ�����
	private int currScore;//��ǰ�������
	private long startTime=0;//������Ŀ�ʼʱ��
	private int elapsedTime;//�����������ʱ��
	
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getCurrScore() {
		return currScore;
	}
	public void setCurrScore(int currScore) {
		this.currScore = currScore;
	}
	public int getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}
	/*
	 * �������Ϸ
	 */
	public void play() {
		Game game = new Game(this);
		Scanner input = new Scanner(System.in);
		//���ѭ����ѭ��һ�ν�������һ�μ�
		for (int i = 0; i < LevelParam.levels.length; i++) {
			//�����������+1
			this.levelNo += 1;
			//��ǰ�������㣬��ʱ����
			this.startTime = System.currentTimeMillis();
			this.currScore=0;
			//�ڲ�ѭ��,�����û��������ַ�������Ϸ������ַ��������бȽ�
			for (int j = 0; j < LevelParam.levels[levelNo-1].getStrTimes(); j++) {
				//��Ϸ������ַ���
				String strOut = game.printStr();
				//�û��������ַ���
				String strIn = input.next();
				//��Ϸ�ж����������ַ����Ƿ���ȷ��������Ӧ�Ľ����Ϣ
				game.printResult(strOut, strIn);
			}
			
		}
		
		
		
	}
	
	
	

}
