package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ÿһ��ѧ�����ж�Ӧ�Ĺ�����
 * ѧ��Student����ַString
 * ѧ�����ԣ�����������
 * ע�⣺������������ͬ��Ϊͬһ��ѧ��
 * ��֤ѧ����Ψһ��
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
	//��дhashCode����
	@Override
	public int hashCode(){
		return this.name.hashCode()+age*99;
	}
	//��дequals����
	@Override
	public boolean equals(Object obj){
		if(!(obj instanceof Student)){
			throw new RuntimeException("����ѧ��");
		}
		Student s=(Student)obj;
		if(this.getName()==s.getName() && this.getAge()==s.getAge()){
			return true;
		}
		return false;
	}
	//��дcompareTo����
	@Override
	public int compareTo(Student s){
		int num=new Integer(this.getAge()).compareTo(new Integer(s.getAge()));
		if(num==0){
			return this.getName().compareTo(s.getName());
		}
		return num;
	}
	//��дtoSting����
	@Override
	public String toString(){
		return name+":"+age;
	}
}
public class HashMapTest {
	public static void main(String[] args) {
		Map<Student,String> map=new HashMap<Student,String>();
		Student s1=new Student("����",18);
		Student s2=new Student("����",19);
		Student s3=new Student("����",20);
		Student s4=new Student("����",21);
		map.put(s1,"�Ϻ�");
		map.put(s2,"����");
		map.put(s3,"����");
		map.put(s4,"����");
		
		//��һ��ȡ����ʽ  keySet()
		Set<Student> keySet=map.keySet();
		Iterator<Student> it=keySet.iterator();
		while(it.hasNext()){
			Student key=it.next();
			System.out.println(key+"   keySet   "+map.get(key));
		}
		
		//�ڶ���ȡ����ʽ  entrySet()
		Set<Map.Entry<Student,String>> entrySet=map.entrySet();
		Iterator<Map.Entry<Student, String>> it2=entrySet.iterator();
		while(it2.hasNext()){
			Map.Entry<Student,String> me=it2.next();
			System.out.println(me.getKey()+"   entrySet  "+me.getValue());
		}
	}

}
