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
		System.out.println("ѧ����");
	}
	public void eat(){
		System.out.println("�Է�");
	}
	public void drink(){
		System.out.println("�ȿ���");
	}
	public void liaoMei(){
		System.out.println("����");
	}
}
class WenStudent extends Student{
	WenStudent(String name,String id,int age){
		this.name=name;
		this.id=id;
		this.age=age;
	}
	public void study(){
		System.out.println("ѧ��ʷ��");
	}
	public void eat(){
		System.out.println("����");
	}
	public void drink(){
		System.out.println("��ţ��");
	}
	public void liaoHan(){
		System.out.println("�ú�");
	}
}
//�ٿض���ȥ��ɹ��ܵ�һ����
class DoSome{
	public void pubFunction(Student st){
		st.study();
		st.eat();
		st.drink();
	}
	public void priFunction(Student st){
		if(st instanceof LiStudent){
			LiStudent lst=(LiStudent) st;//����ĳ��������з��� ��Ҫ����������ǿ��ת��Ϊ����Ķ���(����ת��)
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
		Student lst=new LiStudent("����","��_01",18);  ��̬������ת��
		lst.study();
		lst.eat();
		lst.drink();
		Student wst=new WenStudent("����","��_01",18);
		wst.study();
		wst.eat();
		wst.drink();
		*/
		DoSome ds=new DoSome();
		ds.pubFunction(new LiStudent("����","��_01",18));
		ds.pubFunction(new WenStudent("����","��_01",18));
		ds.priFunction(new LiStudent("����","��_01",18));
		ds.priFunction(new WenStudent("����","��_01",18));
	}

}
