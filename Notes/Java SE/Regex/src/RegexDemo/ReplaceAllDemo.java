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
public class ReplaceAllDemo {
	public static void main(String[] args) {
		replaceAll_1();
		replaceAll_2();
		replaceAll_3();
	}
	
	//将字符串中出现5次以上的数组替换成#
	public static void replaceAll_1(){
		String str = "jsbjj1211656sajsah546633sajsa";
		str = str.replaceAll("\\d{5,}", "#");
		System.out.println(str);
	}
	//将字符串中出现的叠词替换成&
	public static void replaceAll_2(){
		String str = "sbjdddddddkjsjdjsdsssdkkmkjikkskndklll";
		str = str.replaceAll("(.)\\1+","&");
		System.out.println(str);
	}
	//将字符串中的叠词替换成单个(ssssss替换成s)
	public static void replaceAll_3(){
		String str = "sdhajhssssssskdnajsjjjjjjskalaaaaaaakjnk";
		str = str.replaceAll("(.)\\1+", "$1");//在替换中$n表示获取前面规则的第n组结果
		System.out.println(str);
	}
}
