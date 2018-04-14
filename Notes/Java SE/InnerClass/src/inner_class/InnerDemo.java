package inner_class;
/*内部类：内部类可以直接访问外部类的成员,包括私有。
 * 		  外部类想要访问内部类的成员，必须建立内部类的对象。



*/
class Outer{
	int num=3;
	private class Inner{/*内部类：定义在外部类的成员位置上，可被成员修饰符所修饰(static private),
		在一个外部类里面可以定义多个内部类*/
		public void method(){
			System.out.println("inner:"+num);
		}
	}
	public void function(){
		Inner in=new Inner();
		in.method();
	}
}
public class InnerDemo {
	public static void main(String[] args){
		Outer ot=new Outer();
		ot.function();
		//直接访问inner里成员(内部类非私有)
		/*Outer.Inner oi=new Outer().new Inner();
		oi.method();*/
	}
}
