package MapTest;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
 * 统计字符串中每个字母的出现次数
 * 
 * 
 * */
public class MapTest {
	public static void main(String[] args){
		String s=charCount("abacdeaaabgfhhfd");
		System.out.println(s);
	}
	public static String charCount(String str){
		char[] chars=str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		int i=0;
		int count=1;
		while(i<chars.length){
			if(tm.get(chars[i])==null){
				tm.put(chars[i],count);
			}else{
				tm.put(chars[i],tm.get(chars[i])+1);
			}
			i++;
		}
		StringBuilder sb=new StringBuilder();
		Set<Character> keySet=tm.keySet();
		Iterator<Character> it=keySet.iterator();
		while(it.hasNext()){
			System.out.println("");
			Character key=it.next();
			Integer value=tm.get(key);
			
			sb=sb.append(key+"("+value+")");
		}	
		return sb.toString();
	}
}
