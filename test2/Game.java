package com.bdqn.test2;

import java.util.Random;

/*
 * ��Ϸ��
 */
public class Game {
	Player player; //���
	
	/**
	 * �������Ϸ
	 * @param player��������
	 */
	public Game(Player player) {
		this.player = player;
	}
	
	/**
	 * ָ�������������ַ����ĳ���
	 * @return ������ַ��������ں��û�������ַ����Ƚ�
	 */
	public String printStr() {
		int strLength = LevelParam.levels[player.getLevelNo()-1].getStrLength();
		//���Ӹ�Ч�����ַ�����append׷���ַ�������,toString()
		//�������ַ����ŵ��������
		StringBuffer sb = new StringBuffer();
		//<>*&$%    >>>>&
		//���������
		Random random = new Random();
		//0,1,2                2
		for (int i = 0; i < strLength; i++) {
			//ʹ������������ַ�����ƴ��
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
		//��Ϸ����ַ���
		System.out.println(sb);
		
		//�����ַ������û�������Ƚ�
		return sb.toString();
	}
	
	/**
	 * �ж����������ַ����Ƿ���ȷ��������Ϸ�������Ϸ�ַ�����������Ӧ�Ľ����Ϣ
	 * @param out ��Ϸ������ַ���
	 * @param in  ���������ַ���
	 */
	public void printResult(String out,String in) {
		
		boolean flag;
		
		if(out.equals(in)) {
			flag = true;
		}else {
			flag = false;
		}
		
		//���������ȷ----1970  2018    -����Ϸ��ʼ��ʱ�� 
		if(flag) {
			//���ϵͳ�ĵ�ǰ������--ת������  �ӵ͵��� �ó���
			long currentTime = System.currentTimeMillis();
			//�����ʱ
			if(((currentTime - player.getStartTime())/1000) > LevelParam.levels[player.getLevelNo()-1].getTimeLimit()) {
				System.out.println("�������̫���ˣ��ѳ�ʱ���˳���");
				System.exit(0);
			}else {//���û�г�ʱ
				//���㵱ǰ����
				player.setCurrScore(player.getCurrScore()+LevelParam.levels[player.getLevelNo()-1].getPerScore());
				//��������ʱ��
				player.setElapsedTime((int)((currentTime - player.getStartTime())/1000));
				//�����ǰ����ţ���ǰ���֣�����ʱ��
				System.out.println("������ȡ�����ļ���"+player.getLevelNo()+",���Ļ���"+player.getCurrScore()+",����ʱ�� "+player.getElapsedTime());
			}
			//�ж���󴳹سɹ������㴳�ط���
			if(player.getLevelNo()==6) {
				//���㴳�ط���
				int score = LevelParam.levels[player.getLevelNo()-1].getStrTimes()*
						LevelParam.levels[player.getLevelNo()-1].getPerScore();
				if(player.getCurrScore()==score) {
					//��ʾ��ϲ����Ϸ�ɹ�
					System.out.println("���Ѵ��سɹ�����Ϊ�������֣���ϲ�㣡");
					System.exit(0);
				}
			}
			
		}else {
			System.out.println("������󣬳����˳���");
			System.exit(1);
		}
		
	}
	

}
