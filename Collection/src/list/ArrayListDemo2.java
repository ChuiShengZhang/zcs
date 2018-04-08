package list;
import java.util.*;

/**
 *����һ��è��
*@author �Ŵ�ʢ
*@version v1.1
*/
class Cat{
	String name;
	String variety;
	String color;
	 int age;
	/**
	 *@param name �����������
	 *@param variety �������Ʒ��
	 */
	 Cat(String name,String variety,String color,int age){
		this.name=name;
		this.variety=variety;
		this.color=color;
		this.age=age;
	}
}
/**
����һ��è��
*/
class Dog{
	String name;
	String variety;
	String color;
	int age;
	/**
	 *@param name �����������
	 *@param variety �������Ʒ��
	 */
	Dog(String name,String variety,String color,int age){
		this.name=name;
		this.variety=variety;
		this.color=color;
		this.age=age;
	}
}
/**
 * ����һ��demo��
 */
public class ArrayListDemo2 {
	public static void main(String[] args){
		ArrayList<Object> myList=new ArrayList<Object>();
		myList.add(new Dog("��1","��ë","��ɫ",1));
		myList.add(new Cat("è1","��˹è","��ɫ",4));
		//������ȡ������һ
		Iterator<Object> it=myList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("******************");
//		������ȡ��Ԫ�ط�ʽ��������ʹ�ã�ռ���ڴ�С
		for(Iterator<Object> it2=myList.iterator();it2.hasNext();){
			System.out.println(it2.next());
		}
	}
}
