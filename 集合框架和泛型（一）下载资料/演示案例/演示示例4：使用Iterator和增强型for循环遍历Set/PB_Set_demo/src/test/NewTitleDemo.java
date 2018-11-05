package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import entity.NewTitle;

public class NewTitleDemo {

	public static void main(String[] args) {
		// 1����������������ű������
		NewTitle car = new NewTitle(1, "����", "����Ա");
		NewTitle test = new NewTitle(2, "�߿�", "����Ա");
		// 2�������洢�������ű���ļ��϶���
		Set newsTitleList = new HashSet();
		// 3������˳��������Ӹ������ű���
		newsTitleList.add(car);
		newsTitleList.add(test);
		// 4����ȡ���ű��������
		System.out.println("���ű�����ĿΪ��" + newsTitleList.size() + "��");
		// 5��ʹ��iterator()��ȡIterator����
		Iterator iterator = newsTitleList.iterator();
		// 6��ʹ��Iterator��������
		while(iterator.hasNext()){
			NewTitle title = (NewTitle) iterator.next();
			System.out.println(title.getTitleName());
		}
		System.out.println("************************");
		// 7��ʹ����ǿ��for��������
		for(Object obj:newsTitleList){
			NewTitle title = (NewTitle)obj;
			System.out.println(title.getTitleName());
		}
	}

}
