package design_patterns;
/*设计模式：解决某一问题最行之有效的方法。
 * Java中有23种设计模式。
 */


/*    单例设计模式：解决一个类在内存中只存在一个对象。
 *    想要让对象唯一
 *    1.为了避免其他程序过多的创建该类的对象，先禁止其他程序创建该类对象。
 *    2.为了能让其他程序访问该对象，只好在本类中创建一个对象。
 *    为了方便其他程序对自定义对象的访问，可以对外提供一些方法。
 */
/*   *****************饿汉式******************/
class HungrySingle{
	private HungrySingle(){
		System.out.println("恶汉式设计模式");
	}
	static HungrySingle hungrysingal=new HungrySingle();
	public static HungrySingle getInstance(){
		return hungrysingal;
	}
}
/*  ******************懒汉式******************/
class LazySingle{
	private LazySingle(){
		System.out.println("懒汉式设计模式");
	}
	static LazySingle lazysingle=null;
	public static LazySingle getInstance(){
		if(lazysingle==null){
			lazysingle=new LazySingle();
		}
		return lazysingle;
	}
}
public class SingleDemo {
	public static void main(String[] args){
		//   饿汉式
		//HungrySingle hungrysingle=new HungrySingle();  无法创建对象
		HungrySingle hungrysingle=HungrySingle.getInstance();//类名调用getInstance方法获取对象，保证了对象的唯一
		
		//懒汉式
		//LazySingle lazysingle=new LazySingle();  无法创建对象
		LazySingle lazysingle=LazySingle.getInstance();//类名调用getInstance方法获取对象，保证了对象的唯一
	}
}
