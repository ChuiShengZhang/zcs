package list.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 需求:1.创建一个list,在list中添加一些工人。
 * 			张三		21		5000
 * 			李四		22		5600
 * 			王五		25		8000
 * 			刘六		26		8600
 * 		2.在李四前面加入一个工人 张八		28		9000
 * 		3.删除王五的信息。
 * 		4.打印所有工人的信息。
 * 		5.重写equals,当姓名,年龄,工资全部相同时返回true。
 * 		6.消除重复功能。
 * 
 * 
 * 
 * */

class WorkerInfo{
	private ArrayList<Worker> al;
	WorkerInfo(){
		al=new ArrayList<Worker>();
	}
	//添加方法封装
	public void addWorker(Worker w){
		al.add(w);
	}
	public void addWorker(int index,Worker w){
		al.add(index,w);
	}
	//删除方法封装
	public void delWorker(Object obj){
		al.remove(obj);
	}
	public void delWorker(int index){
		al.remove(index);
	}
	
	//打印信息
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
	//去除重复
	public ArrayList<Worker> unique(){
		//创建一个临时集合
		ArrayList<Worker> newList=new ArrayList<Worker>();
		for(Iterator<Worker> it=al.iterator();it.hasNext();){
			Worker w=(Worker) it.next();
			if(!(newList.contains(w))){//判断临时集合是否包含该元素，若不包含，则将其添加到临时集合
				newList.add(w);
			}
		}
		return newList;
	}
}
//工人类
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
	//重写equals
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
		wi.addWorker(new Worker("张三","21","5000"));
		wi.addWorker(new Worker("李四","22","5600"));
		wi.addWorker(new Worker("王五","25","8000"));
		wi.addWorker(new Worker("刘六","26","8600"));
		wi.addWorker(new Worker("刘六","26","8600"));
		
		wi.addWorker(1, new Worker("张八","28","9000"));
		//删除王五
		wi.delWorker(3);
		//打印所有工人的信息。
		System.out.println("原集合");
		wi.showAllInfo();
		System.out.println("新集合");
		//消除重复
		ArrayList<Worker> al1=wi.unique();
		wi.showAllInfo(al1);
	}

}
