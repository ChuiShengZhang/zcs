package list;
/*
 * ����:����,�Ƚ��ȳ�
 * 
 * */

import java.util.LinkedList;

class Line{
	private LinkedList<Object> ll;
	Line(){
		ll=new LinkedList<Object>();
	}
	public void myAdd(Object obj){
		ll.addFirst(obj);
	}
	public Object myGet(){
		return ll.removeLast();
	}
	public boolean isNull(){
		return ll.isEmpty();
	}
}
class Person{
	private String name;
	private int age;
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String toString(){
		return this.name+this.age;
	}
}
public class LinkedListTest {
	public static void main(String[] args){
		Line l=new Line();
		l.myAdd(new Person("����",18));
		l.myAdd(new Person("����",19));
		l.myAdd(new Person("����",20));
		
		while(!l.isNull()){
			System.out.println(l.myGet());
		}
		
	}
}
