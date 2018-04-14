//创建线程的第一种方法（继承Thread）

class ThreadOne extends Thread{
	ThreadOne(String name){
		super(name);
	}
	public void run(){//run方法用于存储多线程要运行的代码
		for(int i=0;i<20;i++){
			System.out.println(currentThread().getName()+"ThreadOne run*****"+i);
		}
	}
}
//创建线程的第二种方法（实现Runnable接口）
	
class ThreadTwo implements Runnable{
	private int i=20;
	Object obj=new Object();
	public void run(){
		synchronized (obj) {
			while(i>0){
				if(i>0){
					System.out.println(Thread.currentThread().getName()+"ThreadTwo*****"+i);
					i--;
				}
			}
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args){
		//线程1,2（继承）
		ThreadOne to1=new ThreadOne("线程1");
		ThreadOne to2=new ThreadOne("线程2");
		to1.start();
		to2.start();
		
		//线程3,4,5(实现）
		ThreadTwo tt=new ThreadTwo();//tt不是线程
		Thread t1=new Thread(tt,"线程3");
		Thread t2=new Thread(tt,"线程4");
		Thread t3=new Thread(tt,"线程5");
		t1.start();
		t2.start();
		t3.start();
		//主线程
		for(int i=0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+"main*****"+i);
		}
	}
}
