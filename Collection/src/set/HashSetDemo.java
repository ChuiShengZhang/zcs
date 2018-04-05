package set;

import java.util.HashSet;
import java.util.Iterator;

/*
*	集合:是一个大小可变的容器(增删改查)
* 							Collection
* 								|--set 元素是无序的，不可重复的,线程不同步。	
* 										|-- HashSet 底层数据结构是哈希表。
* 											HashSet如何保证元素的一致性？
* 											先判断元素的哈希值(hsahCode()方法),
* 											若哈希值相同,在判断元素equals()是否为真。
* 											若哈希值不同，则不会调用equals()。
* 
* 											添加(add),删除(remove),判断元素是否存在(contains)
* 											都是依赖hashCode()和equals()。
* 											先hashCode(),在equals()。
* 										|--TreeSet
*/

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
	//重写hashCode方法
	public int hashCode(){
		return name.hashCode()+age*37;//年龄乘以任意数,是为了尽量让哈希值不重复
	}
	//重写equals方法
	public boolean equals(Object obj){
		if(!(obj instanceof Person)){
			return false;
		}
		Person p=(Person) obj;
		if(this.name==p.name && this.age==p.age){
			return true;
		}
		return false;
	}
	//重写toString方法
	public String toString(){
		return this.getName()+this.getAge();
	}
}
public class HashSetDemo {
	public static void main(String[] args){
		HashSet<Person> hs=new HashSet<Person>();
		
		hs.add(new Person("zhangsan",18));
		hs.add(new Person("lisi",19));
		hs.add(new Person("wangwu",20));
		hs.add(new Person("zhangsan",18));//重复元素 不会存入
		hs.add(new Person("lisi",25));
		//删除元素
		hs.remove(new Person("lisi",25));
		
		//判断是否存在某个元素
		System.out.println("zhangsan 18 存在？"+hs.contains(new Person("zhangsan",18)));
		//迭代器取出元素
		for(Iterator<Person> it=hs.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
