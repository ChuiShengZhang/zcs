package Map;
/*
 * Map集合：该集合存储键值对 ，一对一对往里存，键值要保证唯一。
 * 
 * 1.添加
 * 		put(K key,V value)
 * 2.删除
 * 		clear()  删除全部
 * 		remove(Object key)
 * 3.判断
 * 		containKey(Object key)
 * 		containValue(Object value)
 * 4.获取
 * 		get(Object key)
 * 		size()
 * 		entrySet()
 * 		keySet()
 * 
 * Map<K,V>
 * 		|--HashTable  底层是哈希表数据结构，不允许null键null值，线程同步。效率低
 * 		|--HashMap	  底层是哈希表数据结构，允许null键null值，线程不同步。效率高
 * 		|--TreeMap	底层是二叉树数据结构，线程不同步，可以对键排序。
 * 
 *    Set集合底层就是使用了Map集合
 * */


public class MapDemo {
	
}
