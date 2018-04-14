package StringTest;

public class StrText {
	public static void main(String[] args){
		String Str1=new String();//创建字符串Str1对象
		Str1="to be or not to be";//为字符串Str1赋值
		String StrArray[]=Str1.split(" ");//调用split方法将Str1分离并存到StrArray数组中
		StringBuffer Str2=new StringBuffer();
		StringBuffer Str4=new StringBuffer();
		for(int i=0;i<6;i++){
		String Str3=new StringBuffer(StrArray[i]).reverse().toString();/*将StrArray数组中的元素用reverse
		方法反转并转换成字符串赋值给Str3*/
		Str4=new StringBuffer(Str2.append(Str3));//调用append方法依次将Str3链接起来并赋值给Str4
		}
		System.out.print(Str4);
	}

}
