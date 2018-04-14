import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress ip = InetAddress.getLocalHost();
		System.out.println(ip.toString());
		
		//单独获取主机名和IP地址
		
		
		InetAddress ia = InetAddress.getByName("ykhwsz.cn");
		System.out.println(ia.getHostName()+"      "+ia.getHostAddress());
		
		InetAddress ia2[] = InetAddress.getAllByName("ykhwsz.cn");
		for(InetAddress i : ia2){
			System.out.println(i.getHostAddress()+"\\"+i.getHostName());
		}
	}
}
