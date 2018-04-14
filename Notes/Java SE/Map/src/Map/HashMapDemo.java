package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * 		Map����������ȡ������
 * 			keySet()  �����м��浽һ��Set�����У�������,��ͨ��set�ĵ���������Map��get����ȡ��ÿ������Ӧ��ֵ
 * 						ԭ����Map����ת����Set���ϣ����õ�����ȡ��
 * 
 * 			entrySet()  ��Map�����е�ӳ���ϵȡ�����浽Set������ȥ
 * 						Map.Entry  ��Mapӳ���ϵ����
 * 						Map.Entry ��һ���ڲ��ӿ�
 * 						��ӳ���ϵȡ������ͨ��getKey��getValue������ȡ����ֵ
 * 
 * 
 * 
 * */

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		//���Ԫ��      put������������Ϊ�Ľ���Ӧ��ԭ����ֵ,�������ͬ�ļ�ֵ������ӵ�ֵ�Ḳ��ԭ�ȵ�ֵ��������ԭ�ȵ�ֵ
		System.out.println(map.put("01", "zhangsan"));//����null
		System.out.println(map.put("01", "java"));//֮ǰ����ͬ�ļ�����ʱjava���滻ԭ�ȵ�zhangsan��������ԭ�ȵ�ֵ��zhangsan
		map.put("02", "lisi");
		map.put("03", "wangwu");
		//�ɴ���null����nullֵ
		map.put(null, "1");
		map.put("04", null);
		
		//ɾ��Ԫ��	removeɾ�������ظ�ֵ
		System.out.println("remove...."+map.remove("02"));
		
		System.out.println(map);
		
		//��ȡԪ��	get����
		System.out.println("get...."+map.get("01"));
		System.out.println("*************************");
		
		
		//��һ��ȡ������  keySet
		System.out.println("��һ��ȡ������  keySet");
		Set<String> keySet=map.keySet();//��ȡ���ļ�����keySet������
		//����keySet�ĵ����������������ϵ���get����ȡ��map�ж�Ӧ��ֵ
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println(map.get(key));
		}
		System.out.println("***********************");
		
		
		//�ڶ���ȡ������	entrySet
		System.out.println("�ڶ���ȡ������	entrySet");
		Set<Map.Entry<String, String>> entrySet=map.entrySet();//��ȡ����ӳ���ϵ����entrySet������
		//����keySet�ĵ�����
		Iterator<Map.Entry<String,String>> it2=entrySet.iterator();
		while(it2.hasNext()){
			Map.Entry<String, String> me=it2.next();
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":"+value);
			}
	}

}
