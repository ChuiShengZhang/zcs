package ReflectDemo;

import java.lang.reflect.Field;

/*
 * ͨ�������ȡ�ֶ�
 * 
 */
public class GetField {
	public static void main(String[] args) throws Exception {
		String name = "DemoClass.Person";
		//��ȡClass����
		Class clazz = Class.forName(name);
		
		//��ȡ�ֶ�
//		Field f = clazz.getField("age");//��ȡָ�����ֶΣ�ֻ�ܻ�ȡ���е��ֶ�
//		Field f = clazz.getDeclaredField("age");//���ܻ�ȡ���У�Ҳ�ܻ�ȡ˽���ֶ�
		
//		Field[] fields = clazz.getFields();//��ȡ�����ֶΣ�������˽��
//		Field[] fields = clazz.getDeclaredFields();//��ȡ���������ֶΰ���˽��
		
		Field f =clazz.getDeclaredField("age");
		
		//��ȡ����
		Object obj = clazz.newInstance();
		//ȥ���ֶε�Ȩ�޼�� ��������
		f.setAccessible(true);
		
		//�����ֶ�
		f.set(obj, 8080);
		//��ȡ
		Object o = f.get(obj);
		
		System.out.println(o);

	}
}
