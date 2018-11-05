package cn.jbit.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 测试HashMap的多个方法。
 * @author 北大青鸟
 */
public class TestMap {
    public static void main(String[] args) {
        // 1、使用HashMap存储多组国家英文简称和中文全称的键值对
        Map countries = new HashMap();
	    countries.put("CN", "中华人民共和国");
	    countries.put("RU", "俄罗斯联邦");
	    countries.put("FR", "法兰西共和国");
	    countries.put("US", "美利坚合众国");
        // 2、显示"CN"对应国家的中文全称
        String country = (String) countries.get("CN");
        System.out.println("CN对应的国家是:" + country);
        // 3、显示集合中元素个数
        System.out.println("Map中共有"+countries.size()+"组数据");
        /*4、两次判断Map中是否存在"FR"键*/
        System.out.println("Map中包含FR的key吗?" + 
        countries.containsKey("FR"));
        countries.remove("FR");
        System.out.println("Map中包含FR的key吗?" + 
        countries.containsKey("FR"));
        /* 5、分别显示键集、值集和键值对集*/
        System.out.println(countries.keySet());
        System.out.println(countries.values());
        System.out.println(countries);
        /* 3、清空 HashMap并判断*/
        countries.clear();
        if(countries.isEmpty())
        	System.out.println("已清空Map中数据！");
    }
}
