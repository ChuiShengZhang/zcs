//�����̵߳ĵ�һ�ַ������̳�Thread��

class ThreadOne extends Thread{
	ThreadOne(String name){
		super(name);
	}
	public void run(){//run�������ڴ洢���߳�Ҫ���еĴ���
		for(int i=0;i<20;i++){
			System.out.println(currentThread().getName()+"ThreadOne run*****"+i);
		}
	}
}
//�����̵߳ĵڶ��ַ�����ʵ��Runnable�ӿڣ�
	
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
		//�߳�1,2���̳У�
		ThreadOne to1=new ThreadOne("�߳�1");
		ThreadOne to2=new ThreadOne("�߳�2");
		to1.start();
		to2.start();
		
		//�߳�3,4,5(ʵ�֣�
		ThreadTwo tt=new ThreadTwo();//tt�����߳�
		Thread t1=new Thread(tt,"�߳�3");
		Thread t2=new Thread(tt,"�߳�4");
		Thread t3=new Thread(tt,"�߳�5");
		t1.start();
		t2.start();
		t3.start();
		//���߳�
		for(int i=0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+"main*****"+i);
		}
	}
}
