package com.bdqn.test2;

import java.util.Scanner;

/*
 * 玩家类
 */
public class Player {
	private int levelNo;//当前级别号
	private int currScore;//当前级别积分
	private long startTime=0;//各级别的开始时间
	private int elapsedTime;//各级别的已用时间
	
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
	 * 玩家玩游戏
	 */
	public void play() {
		Game game = new Game(this);
		Scanner input = new Scanner(System.in);
		//外层循环，循环一次晋级，晋一次级
		for (int i = 0; i < LevelParam.levels.length; i++) {
			//晋级：级别号+1
			this.levelNo += 1;
			//当前积分清零，计时清零
			this.startTime = System.currentTimeMillis();
			this.currScore=0;
			//内层循环,根据用户的输入字符串，游戏输出的字符串，进行比较
			for (int j = 0; j < LevelParam.levels[levelNo-1].getStrTimes(); j++) {
				//游戏输出的字符串
				String strOut = game.printStr();
				//用户的输入字符串
				String strIn = input.next();
				//游戏判断玩家输入的字符串是否正确，返回相应的结果信息
				game.printResult(strOut, strIn);
			}
			
		}
		
		
		
	}
	
	
	

}
