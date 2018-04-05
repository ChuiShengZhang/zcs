package list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 集合:是一个大小可变的容器(增删改查)
 * 							Collection
 * 	元素是无序的,可以重复,没有索引set--|	|--List  元素是有序的 有索引
 * 											|--ArrayList   底层的数据结构使用的是数组结构,有索引,查改快，增删慢,多线程是不同步的。
 * 											|--LinkedList	底层的数据结构使用的是链表结构,增删快,查改慢。
 * 											|--Vector		底层的数据结构使用的是数组结构，被ArrayList取代，多线程是同步的
 * 
 * 
 */

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		//添加数据
		//github
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		//取出元素
		//第一种一
		/*Iterator<String> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//第二种(节省内存)
		for(Iterator<String> ite=al.iterator();ite.hasNext();){
			System.out.println(ite.next());
		}
		
		//删除元素
		al.remove("java01");
		al.remove(1);
		System.out.println("al:"+al);
		
		//修改元素
		al.set(1, "java");
		System.out.println("al:"+al);
	}
}