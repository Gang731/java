package com.bdqn.test2;

import java.util.Random;

/*
 * 游戏类
 */
public class Game {
	Player player; //玩家
	
	/**
	 * 玩家玩游戏
	 * @param player传入的玩家
	 */
	public Game(Player player) {
		this.player = player;
	}
	
	/**
	 * 指定级别的输出的字符串的长度
	 * @return 输出的字符串，用于和用户输入的字符串比较
	 */
	public String printStr() {
		int strLength = LevelParam.levels[player.getLevelNo()-1].getStrLength();
		//更加高效处理字符串，append追加字符串方法,toString()
		//容器，字符串放到这个容器
		StringBuffer sb = new StringBuffer();
		//<>*&$%    >>>>&
		//生成随机数
		Random random = new Random();
		//0,1,2                2
		for (int i = 0; i < strLength; i++) {
			//使用随机数进行字符串的拼接
			int rand = random.nextInt(strLength);  //2   ><
			switch (rand) {
				case 0:
					sb.append("");
					break;
				case 1:
					sb.append("<");
					break;
				case 2:
					sb.append("*");
					break;
				case 3:
					sb.append("&");
					break;
				case 4:
					sb.append("%");
					break;
				case 5:
					sb.append("#");
					break;
			}
			
		}
		//游戏输出字符串
		System.out.println(sb);
		
		//返回字符串，用户的输入比较
		return sb.toString();
	}
	
	/**
	 * 判断玩家输入的字符串是否正确，根据游戏输出的游戏字符串，返回相应的结果信息
	 * @param out 游戏输出的字符串
	 * @param in  玩家输入的字符串
	 */
	public void printResult(String out,String in) {
		
		boolean flag;
		
		if(out.equals(in)) {
			flag = true;
		}else {
			flag = false;
		}
		
		//如果输入正确----1970  2018    -玩游戏开始的时间 
		if(flag) {
			//获得系统的当前毫秒数--转成秒数  从低到高 用除法
			long currentTime = System.currentTimeMillis();
			//如果超时
			if(((currentTime - player.getStartTime())/1000) > LevelParam.levels[player.getLevelNo()-1].getTimeLimit()) {
				System.out.println("你输入的太慢了，已超时，退出！");
				System.exit(0);
			}else {//如果没有超时
				//计算当前积分
				player.setCurrScore(player.getCurrScore()+LevelParam.levels[player.getLevelNo()-1].getPerScore());
				//计算已用时间
				player.setElapsedTime((int)((currentTime - player.getStartTime())/1000));
				//输出当前级别号，当前积分，已用时间
				System.out.println("输入争取，您的级别"+player.getLevelNo()+",您的积分"+player.getCurrScore()+",已用时间 "+player.getElapsedTime());
			}
			//判断最后闯关成功，计算闯关分数
			if(player.getLevelNo()==6) {
				//计算闯关分数
				int score = LevelParam.levels[player.getLevelNo()-1].getStrTimes()*
						LevelParam.levels[player.getLevelNo()-1].getPerScore();
				if(player.getCurrScore()==score) {
					//提示恭喜玩游戏成功
					System.out.println("你已闯关成功，成为绝世高手，恭喜你！");
					System.exit(0);
				}
			}
			
		}else {
			System.out.println("输入错误，程序退出！");
			System.exit(1);
		}
		
	}
	

}
