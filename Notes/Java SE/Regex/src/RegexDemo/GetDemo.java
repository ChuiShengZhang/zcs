package RegexDemo;
/*
 * 	regex：正则表达式 ,是一种规则，专门用于操作字符串
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 匹配: String类中的boolean matches(regex)方法
 * 分割: String类中的String[] split(regex)方法
 * 替换: String类中的String replaceAll(str,regex,str)方法
 * 获取: 将字符串中符合规则的子串取出
 * 		操作步骤：1.将规则封装成Pattern对象
 * 				 2.将字符串与Pattern对象相关联
 * 				 3.获取正则匹配引擎
 * 				 4.通过引擎对符合规则的子串进行操作，比如取出
 */
public class GetDemo {
	public static void main(String[] args) {
		String str = "ming tian jiu yao fang jia le。";
		
		//将正则表达式封装成Pattern对象
		Pattern p = Pattern.compile("\\b[a-z]{4}\\b");  //  \b在正则表达式中表示单词边界
		
		//获取引擎
		Matcher m = p.matcher(str);
		
		//find方法用来查找符合规则的子串
		while(m.find()){
			System.out.println(m.group());//group方法用来获取find方法找到的子串
		}
	}
}
