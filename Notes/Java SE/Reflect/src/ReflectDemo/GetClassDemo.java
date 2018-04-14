package ReflectDemo;

import DemoClass.Person;

/*
 * Reflect 反射===动态的获取类的信息
 * 		Class 字节码文件对象==将字节码文件封装成对象
 */
public class GetClassDemo {
	public static void main(String[] args) throws Exception{
		getClassObject_1();
	}
	
	/*
	 * 获取字节码文件对象有三种方法
	 */
	//方法一  最常用的
	public static void getClassObject_1() throws Exception{
		/*
		 * 通过类的字符串名称获取该类的Class对象
		 * 扩展性好
		 */
		String name = "DemoClass.Person";//类名要写完整
		Class clazz = Class.forName(name);
		Class class1 = Class.forName(name);
		
		System.out.println(class1 == clazz);
	}
	//方法二
	public static void getClassObject_2(){
		/*
		 * 通过Object中的getClass方法
		 * 要先创建对象 ，在调用Object的getClass方法
		 * 扩展性不好
		 */
		Person person = new Person();
		Class clazz = person.getClass();
		
		Person person2 = new Person();
		Class clazz1 = person2.getClass();
		
		System.out.println(clazz == clazz1);
	}
	
	//方法三
	/*
	 * 每个类都有一个静态的属性.class
	 * 通过这个属性获取Class对象
	 * 扩展性不好
	 */
	public static void getClassObject_3(){
		Class clazz = Person.class;
		Class clazz2 = Person.class;
		System.out.println(clazz == clazz2);
	}
}
