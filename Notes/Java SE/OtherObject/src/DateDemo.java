import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date对象
 * 
 * 
 * 
 * */
public class DateDemo {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);//打印的时间看不懂
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日E hh:mm:ss");
		String s=sdf.format(d);
		System.out.println(s);
		
	}

}
