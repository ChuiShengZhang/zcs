package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Vector		�ײ�����ݽṹʹ�õ�������ṹ����ArrayListȡ�������߳���ͬ����
/*
 * Vector ������ȡ����ʽ ö�ٺ͵�����   ���õ�����,ö���򷽷�������������ȡ��
 */
public class VectorDemo {
	public static void main(String[] args){
		Vector<String> v=new Vector<String>();
		
		v.add("vector01");
		v.add("vector02");
		v.add("vector03");
		v.add("vector04");
		
		//ö��
		System.out.println("ö��");
		Enumeration<String> en=v.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
		//������
		System.out.println("������");
		Iterator<String> it=v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

