package com.zcs.reflect.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/*
 *		��������
 *����һ����  ���������
 *���ڿ�������µģ����Զ���һ���ӿ�PCI��������ṩ����
 *ֻҪ����PCI�ӿڵĶ����ڵ���������
 */
public class ReflectTest {
	public static void main(String[] args) throws Exception {
		MainBoard mb = new MainBoard();
		mb.run();
//		mb.run(new NetCard());//�����������չ�Բ��ߣ�ÿ�γ����µ��豸�����޸Ĵ���
		//�����÷������������
		//�������ļ���װ�ɶ���
		File configFile = new File("D:\\Java����\\Eclipse\\Reflect\\src\\com\\zcs\\reflect\\test\\pci.properties");
		if(!(configFile.exists())){
			configFile.createNewFile();
		}
		//���������ļ�����
		Properties pro = new Properties();
		//������ȡ�����ļ���������
		FileInputStream in = new FileInputStream(configFile);
		//�������ļ��ļ�ֵ�Լ��ص���������
		pro.load(in);
		//��ȡ���������
		for(int i = 0; i<pro.size() ; i++){
			String className = pro.getProperty("pci"+(i+1));
			Class clazz = Class.forName(className);
			//����ʵ��
			PCI pci = (PCI)clazz.newInstance();
			
			mb.run(pci);
		}
		in.close();
	}
}
