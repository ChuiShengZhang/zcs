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
public class ReplaceAllDemo {
	public static void main(String[] args) {
		replaceAll_1();
		replaceAll_2();
		replaceAll_3();
	}
	
	//���ַ����г���5�����ϵ������滻��#
	public static void replaceAll_1(){
		String str = "jsbjj1211656sajsah546633sajsa";
		str = str.replaceAll("\\d{5,}", "#");
		System.out.println(str);
	}
	//���ַ����г��ֵĵ����滻��&
	public static void replaceAll_2(){
		String str = "sbjdddddddkjsjdjsdsssdkkmkjikkskndklll";
		str = str.replaceAll("(.)\\1+","&");
		System.out.println(str);
	}
	//���ַ����еĵ����滻�ɵ���(ssssss�滻��s)
	public static void replaceAll_3(){
		String str = "sdhajhssssssskdnajsjjjjjjskalaaaaaaakjnk";
		str = str.replaceAll("(.)\\1+", "$1");//���滻��$n��ʾ��ȡǰ�����ĵ�n����
		System.out.println(str);
	}
}
