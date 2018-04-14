package ReflectDemo;

import java.lang.reflect.Field;

/*
 * 通过反射获取字段
 * 
 */
public class GetField {
	public static void main(String[] args) throws Exception {
		String name = "DemoClass.Person";
		//获取Class对象
		Class clazz = Class.forName(name);
		
		//获取字段
//		Field f = clazz.getField("age");//获取指定的字段，只能获取共有的字段
//		Field f = clazz.getDeclaredField("age");//既能获取共有，也能获取私有字段
		
//		Field[] fields = clazz.getFields();//获取所有字段，不包括私有
//		Field[] fields = clazz.getDeclaredFields();//获取本类所有字段包括私有
		
		Field f =clazz.getDeclaredField("age");
		
		//获取对象
		Object obj = clazz.newInstance();
		//去除字段的权限检查 暴力访问
		f.setAccessible(true);
		
		//设置字段
		f.set(obj, 8080);
		//获取
		Object o = f.get(obj);
		
		System.out.println(o);

	}
}
