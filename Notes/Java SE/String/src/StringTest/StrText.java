package StringTest;

public class StrText {
	public static void main(String[] args){
		String Str1=new String();//�����ַ���Str1����
		Str1="to be or not to be";//Ϊ�ַ���Str1��ֵ
		String StrArray[]=Str1.split(" ");//����split������Str1���벢�浽StrArray������
		StringBuffer Str2=new StringBuffer();
		StringBuffer Str4=new StringBuffer();
		for(int i=0;i<6;i++){
		String Str3=new StringBuffer(StrArray[i]).reverse().toString();/*��StrArray�����е�Ԫ����reverse
		������ת��ת�����ַ�����ֵ��Str3*/
		Str4=new StringBuffer(Str2.append(Str3));//����append�������ν�Str3������������ֵ��Str4
		}
		System.out.print(Str4);
	}

}
