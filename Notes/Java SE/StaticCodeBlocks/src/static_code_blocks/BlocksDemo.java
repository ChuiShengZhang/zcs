package static_code_blocks;
/* 静态代码块
 * static{
 * 
 * }
 * 随着类的加载而加载，比对象先存在，类一加载就执行静态代码块。
 * 构造代码块
 * {
 * 
 * }
 * 创建对象时执行，优先级高于构造方法。
  */
class Code{
	//构造方法
	Code(){
		System.out.println("code str method");
	}
	//静态代码块
	static{
		System.out.println("static code blocks");
	}
	//构造代码块	
	{
		System.out.println("str code blocks");
	}
}
public class BlocksDemo {
	public static void main(String[] args){
		new Code();
	}
}
