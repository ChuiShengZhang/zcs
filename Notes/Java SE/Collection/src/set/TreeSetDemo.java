package set;

import java.util.Iterator;
import java.util.TreeSet;

/*  				Collection
 * 						|--set
 * 							|--HashSet
 * 									
 * 							|--TreeSet 可以对集合中的元素进行排序
 * 										要将自定义对象存入集合,改自定义对象必须具备比较性
 * 										(该对象所属类实现Comparable接口)
 * 
 * 
 * 
 * 第一种方法:使元素本身具备比较性
 * 
 * */
class Person1 implements Comparable<Person1>{//实现Comparable接口使Person具有比较性
	private String name;
	private int age;
	Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//实现接口中的方法(自定义按年龄顺序排序,年龄相同比较名字)
	public int compareTo(Person1 p){
		if(this.age>p.age){
			return 1;
		}if(this.age==p.age){
			return this.name.compareTo(p.name);
		}
		return -1;
	}
	//重写toString方法
		public String toString(){
			return this.getName()+this.getAge();
		}
}
public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<Person1> ts=new TreeSet<Person1>();
		
		ts.add(new Person1("zhangsan",18));
		ts.add(new Person1("lisi",19));
		ts.add(new Person1("wangwu",20));
		ts.add(new Person1("zhangsan",18));//姓名年龄一样，添加失败
		
		//取出元素
		for(Iterator<Person1> it=ts.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}

}
