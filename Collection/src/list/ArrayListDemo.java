package list;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����:��һ����С�ɱ������(��ɾ�Ĳ�)
 * 							Collection
 * 	Ԫ���������,�����ظ�,û������set--|	|--List  Ԫ��������� ������
 * 											|--ArrayList   �ײ�����ݽṹʹ�õ�������ṹ,������,��Ŀ죬��ɾ��,���߳��ǲ�ͬ���ġ�
 * 											|--LinkedList	�ײ�����ݽṹʹ�õ�������ṹ,��ɾ��,�������
 * 											|--Vector		�ײ�����ݽṹʹ�õ�������ṹ����ArrayListȡ�������߳���ͬ����
 * 
 * 
 */

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		//�������
		//github
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		
		//ȡ��Ԫ��
		//��һ��һ
		/*Iterator<String> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//�ڶ���(��ʡ�ڴ�)
		for(Iterator<String> ite=al.iterator();ite.hasNext();){
			System.out.println(ite.next());
		}
		
		//ɾ��Ԫ��
		al.remove("java01");
		al.remove(1);
		System.out.println("al:"+al);
		
		//�޸�Ԫ��
		al.set(1, "java");
		System.out.println("al:"+al);
	}
}