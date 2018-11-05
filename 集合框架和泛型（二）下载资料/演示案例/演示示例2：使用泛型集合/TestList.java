

import java.util.ArrayList;
import java.util.List;

import cn.jbit.epet.poly.Dog;

/**
 * 测试对List应用泛型。
 * @author 北大青鸟
 */
public class TestList {
    public static void main(String[] args) {
        /* 1、创建多个狗狗对象*/
        Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");
        /* 2、创建ArrayList集合对象并把多个狗狗对象放入其中*/
        List<Dog> dogs = new ArrayList<Dog>();//标记元素类型
        dogs.add(ououDog);
	    dogs.add(yayaDog);
	    dogs.add(meimeiDog);
	    dogs.add(2, feifeiDog); // 添加feifeiDog到指定位置
	    //dogs.add("hello"); //出现编译错误,元素类型不是Dog。
        /* 3、 显示第三个元素的信息*/
        Dog dog3 = dogs.get(2); //无需类型强制转换
        System.out.println("第三个狗狗的信息如下:");
        System.out.println(dog3.getName() + "\t" + dog3.getStrain());
        /*4、使用foreach语句遍历dogs对象*/
		System.out.println("\n所有狗狗的信息如下：");
		for(Dog dog:dogs){//无需类型强制转换
			System.out.println(dog.getName() + "\t" + dog.getStrain());
		}   
    }
}
