package DemoClass;


public class Person {
	private String name;
	private int age;
	public Person(){
		super();
		System.out.println("DemoClass.Perosn�޲ι��캯��������");
	}
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("DemoClass.Person�вι��캯��������");
		}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void show(){
		System.out.println("DemoClass.Person...........�޲�show  run");
	}
	public void show(String name,int age){
		System.out.println("DemoClass.Person  �в� show run "+name+":"+age);
	}
	private void method(){
		System.out.println("DemoClass.Person  method run");
	}
}
