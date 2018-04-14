package MapTest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求：对学生对象的年龄进行升序排序
 * 
 * 
 * */
class MyComp implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2){
		int num=new Integer(s1.getAge()).compareTo(s2.getAge());
		if(num==0){
			return s1.getName().compareTo(s2.getName());
		}
		return num;
	}
}
public class TreeMapTest {
	public static void main(String[] args) {
		TreeMap<Student,String> tm=new TreeMap<Student, String>(new MyComp());
		Student s1=new Student("张三",16);
		Student s2=new Student("李四",36);
		Student s3=new Student("王五",28);
		Student s4=new Student("刘六",10);
		tm.put(s1,"上海");
		tm.put(s2,"北京");
		tm.put(s3,"广州");
		tm.put(s4,"深圳");
		
		//第一种取出方式  keySet()
		Set<Student> keySet=tm.keySet();
		Iterator<Student> it=keySet.iterator();
		while(it.hasNext()){
		Student key=it.next();
		System.out.println(key+"   keySet+TreeMap   "+tm.get(key));
		}
		
		//第二种取出方式  entrySet()
		Set<Map.Entry<Student,String>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Student, String>> it2=entrySet.iterator();
		while(it2.hasNext()){
		Map.Entry<Student,String> me=it2.next();
		System.out.println(me.getKey()+"   entrySet+TreeMap  "+me.getValue());
		}
	}

}
