package inner_class;
/*�ڲ��ࣺ�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա,����˽�С�
 * 		  �ⲿ����Ҫ�����ڲ���ĳ�Ա�����뽨���ڲ���Ķ���



*/
class Outer{
	int num=3;
	private class Inner{/*�ڲ��ࣺ�������ⲿ��ĳ�Աλ���ϣ��ɱ���Ա���η�������(static private),
		��һ���ⲿ��������Զ������ڲ���*/
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
		//ֱ�ӷ���inner���Ա(�ڲ����˽��)
		/*Outer.Inner oi=new Outer().new Inner();
		oi.method();*/
	}
}
