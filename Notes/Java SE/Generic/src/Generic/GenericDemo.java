package Generic;


//������
class Demo<T>{
	public void show(T t){//��tΪ����������T �����������
		System.out.println("show t:"+t);
	}
	public <Q>void print(Q q){//��qΪ�÷����ϵķ��ͣ������ڷ����ϣ���������
		System.out.println("print q:"+q);
	}
	/*��̬��������ʹ�����������ķ��ͣ���Ϊ��̬�������ڵ�ʱ��û�ж���
	public static void method(T t){
		System.out.println(t);
	}*/
	//��̬����ֻ��ʹ�÷����϶���ķ���
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
//		d.show(4); �÷����ϵķ��͸����࣬����ֻ�ܴ����ַ���
		Demo.method("java");
		Demo.method(new Integer(5));
		
		//print����ʹ�õ��Ǿֲ�����ģ���������
		d.print("java");
		d.print(4);
	}

}
