package ReflectDemo;

import java.lang.reflect.Constructor;

/*
 * ͨ�������ȡ�����ʵ��
 */
public class ReflectNewInstanceDemo {
	public static void main(String[] args) throws Exception {
		getInstance_1();
		System.out.println("***************");
		getInstance_2();
	}
	//����һ(ͨ���޲ι��캯������ʵ��)
	public static void getInstance_1() throws Exception{
		//���ڴ�������
		/*
		 * new �������� ���ҵ���Ӧ���ֽ����ļ��������ֽ����ļ����ؽ��ڴ�
		 * Ȼ���ڶ��ڴ��п���һ���ռ�
		 */
		//DemoClass.Person person = new DemoClass.Person();
		
		//�÷��䴴������
		String className = "DemoClass.Person";
		//��ȡClass����
		Class clazz = Class.forName(className);
		//ͨ��Class����ķ�����������
		Object object = clazz.newInstance();
	}
	
	//������(��ȡ����вι��캯��,����������)
	public static void getInstance_2() throws Exception{
		//����new��������
		//DemoClass.Person person = new DemoClass.Person("����",20);
		
		//ͨ�������вι��캯����������
		String name = "DemoClass.Person";
		//��ȡClass����
		Class clazz = Class.forName(name);
		//ͨ��Class��getConstructor(...paramTypes)������ȡָ���������캯��
		//�÷������ص���һ��Constructor����,ͨ���ö����newInsance��������
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		constructor.newInstance("����",21);
		
	}
}
