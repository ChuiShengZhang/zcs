package com.zcs.reflect.test;

public class MainBoard {
	public void run(){
		System.out.println("MainBoard run");
	}
	public void run(PCI p){
		if(p!=null){
			p.open();
			p.close();
		}
	}
}
