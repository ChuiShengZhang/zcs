package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/*
 * 		Map集合有两种取出方法
 * 			keySet()  将所有键存到一个Set集合中，并返回,在通过set的迭代器遍历Map的get方法取出每个键对应的值
 * 						原理：将Map集合转换成Set集合，再用迭代器取出
 * 
 * 			entrySet()  将Map集合中的映射关系取出，存到Set集合中去
 * 						Map.Entry  是Map映射关系类型
 * 						Map.Entry 是一个内部接口
 * 						将映射关系取出后再通过getKey和getValue方法获取键和值
 * 
 * 
 * 
 * */

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		
		//添加元素      put方法返回类型为改建对应的原来的值,当添加相同的键值，后添加的值会覆盖原先的值，并返回原先的值
		System.out.println(map.put("01", "zhangsan"));//返回null
		System.out.println(map.put("01", "java"));//之前有相同的键，此时java会替换原先的zhangsan，并返回原先的值：zhangsan
		map.put("02", "lisi");
		map.put("03", "wangwu");
		//可存入null键或null值
		map.put(null, "1");
		map.put("04", null);
		
		//删除元素	remove删除并返回该值
		System.out.println("remove...."+map.remove("02"));
		
		System.out.println(map);
		
		//获取元素	get返回
		System.out.println("get...."+map.get("01"));
		System.out.println("*************************");
		
		
		//第一种取出方法  keySet
		System.out.println("第一种取出方法  keySet");
		Set<String> keySet=map.keySet();//将取出的键存入keySet集合中
		//创建keySet的迭代器，遍历键集合调用get方法取出map中对应的值
		Iterator<String> it=keySet.iterator();
		while(it.hasNext()){
			String key=it.next();
			System.out.println(map.get(key));
		}
		System.out.println("***********************");
		
		
		//第二种取出方法	entrySet
		System.out.println("第二种取出方法	entrySet");
		Set<Map.Entry<String, String>> entrySet=map.entrySet();//将取出的映射关系存入entrySet集合中
		//创建keySet的迭代器
		Iterator<Map.Entry<String,String>> it2=entrySet.iterator();
		while(it2.hasNext()){
			Map.Entry<String, String> me=it2.next();
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":"+value);
			}
	}

}
