package Test;
/*
 * ��������仰��ɣ���Ҫѧ���
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "����...����...��Ҫ..ҪҪ...ҪҪ...ѧѧѧ....ѧѧ...����...���..��.�̳�...��...��";
		str = str.replaceAll("\\.+","");
		
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
	}
}
