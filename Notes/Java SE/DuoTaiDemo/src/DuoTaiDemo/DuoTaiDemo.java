package DuoTaiDemo;
abstract class Student{
	String name;
	String id;
	int age;
	public abstract void study();
	public abstract void eat();
	public abstract void drink();
	public void sleep(){
		System.out.println("slleep");
	}
}
class LiStudent extends Student{
	LiStudent(String name,String id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void study(){
		System.out.println("学数理化");
	}
	public void eat(){
		System.out.println("吃饭");
	}
	public void drink(){
		System.out.println("喝可乐");
	}
	public void liaoMei(){
		System.out.println("撩妹");
	}
}
class WenStudent extends Student{
	WenStudent(String name,String id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void study(){
		System.out.println("学政史地");
	}
	public void eat(){
		System.out.println("吃面");
	}
	public void drink(){
		System.out.println("喝牛奶");
	}
	public void liaoHan(){
		System.out.println("撩汉");
	}
}
//操控对象去完成功能的一个类
class DoSome{
	public void pubFunction(Student st){
		st.study();
		st.eat();
		st.drink();
	}
	public void priFunction(Student st){
		if(st instanceof LiStudent){
			LiStudent lst=(LiStudent) st;//调用某个类的特有方法 需要将父类引用强制转换为该类的对象(向下转型)
			lst.liaoMei();
		}if(st instanceof WenStudent){
			WenStudent wst=(WenStudent) st;
			wst.liaoHan();
		}
	}
}
public class DuoTaiDemo {
	public static void main(String[] args){
		/*
		Student lst=new LiStudent("张三","理_01",18);  多态的向上转型
		lst.study();
		lst.eat();
		lst.drink();
		Student wst=new WenStudent("李四","文_01",18);
		wst.study();
		wst.eat();
		wst.drink();
		*/
		DoSome ds=new DoSome();
		ds.pubFunction(new LiStudent("张三","理_01",18));
		ds.pubFunction(new WenStudent("李四","文_01",18));
		ds.priFunction(new LiStudent("张三","理_01",18));
		ds.priFunction(new WenStudent("李四","文_01",18));
	}

}
