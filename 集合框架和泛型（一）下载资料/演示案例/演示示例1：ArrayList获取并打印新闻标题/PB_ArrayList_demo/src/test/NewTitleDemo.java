package test;

import java.util.ArrayList;
import java.util.List;

import entity.NewTitle;

public class NewTitleDemo {

	public static void main(String[] args) {
		// ����ʵ�ֲ���
		// 1����������������ű������
		NewTitle car = new NewTitle(1, "����", "����Ա");
		NewTitle test = new NewTitle(2, "�߿�", "����Ա");
		// 2�������洢�������ű���ļ��϶���
		List newsTitleList = new ArrayList();
		// 3������˳��������Ӹ������ű���
		newsTitleList.add(car);
		newsTitleList.add(test);
		// 4����ȡ���ű��������
		System.out.println("���ű�����ĿΪ��" + newsTitleList.size() + "��");
		// 5������λ�û�ȡ��Ӧ���ű��⡢������ӡÿ�����ű�������ƣ�Ҳ�������ǳ�˵�ı������϶���
		for (int i = 0; i < newsTitleList.size(); i++) {
			NewTitle title = (NewTitle) newsTitleList.get(i);
			System.out.println(i + 1 + ":" + title.getTitleName());
		}

	}

}
