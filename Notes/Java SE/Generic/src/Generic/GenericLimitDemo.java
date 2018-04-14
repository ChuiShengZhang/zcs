package Generic;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * 泛型限定:   <?> 通配符，也可以称为占位符
 * 				上限  --- <? extends E>  可以接收E类型和E的子类型。
 * 				下限  --- <? super E>  可以接收E类型和E的父类型。
 * 
 * 
 * */
class Person{
	private String name;
	Person(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
class Student extends Person{
	Student(String name){
		super(name);
	}
}
class Worker extends Person{
	Worker(String name){
		super(name);
	}
}
class MyComp implements Comparator<Person>{
	public int compare(Person p1,Person p2){
		return p1.getName().compareTo(p2.getName());
	}
}
 
public class GenericLimitDemo {
	public static void printSet(TreeSet<? extends Person> ts){
		Iterator<? extends Person> it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next().getName());
		}
	}
	public static void main(String[] args) {
		 TreeSet<Student> ts=new TreeSet<Student>(new MyComp());
		 ts.add(new Student("stu1"));
		 ts.add(new Student("stu2"));
		 ts.add(new Student("stu3"));
		 printSet(ts);
		 
		 TreeSet<Worker> ts1=new TreeSet<Worker>(new MyComp());
		 ts1.add(new Worker("Worker1"));
		 ts1.add(new Worker("Worker2"));
		 ts1.add(new Worker("Worker3"));
		 printSet(ts1);
	}

}
