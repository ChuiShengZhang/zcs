package Generic;


//泛型类
class Demo<T>{
	public void show(T t){//该t为类上声明的T 跟随类的类型
		System.out.println("show t:"+t);
	}
	public <Q>void print(Q q){//该q为该方法上的泛型，定义在方法上，不跟随类
		System.out.println("print q:"+q);
	}
	/*静态方法不能使用类上声明的泛型，因为静态方法存在的时候还没有对象
	public static void method(T t){
		System.out.println(t);
	}*/
	//静态方法只能使用方法上定义的泛型
	public static <T> void method(T t){
		System.out.println("static t:"+t);
	}
}

class Demo2{
	public <T>void show(T t){
		
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		Demo<String> d=new Demo<String>();
		d.show("java");
//		d.show(4); 该方法上的泛型跟随类，所以只能传入字符串
		Demo.method("java");
		Demo.method(new Integer(5));
		
		//print方法使用的是局部定义的，不跟随类
		d.print("java");
		d.print(4);
	}

}
