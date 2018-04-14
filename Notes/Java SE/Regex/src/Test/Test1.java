package Test;
/*
 * 将下面这句话变成：我要学编程
 */
public class Test1 {
	public static void main(String[] args) {
		String str = "我我...我我...我要..要要...要要...学学学....学学...编编编...编程..程.程程...程...程";
		str = str.replaceAll("\\.+","");
		
		str = str.replaceAll("(.)\\1+", "$1");
		
		System.out.println(str);
	}
}
