package RegexDemo;

/*
 * 	regex��������ʽ ,��һ�ֹ���ר�����ڲ����ַ���
 */

/*
 * ƥ��: String���е�boolean matches(regex)����
 * �ָ�: String���е�String[] split(regex)����
 * �滻: String���е�String replaceAll(str,regex,str)����
 * ��ȡ: ���ַ����з��Ϲ�����Ӵ�ȡ��
 * 		�������裺1.�������װ��Pattern����
 * 				 2.���ַ�����Pattern���������
 * 				 3.��ȡ����ƥ������
 * 				 4.ͨ������Է��Ϲ�����Ӵ����в���������ȡ��
 */

//ƥ��
public class MatchesDemo {
	public static void main(String[] args) {
		checkQQ();
		checkTel();
	}
	
	//��������ʽУ��QQ
	//Ҫ��QQ����������0��ͷ��λ����5-15λ֮�䣬����Ϊ������
	public static void checkQQ(){
		String QQ = "1614187761";
		String regex = "[1-9]\\d{4,14}";
		boolean flag = QQ.matches(regex);
		System.out.println(QQ+"  is	"+flag);
	}
	
	//��������ʽУ���ֻ�����
	//Ҫ��Ŷ�Ϊ13��15��18 λ��Ϊ11λ������Ϊ������
	public static void checkTel(){
		String tel = "13627973149";
		String regex = "1[358]\\d{9}";
		boolean flag = tel.matches(regex);
		System.out.println(tel+"  is  "+flag);
	}
}
