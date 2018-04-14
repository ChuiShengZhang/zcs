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
 * ����ʵ���� 
 */  
class Computer{  
  
    private boolean existComputer = false;//�Ƿ���ڵ���  
    private int currentNumber;  
      
    /** 
     * �������ԣ���Ϊ����̻߳�ִ������������������Ҫͬ�� 
     */  
    public synchronized void produce(){  
        //������ڵ��ԣ���ô�ͻ�ȴ������߰���  
        while(existComputer){  
            try {  
                this.wait();  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
        //��ʼ����  
        System.out.println("������ " + Thread.currentThread().getName() + "  ������һ̨���Ϊ��"+ ++currentNumber + " �ĵ���");  
        //�޸ı�־λ  
        this.existComputer = true;  
        this.notifyAll();//���������߳�  
    }  
      
    /** 
     * ���˵��� 
     */  
    public synchronized void consume(){  
        while(!existComputer){  
            try {  
                this.wait();  
            } catch (InterruptedException e) {  
                e.printStackTrace();  
            }  
        }  
        System.out.println("������ "+ Thread.currentThread().getName() + " �����˱��Ϊ��" + currentNumber + " �ĵ���");  
        //�޸ı�־λ  
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
