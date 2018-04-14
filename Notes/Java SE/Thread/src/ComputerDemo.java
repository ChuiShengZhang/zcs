/*class Computer{
	String name;
	int pcNo;
	Computer(String name){
		this.name=name;
	}
}
class Threads implements Runnable{
	public void run(){
		
	}
}
class ProducePC{
	int pcNo=0;
	public int produce(Computer c){
		pcNo++;
		return pcNo;
	}
}
class CarryPC{
	public void carry(){
		
	}
}
public class ComputerDemo {
	public static void main(String[] args){
		ProducePC ppc=new ProducePC();
		Computer c=new Computer("c1");
		ppc.produce(c);
	}
}*/


public class ComputerDemo {  
      
    public static void main(String[] args) {  
        Computer computer = new Computer();  
        Producer producer = new Producer(computer);  
        Consumer consumer = new Consumer(computer);  
        new Thread(producer).start();  
        new Thread(producer).start();  
        new Thread(consumer).start();  
        new Thread(producer).start();  
        new Thread(consumer).start();  
        new Thread(consumer).start();  
    }  
  
}  
  
/** 
 * 电脑实体类 
 */  
class Computer{  
  
    private boolean existComputer = false;//是否存在电脑  
    private int currentNumber;  
      
    /** 
     * 生产电脑，因为多个线程会执行生产方法，所以需要同步 
     */  
    public synchronized void produce(){  
        //如果存在电脑，那么就会等待搬运者搬运  
        while(existComputer){  
            try {  
                this.wait();  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
        //开始生产  
        System.out.println("生产者 " + Thread.currentThread().getName() + "  生产了一台编号为："+ ++currentNumber + " 的电脑");  
        //修改标志位  
        this.existComputer = true;  
        this.notifyAll();//唤醒所有线程  
    }  
      
    /** 
     * 搬运电脑 
     */  
    public synchronized void consume(){  
        while(!existComputer){  
            try {  
                this.wait();  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
        System.out.println("消费者 "+ Thread.currentThread().getName() + " 消费了编号为：" + currentNumber + " 的电脑");  
        //修改标志位  
        existComputer = false;  
        this.notifyAll();  
    }  
}  
  
class Producer implements Runnable{  
    private Computer computer;  
    public Producer(Computer computer){  
        this.computer = computer;  
    }  
    @Override  
    public void run() {  
        while(true){  
            computer.produce();  
        }  
    }  
}  
  
class Consumer implements Runnable{  
    private Computer computer;  
    public Consumer(Computer computer){  
        this.computer = computer;  
    }  
    @Override  
    public void run() {  
        while(true){  
            computer.consume();  
        }  
    }  
}  
