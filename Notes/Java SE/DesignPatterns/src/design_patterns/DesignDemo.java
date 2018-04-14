package design_patterns;
/*
 * װ�����ģʽ
 * 		����Ҫ�����ж�����й�����ǿʱ�����Զ����࣬
 * 		�����ж����룬�������еĹ��ܣ��Թ��ܽ�����ǿ��
 * 		��ô�Զ���ĸ����Ϊװ����
 * 
 * 
 *		װ����ȼ̳и��������˼̳е��µ���ϵӷ�ף����ҽ�����������֮��Ĺ�ϵ
 *		װ����Ϊ��ǿ���ж��󣬾߱��Ĺ��ܺ�ԭ�е���һ���ģ�����װ����ͱ�װ���඼������ͬһ����ϵ�� 
 * 
 * */

class Person{
	public void eat(){
		System.out.println("�Է�");
	}
}

class SuperPerson{
	private Person p;
	SuperPerson(Person p){//����Ҫ��ǿ�����ж���ͨ�����캯������
		this.p=p;
	}
	public void superEat(){//�Դ���Ķ��������ǿ
		System.out.println("����");
		p.eat();
		System.out.println("�������");
	}
}
public class DesignDemo {
	public static void main(String[] args) {
		Person p=new Person();
		//p.eat();
		
		SuperPerson sp=new SuperPerson(p);//��Ҫ��ǿ��p����
		sp.superEat();//������ǿ�ķ���
	}

}
