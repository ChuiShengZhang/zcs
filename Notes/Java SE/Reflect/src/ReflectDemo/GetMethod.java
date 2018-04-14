package ReflectDemo;

import java.lang.reflect.Method;

/*
 * ͨ�������ȡ����
 */
public class GetMethod {
	public static void main(String[] args) throws Exception {
		getNullMethod();
		System.out.println("***********");
		getParamMethod();
	}
	//��ȡ�޲η���
	public static void getNullMethod() throws Exception{
		//��ȡClass����
		Class clazz = Class.forName("DemoClass.Person");
		//ͨ�����䴴������
		Object p = clazz.newInstance();
		
		//��ȡ���з���
//		Method method = clazz.getMethod("show", null);//��ȡָ�����ƣ������б�ķ���
//		Method[] methods = clazz.getMethods();//��ȡ���й��з���(�����Ӹ���̳еĹ��з���)
//		Method method = clazz.getDeclaredMethod("show", String.class,int.class);//��ȡָ�����ƣ������б��˽�з���
//		Method[] methods = clazz.getDeclaredMethods();//��ȡ��������й��к�˽�з���(����������̳еķ���)
		
		Method method = clazz.getMethod("show", null);//��ȡ�޲�show����
		//���÷���
		method.invoke(p, null);	
	}
	
	//��ȡ�вη���
	public static void getParamMethod() throws Exception{
		//��ȡClass����
		Class clazz = Class.forName("DemoClass.Person");
		//ͨ�����䴴������
		Object p = clazz.newInstance();
		//��ȡ�вη���
		Method method = clazz.getMethod("show", String.class,int.class);
		//���÷���
		method.invoke(p, "����",20);
	}
}
