package set;

/*
 * 当元素本身不具备比较性或者元素本身具备的比较不是我们所需要的时
 * 可以通过实现Comparator接口使集合本身具有比较性,即集合一初始化就具有比较性
 * (自定义类实现Comparator接口或者用匿名内部类)
 * 
 * 当元素本身具备比较性和集合具有比较器时，优先使用比较器
 * 
 * 
 * 
 * 第二种方法:使集合本身具备比较性
 * */
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object>{//实现Comparator比较器
	//实现接口中的compare方法
	public int compare(Object o1,Object o2){
		Person2 p1=(Person2)o1;
		Person2 p2=(Person2)o2;
		int num= new Integer(p1.getAge()).compareTo(new Integer(p2.getAge()));
		if(num==0){
			return p1.getName().compareTo(p2.getName());
		}
		return num;
	}
}
class Person2{
	private String name;
	private int age;
	Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	//重写toString方法
		public String toString(){
			return this.getName()+this.getAge();
		}
}
public class TreeSetDemo2 {
	public static void main(String[] args){
		TreeSet<Person2> ts=new TreeSet<Person2>(new MyComparator());//使集合本身具备比较性
		
		ts.add(new Person2("zhangsan",18));
		ts.add(new Person2("lisi",19));
		ts.add(new Person2("wangwu",20));
		ts.add(new Person2("zhangsan",18));//姓名年龄一样，添加失败
		
		//取出元素
		for(Iterator<Person2> it=ts.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
