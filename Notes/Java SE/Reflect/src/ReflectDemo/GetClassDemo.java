package ReflectDemo;

import DemoClass.Person;

/*
 * Reflect ����===��̬�Ļ�ȡ�����Ϣ
 * 		Class �ֽ����ļ�����==���ֽ����ļ���װ�ɶ���
 */
public class GetClassDemo {
	public static void main(String[] args) throws Exception{
		getClassObject_1();
	}
	
	/*
	 * ��ȡ�ֽ����ļ����������ַ���
	 */
	//����һ  ��õ�
	public static void getClassObject_1() throws Exception{
		/*
		 * ͨ������ַ������ƻ�ȡ�����Class����
		 * ��չ�Ժ�
		 */
		String name = "DemoClass.Person";//����Ҫд����
		Class clazz = Class.forName(name);
		Class class1 = Class.forName(name);
		
		System.out.println(class1 == clazz);
	}
	//������
	public static void getClassObject_2(){
		/*
		 * ͨ��Object�е�getClass����
		 * Ҫ�ȴ������� ���ڵ���Object��getClass����
		 * ��չ�Բ���
		 */
		Person person = new Person();
		Class clazz = person.getClass();
		
		Person person2 = new Person();
		Class clazz1 = person2.getClass();
		
		System.out.println(clazz == clazz1);
	}
	
	//������
	/*
	 * ÿ���඼��һ����̬������.class
	 * ͨ��������Ի�ȡClass����
	 * ��չ�Բ���
	 */
	public static void getClassObject_3(){
		Class clazz = Person.class;
		Class clazz2 = Person.class;
		System.out.println(clazz == clazz2);
	}
}
