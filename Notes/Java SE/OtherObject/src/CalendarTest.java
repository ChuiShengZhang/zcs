import java.util.Calendar;

/*
 * ��ϰһ:��ȡ������Ķ����ж�����
 * ��ϰ��:��ȡ������������ʱ��
 * 
 * */
public class CalendarTest {
	public static void test1(int year){
		Calendar c=Calendar.getInstance();
		c.set(year,2,1);//����ʱ��Ϊָ����ݵ�3��1��
		c.add(Calendar.DAY_OF_MONTH,-1);//����һ��������һ����Ƕ��µ�����
		int days=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"��Ķ�����"+days+"��");
	}
	public static void test2(){
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH,-1);
		int hour=c.get(Calendar.HOUR_OF_DAY);
		int minute=c.get(Calendar.MINUTE);
		int sec=c.get(Calendar.SECOND);
		System.out.println(c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DAY_OF_MONTH)+"��"+"  "+hour+":"+minute+":"+sec);
	}
	public static void main(String[] args) {
		test1(2017);
		test2();
	}

}
