package static_var;

public class Static {
	public static void print(){//static��̬����
		System.out.println("ʹ�þ�̬����");
	}
	public void printl(){//��static �Ǿ�̬����
		System.out.println("ʹ�ö���");
	}
	public static void main(String[] args){
		Static.print();//ʹ�þ�̬����ֱ�����������ʱ���/���� ���贴������
		Static input=new Static();//ʹ�÷Ǿ�̬����/������Ҫ�ȴ�������
		input.printl();//�Ǿ�̬�ö�����ʱ���/����
	}

}
