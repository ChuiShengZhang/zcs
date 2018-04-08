package list;
import java.util.*;

/**
 *这是一个猫类
*@author 张垂盛
*@version v1.1
*/
class Cat{
	String name;
	String variety;
	String color;
	 int age;
	/**
	 *@param name 用来存放名字
	 *@param variety 用来存放品种
	 */
	 Cat(String name,String variety,String color,int age){
		this.name=name;
		this.variety=variety;
		this.color=color;
		this.age=age;
	}
}
/**
这是一个猫类
*/
class Dog{
	String name;
	String variety;
	String color;
	int age;
	/**
	 *@param name 用来存放名字
	 *@param variety 用来存放品种
	 */
	Dog(String name,String variety,String color,int age){
		this.name=name;
		this.variety=variety;
		this.color=color;
		this.age=age;
	}
}
/**
 * 这是一个demo类
 */
public class ArrayListDemo2 {
	public static void main(String[] args){
		ArrayList<Object> myList=new ArrayList<Object>();
		myList.add(new Dog("狗1","金毛","黄色",1));
		myList.add(new Cat("猫1","波斯猫","黑色",4));
		//迭代器取出方法一
		Iterator<Object> it=myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("******************");
//		迭代器取出元素方式二，建议使用，占用内存小
		for(Iterator<Object> it2=myList.iterator();it2.hasNext();){
			System.out.println(it2.next());
		}
	}
}
