package ReflectDemo;

import java.lang.reflect.Method;

/*
 * 通过反射获取方法
 */
public class GetMethod {
	public static void main(String[] args) throws Exception {
		getNullMethod();
		System.out.println("***********");
		getParamMethod();
	}
	//获取无参方法
	public static void getNullMethod() throws Exception{
		//获取Class对象
		Class clazz = Class.forName("DemoClass.Person");
		//通过反射创建对象
		Object p = clazz.newInstance();
		
		//获取公有方法
//		Method method = clazz.getMethod("show", null);//获取指定名称，参数列表的方法
//		Method[] methods = clazz.getMethods();//获取所有公有方法(包括从父类继承的公有方法)
//		Method method = clazz.getDeclaredMethod("show", String.class,int.class);//获取指定名称，参数列表的私有方法
//		Method[] methods = clazz.getDeclaredMethods();//获取本类的所有公有和私有方法(不包括父类继承的方法)
		
		Method method = clazz.getMethod("show", null);//获取无参show方法
		//调用方法
		method.invoke(p, null);	
	}
	
	//获取有参方法
	public static void getParamMethod() throws Exception{
		//获取Class对象
		Class clazz = Class.forName("DemoClass.Person");
		//通过反射创建对象
		Object p = clazz.newInstance();
		//获取有参方法
		Method method = clazz.getMethod("show", String.class,int.class);
		//调用方法
		method.invoke(p, "张三",20);
	}
}
