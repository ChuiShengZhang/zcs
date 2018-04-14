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
public class SplitDemo {
	public static void main(String[] args) {
		split_1();
		split_2();
		split_3();
	}
	
	//用正则表达式分割字符串
	public static void split_1(){//简单切割
		//用,切割
		String str = "zhangsan,lisi,wangwu";
		String[] strs = str.split(",");
		for(String str1 : strs){
			System.out.println(str1);
		}
	}
	public static void split_2(){//特殊切割
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
	//以重叠词为分割符
	public static void split_3(){
		String str = "hsaasdfsrrresadjkuusnnnnnklllsdan";
		String regex = "(.)\\1+";//按照叠词切割，为了可以让规则的结果得到复用
								//将要复用的结果封装成组,用(结果)表示
								//组的出现都有编号，从1开始，使用已有的组用\组号
		String[] strs = str.split(regex);
		for(String s : strs){
			System.out.println(s);
		}
	}
}
