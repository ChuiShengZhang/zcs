package anonymous_class;
abstract class Inner1{
	abstract public void show();
}
class Outter{
	int x=1;
	
	 //  �ڲ���
	private class Inner{//�ڲ���:�������ⲿ��ĳ�Աλ��
		public void method(){
			System.out.println("�ڲ���x:"+x);
		}
	}
	public void function(){
		Inner in=new Inner();
		in.method();
	}
	//    �����ڲ���
	public void function1(){
		Inner1 i=new Inner1(){
			public void method(){
				System.out.println("�����ڲ���");
			}
			public void show(){
				System.out.println("�����ڲ���x="+x);
			}
		};
		i.show();
	}
}
public class AnonymousInnerClassDemo {
	public static void main(String[] args){
		//�ڲ���
		Outter ot=new Outter();
		ot.function();
		//�����ڲ���
		Outter ot1=new Outter();
		ot1.function1();
	}
}
