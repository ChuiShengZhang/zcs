package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 每一个学生都有对应的归属地
 * 学生Student，地址String
 * 学生属性：姓名，年龄
 * 注意：姓名和年龄相同视为同一个学生
 * 保证学生的唯一性
 * 
 * 
 * 
 * */

class Student implements Comparable<Student>{
	private String name;
	private int age;
	Student(String name,int age){
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
	@Override
	public int hashCode(){
		return this.name.hashCode()+age*99;
	}
	//重写equals方法
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Student)){
			throw new RuntimeException("不是学生");
		}
		Student s=(Student)obj;
		if(this.getName()==s.getName() && this.getAge()==s.getAge()){
			return true;
		}
		return false;
	}
	//重写compareTo方法
	@Override
	public int compareTo(Student s){
		int num=new Integer(this.getAge()).compareTo(new Integer(s.getAge()));
		if(num==0){
			return this.getName().compareTo(s.getName());
		}
		return num;
	}
	//重写toSting方法
	@Override
	public String toString(){
		return name+":"+age;
	}
}
public class HashMapTest {
	public static void main(String[] args) {
		Map<Student,String> map=new HashMap<Student,String>();
		Student s1=new Student("张三",18);
		Student s2=new Student("李四",19);
		Student s3=new Student("王五",20);
		Student s4=new Student("刘六",21);
		map.put(s1,"上海");
		map.put(s2,"北京");
		map.put(s3,"广州");
		map.put(s4,"深圳");
		
		//第一种取出方式  keySet()
		Set<Student> keySet=map.keySet();
		Iterator<Student> it=keySet.iterator();
		while(it.hasNext()){
			Student key=it.next();
			System.out.println(key+"   keySet   "+map.get(key));
		}
		
		//第二种取出方式  entrySet()
		Set<Map.Entry<Student,String>> entrySet=map.entrySet();
		Iterator<Map.Entry<Student, String>> it2=entrySet.iterator();
		while(it2.hasNext()){
			Map.Entry<Student,String> me=it2.next();
			System.out.println(me.getKey()+"   entrySet  "+me.getValue());
		}
	}

}
