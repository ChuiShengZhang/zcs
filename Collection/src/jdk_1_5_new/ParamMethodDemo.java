package jdk_1_5_new;

/*
 * jdk1.5�汾������  �ɱ����
 *   		��������... ������====���������Ĳ�����װ������
 *   		ע������:�ɱ����һ��Ҫ�����ڲ����б�������
 * 
 * */
public class ParamMethodDemo {
	public static void main(String[] args){
		show(1,5,6);
		show(4,5);
		show("8",1,2,3);
	}
	public static void show(int... arr){
		for(int i:arr){
			System.out.println(i);
		}
	}
	public static void show(String str,int... arr){
		System.out.println("show2");
		System.out.println(str);
		System.out.println(arr.length);
	}
	//public static void show(int... arr,String str){}�ɱ����Ҫ���������
}
