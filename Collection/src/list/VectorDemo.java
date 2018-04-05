package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Vector		底层的数据结构使用的是数组结构，被ArrayList取代，多线程是同步的
/*
 * Vector 有两种取出方式 枚举和迭代器   常用迭代器,枚举因方法名长被迭代器取代
 */
public class VectorDemo {
	public static void main(String[] args){
		Vector<String> v=new Vector<String>();
		
		v.add("vector01");
		v.add("vector02");
		v.add("vector03");
		v.add("vector04");
		
		//枚举
		System.out.println("枚举");
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		//迭代器
		System.out.println("迭代器");
		Iterator<String> it=v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

