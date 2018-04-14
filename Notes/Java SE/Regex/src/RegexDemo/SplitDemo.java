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
public class SplitDemo {
	public static void main(String[] args) {
		split_1();
		split_2();
		split_3();
	}
	
	//��������ʽ�ָ��ַ���
	public static void split_1(){//���и�
		//��,�и�
		String str = "zhangsan,lisi,wangwu";
		String[] strs = str.split(",");
		for(String str1 : strs){
			System.out.println(str1);
		}
	}
	public static void split_2(){//�����и�
		String str = "c:\\java\\regex\\split";
		String regex = "\\\\";
		String[] strs = str.split(regex);
		for(String str1 : strs){
			System.out.println(str1);
		}
		String str2 = "zhangsan.lisi.wangwu";
		String[] strs2 = str2.split("\\.");
		for(String s : strs2){
			System.out.println(s);
		}
	}
	//���ص���Ϊ�ָ��
	public static void split_3(){
		String str = "hsaasdfsrrresadjkuusnnnnnklllsdan";
		String regex = "(.)\\1+";//���յ����иΪ�˿����ù���Ľ���õ�����
								//��Ҫ���õĽ����װ����,��(���)��ʾ
								//��ĳ��ֶ��б�ţ���1��ʼ��ʹ�����е�����\���
		String[] strs = str.split(regex);
		for(String s : strs){
			System.out.println(s);
		}
	}
}
