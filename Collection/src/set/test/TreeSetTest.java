package set.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/*
 * ����:�����ַ����ĳ�������
 * 			�ַ�������߱���Ȼ����,��������������Ҫ��,�����ñȽ���Comparator
 * 
 * */
class StringLengthComparator implements Comparator<String>{
	public int compare(String s1,String s2){
		int num=new Integer(s1.length()).compareTo(new Integer(s2.length()));
		if(num==0){
			return s1.compareTo(s2);
		}
		return num;
	}
}
public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new StringLengthComparator());
		
		ts.add("acasn");
		ts.add("hsadjhd");
		ts.add("sjdj");
		ts.add("s");
		
		Iterator<String> it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
