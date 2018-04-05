package set;

import java.util.HashSet;
import java.util.Iterator;

/*
*	����:��һ����С�ɱ������(��ɾ�Ĳ�)
* 							Collection
* 								|--set Ԫ��������ģ������ظ���,�̲߳�ͬ����	
* 										|-- HashSet �ײ����ݽṹ�ǹ�ϣ��
* 											HashSet��α�֤Ԫ�ص�һ���ԣ�
* 											���ж�Ԫ�صĹ�ϣֵ(hsahCode()����),
* 											����ϣֵ��ͬ,���ж�Ԫ��equals()�Ƿ�Ϊ�档
* 											����ϣֵ��ͬ���򲻻����equals()��
* 
* 											���(add),ɾ��(remove),�ж�Ԫ���Ƿ����(contains)
* 											��������hashCode()��equals()��
* 											��hashCode(),��equals()��
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
	//��дhashCode����
	public int hashCode(){
		return name.hashCode()+age*37;//�������������,��Ϊ�˾����ù�ϣֵ���ظ�
	}
	//��дequals����
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
	//��дtoString����
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
		hs.add(new Person("zhangsan",18));//�ظ�Ԫ�� �������
		hs.add(new Person("lisi",25));
		//ɾ��Ԫ��
		hs.remove(new Person("lisi",25));
		
		//�ж��Ƿ����ĳ��Ԫ��
		System.out.println("zhangsan 18 ���ڣ�"+hs.contains(new Person("zhangsan",18)));
		//������ȡ��Ԫ��
		for(Iterator<Person> it=hs.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
