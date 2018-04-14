package RegexDemo;

/*
 * 	regex：正则表达式 ,是一种规则，专门用于操作字符串
 */

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

//匹配
public class MatchesDemo {
	public static void main(String[] args) {
		checkQQ();
		checkTel();
	}
	
	//用正则表达式校验QQ
	//要求QQ不能以数字0开头，位数在5-15位之间，必须为纯数字
	public static void checkQQ(){
		String QQ = "1614187761";
		String regex = "[1-9]\\d{4,14}";
		boolean flag = QQ.matches(regex);
		System.out.println(QQ+"  is	"+flag);
	}
	
	//用正则表达式校验手机号码
	//要求号段为13或15或18 位数为11位，必须为纯数字
	public static void checkTel(){
		String tel = "13627973149";
		String regex = "1[358]\\d{9}";
		boolean flag = tel.matches(regex);
		System.out.println(tel+"  is  "+flag);
	}
}
