import java.io.IOException;

/*
 * Runtime对象
 * 没有构造函数，使用了单例设计模式，通过getRuntime获取Runtime对象
 * exec()调用系统应用程序 返回进程对象Process
 * 
 * */
public class RuntimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("D:\\KGMusic\\KuGou.exe");//调用exec调用系统的exec应用程序，改方法抛出了异常
		
		Thread.sleep(4000);
		p.destroy();//杀死子进程
		
		r.exec("D:\\QQ影音\\QQPlayer\\QQPlayer.exe D:\\电影\\sdyjq519.mp4");//用前面指定的应用程序打开后面的文件，类型要一致
	}

}
