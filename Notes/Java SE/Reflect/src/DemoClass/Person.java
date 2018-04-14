package DemoClass;


public class Person {
	private String name;
	private int age;
	public Person(){
		super();
		System.out.println("DemoClass.Perosn无参构造函数运行了");
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("DemoClass.Person有参构造函数运行了");
		}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println("DemoClass.Person...........无参show  run");
	}
	public void show(String name,int age){
		System.out.println("DemoClass.Person  有参 show run "+name+":"+age);
	}
	private void method(){
		System.out.println("DemoClass.Person  method run");
	}
}
