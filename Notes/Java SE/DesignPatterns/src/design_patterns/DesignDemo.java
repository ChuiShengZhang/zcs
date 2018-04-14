package design_patterns;
/*
 * 装饰设计模式
 * 		当想要对已有对象进行功能增强时，可以定义类，
 * 		将已有对象传入，基于已有的功能，对功能进行增强，
 * 		那么自定义的该类称为装饰类
 * 
 * 
 *		装饰类比继承更灵活，避免了继承导致的体系臃肿，而且降低了类与类之间的关系
 *		装饰因为增强已有对象，具备的功能和原有的是一样的，所以装饰类和被装饰类都是属与同一个体系的 
 * 
 * */

class Person{
	public void eat(){
		System.out.println("吃饭");
	}
}

class SuperPerson{
	private Person p;
	SuperPerson(Person p){//将需要增强的已有对象通过构造函数传入
		this.p=p;
	}
	public void superEat(){//对传入的对象进行增强
		System.out.println("喝汤");
		p.eat();
		System.out.println("饭后甜点");
	}
}
public class DesignDemo {
	public static void main(String[] args) {
		Person p=new Person();
		//p.eat();
		
		SuperPerson sp=new SuperPerson(p);//将要增强的p传入
		sp.superEat();//调用增强的方法
	}

}
