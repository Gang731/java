package com.bdqn.test2;

/**
 * ������� �࣬���ø�������Ĳ���
 * @author huqiaohui
 *
 */
public class LevelParam {
	public static final Level levels[] = new Level[6];//��Ӧ����������
	//��̬����飬���ٳ�ʼ�����������
	static {
		levels[0] = new Level(1, 2, 10, 30, 1);
		levels[1] = new Level(2, 3, 9, 25, 3);
		levels[2] = new Level(3, 4, 8, 20, 5);
		levels[3] = new Level(4, 5, 7, 18, 8);
		levels[4] = new Level(5, 6, 6, 15, 12);
		levels[5] = new Level(6, 7, 5, 12, 14);
	}

}
