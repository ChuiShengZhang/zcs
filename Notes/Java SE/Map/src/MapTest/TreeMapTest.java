package MapTest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * ���󣺶�ѧ����������������������
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
		Student s1=new Student("����",16);
		Student s2=new Student("����",36);
		Student s3=new Student("����",28);
		Student s4=new Student("����",10);
		tm.put(s1,"�Ϻ�");
		tm.put(s2,"����");
		tm.put(s3,"����");
		tm.put(s4,"����");
		
		//��һ��ȡ����ʽ  keySet()
		Set<Student> keySet=tm.keySet();
		Iterator<Student> it=keySet.iterator();
		while(it.hasNext()){
		Student key=it.next();
		System.out.println(key+"   keySet+TreeMap   "+tm.get(key));
		}
		
		//�ڶ���ȡ����ʽ  entrySet()
		Set<Map.Entry<Student,String>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Student, String>> it2=entrySet.iterator();
		while(it2.hasNext()){
		Map.Entry<Student,String> me=it2.next();
		System.out.println(me.getKey()+"   entrySet+TreeMap  "+me.getValue());
		}
	}

}
