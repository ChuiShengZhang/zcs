package list.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * ����:1.����һ��list,��list�����һЩ���ˡ�
 * 			����		21		5000
 * 			����		22		5600
 * 			����		25		8000
 * 			����		26		8600
 * 		2.������ǰ�����һ������ �Ű�		28		9000
 * 		3.ɾ���������Ϣ��
 * 		4.��ӡ���й��˵���Ϣ��
 * 		5.��дequals,������,����,����ȫ����ͬʱ����true��
 * 		6.�����ظ����ܡ�
 * 
 * 
 * 
 * */

class WorkerInfo{
	private ArrayList<Worker> al;
	WorkerInfo(){
		al=new ArrayList<Worker>();
	}
	//��ӷ�����װ
	public void addWorker(Worker w){
		al.add(w);
	}
	public void addWorker(int index,Worker w){
		al.add(index,w);
	}
	//ɾ��������װ
	public void delWorker(Object obj){
		al.remove(obj);
	}
	public void delWorker(int index){
		al.remove(index);
	}
	
	//��ӡ��Ϣ
	public void showAllInfo(){
		Iterator<Worker> it=al.iterator();
		while(it.hasNext())
		{Worker w=(Worker) it.next();
			System.out.println(w.getName()+'\t'+w.getAge()+'\t'+w.getSalary());
		}
	}
	public void showAllInfo(ArrayList<Worker> al){
		Iterator<Worker> it=al.iterator();
		while(it.hasNext())
		{Worker w=(Worker) it.next();
			System.out.println(w.getName()+'\t'+w.getAge()+'\t'+w.getSalary());
		}
	}
	//ȥ���ظ�
	public ArrayList<Worker> unique(){
		//����һ����ʱ����
		ArrayList<Worker> newList=new ArrayList<Worker>();
		for(Iterator<Worker> it=al.iterator();it.hasNext();){
			Worker w=(Worker) it.next();
			if(!(newList.contains(w))){//�ж���ʱ�����Ƿ������Ԫ�أ�����������������ӵ���ʱ����
				newList.add(w);
			}
		}
		return newList;
	}
}
//������
class Worker{
	private String name;
	private String age;
	private String salary;
	Worker(String name,String age,String salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public String getName(){
		return name;
	}
	public String getAge(){
		return age;
	}
	public String getSalary(){
		return salary;
	}
	//��дequals
	public boolean equals(Object obj){
		if(!(obj instanceof Worker)){
			return false;
		}else if(this.getName()==((Worker) obj).getName() && this.getAge()==((Worker) obj).getAge() && this.getSalary()==((Worker) obj).getSalary()){
			return true;
		}else{
			return false;
			}
	}
}

public class WorkerTest {
	public static void main(String[] args) {
		WorkerInfo wi=new WorkerInfo();
		wi.addWorker(new Worker("����","21","5000"));
		wi.addWorker(new Worker("����","22","5600"));
		wi.addWorker(new Worker("����","25","8000"));
		wi.addWorker(new Worker("����","26","8600"));
		wi.addWorker(new Worker("����","26","8600"));
		
		wi.addWorker(1, new Worker("�Ű�","28","9000"));
		//ɾ������
		wi.delWorker(3);
		//��ӡ���й��˵���Ϣ��
		System.out.println("ԭ����");
		wi.showAllInfo();
		System.out.println("�¼���");
		//�����ظ�
		ArrayList<Worker> al1=wi.unique();
		wi.showAllInfo(al1);
	}

}
