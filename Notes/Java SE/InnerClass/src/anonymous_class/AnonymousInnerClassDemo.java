package anonymous_class;
abstract class Inner1{
	abstract public void show();
}
class Outter{
	int x=1;
	
	 //  内部类
	private class Inner{//内部类:定义在外部类的成员位置
		public void method(){
			System.out.println("内部类x:"+x);
		}
	}
	public void function(){
		Inner in=new Inner();
		in.method();
	}
	//    匿名内部类
	public void function1(){
		Inner1 i=new Inner1(){
			public void method(){
				System.out.println("匿名内部类");
			}
			public void show(){
				System.out.println("匿名内部类x="+x);
			}
		};
		i.show();
	}
}
public class AnonymousInnerClassDemo {
	public static void main(String[] args){
		//内部类
		Outter ot=new Outter();
		ot.function();
		//匿名内部类
		Outter ot1=new Outter();
		ot1.function1();
	}
}
