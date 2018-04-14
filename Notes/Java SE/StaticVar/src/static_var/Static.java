package static_var;

public class Static {
	public static void print(){//static静态方法
		System.out.println("使用静态变量");
	}
	public void printl(){//无static 非静态方法
		System.out.println("使用对象");
	}
	public static void main(String[] args){
		Static.print();//使用静态变量直接用类名访问变量/方法 无需创建对象
		Static input=new Static();//使用非静态变量/方法需要先创建对象
		input.printl();//非静态用对象访问变量/方法
	}

}
