package ReflectDemo;

import java.lang.reflect.Constructor;

/*
 * 通过反射获取对象的实例
 */
public class ReflectNewInstanceDemo {
	public static void main(String[] args) throws Exception {
		getInstance_1();
		System.out.println("***************");
		getInstance_2();
	}
	//方法一(通过无参构造函数创建实例)
	public static void getInstance_1() throws Exception{
		//早期创建对象
		/*
		 * new 创建对象 先找到对应的字节码文件，将该字节码文件加载进内存
		 * 然后在堆内存中开辟一个空间
		 */
		//DemoClass.Person person = new DemoClass.Person();
		
		//用反射创建对象
		String className = "DemoClass.Person";
		//获取Class对象
		Class clazz = Class.forName(className);
		//通过Class对象的方法创建对象
		Object object = clazz.newInstance();
	}
	
	//方法二(获取类的有参构造函数,并创建对象)
	public static void getInstance_2() throws Exception{
		//早期new创建对象
		//DemoClass.Person person = new DemoClass.Person("张三",20);
		
		//通过反射有参构造函数创建对象
		String name = "DemoClass.Person";
		//获取Class对象
		Class clazz = Class.forName(name);
		//通过Class的getConstructor(...paramTypes)方法获取指定参数构造函数
		//该方法返回的是一个Constructor对象,通过该对象的newInsance创建对象
		Constructor constructor = clazz.getConstructor(String.class,int.class);
		
		constructor.newInstance("张三",21);
		
	}
}
