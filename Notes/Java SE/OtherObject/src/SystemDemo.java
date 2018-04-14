import java.util.Properties;
//System对象

public class SystemDemo {
	public static void main(String[] args){
		//获取特定的属性
		
		System.out.println("****my os name****"+System.getProperty("os.name"));
		//设置自定义的属性
		System.setProperty("myKey","myValue");
		
		Properties pro=System.getProperties();//获取系统属性
		//因为Properties是HashTable的子类
		//所以用Map集合的取出方式取出
		for(Object obj:pro.keySet()){
			String value=(String)pro.get(obj);
			System.out.println(obj+":"+value);
			
		
		}
	}
}
