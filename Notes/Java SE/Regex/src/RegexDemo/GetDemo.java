package RegexDemo;
/*
 * 	regex��������ʽ ,��һ�ֹ���ר�����ڲ����ַ���
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class GetDemo {
	public static void main(String[] args) {
		String str = "ming tian jiu yao fang jia le��";
		
		//��������ʽ��װ��Pattern����
		Pattern p = Pattern.compile("\\b[a-z]{4}\\b");  //  \b��������ʽ�б�ʾ���ʱ߽�
		
		//��ȡ����
		Matcher m = p.matcher(str);
		
		//find�����������ҷ��Ϲ�����Ӵ�
		while(m.find()){
			System.out.println(m.group());//group����������ȡfind�����ҵ����Ӵ�
		}
	}
}
