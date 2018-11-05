import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		//创建集合
		List<String> list = new ArrayList<String>();
		//增加10个不同单词
		list.add("this");
		list.add("is");
		list.add("collection");
		list.add("test");
		list.add("and");
		list.add("we");
		list.add("can");
		list.add("learn");
		list.add("how");
		list.add("to");
		
		//打印输出集合中最大元素和最小元素   
		String strMax = (String) Collections.max(list);
		String strMin = (String) Collections.min(list);
		System.out.println("最大值："+strMax);
		System.out.println("最小值："+strMin);
		//按升序打印输出集合中所有元素   
		Collections.sort(list);
		System.out.println("集合升序");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(Collections.binarySearch(list, "this"));
		//按降序打印输出集合中所有元素
		Collections.reverse(list);
		System.out.println("集合降序");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}

	}

}
