import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date����
 * 
 * 
 * 
 * */
public class DateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);//��ӡ��ʱ�俴����
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��E hh:mm:ss");
		String s=sdf.format(d);
		System.out.println(s);
		
	}

}
