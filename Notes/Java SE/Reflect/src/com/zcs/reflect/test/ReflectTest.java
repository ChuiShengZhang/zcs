package com.zcs.reflect.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/*
 *		电脑运行
 *电脑一运行  主板就运行
 *后期可能添加新的，所以定义一个接口PCI，给外界提供规则
 *只要符合PCI接口的都能在电脑上运行
 */
public class ReflectTest {
	public static void main(String[] args) throws Exception {
		MainBoard mb = new MainBoard();
		mb.run();
//		mb.run(new NetCard());//这样程序的扩展性不高，每次出现新的设备都得修改代码
		//所以用反射解决这个问题
		//将配置文件封装成对象
		File configFile = new File("D:\\Java程序\\Eclipse\\Reflect\\src\\com\\zcs\\reflect\\test\\pci.properties");
		if(!(configFile.exists())){
			configFile.createNewFile();
		}
		//创建配置文件对象
		Properties pro = new Properties();
		//创建读取配置文件的流对象
		FileInputStream in = new FileInputStream(configFile);
		//将配置文件的键值对加载到流对象里
		pro.load(in);
		//读取流里的数据
		for(int i = 0; i<pro.size() ; i++){
			String className = pro.getProperty("pci"+(i+1));
			Class clazz = Class.forName(className);
			//创建实例
			PCI pci = (PCI)clazz.newInstance();
			
			mb.run(pci);
		}
		in.close();
	}
}
