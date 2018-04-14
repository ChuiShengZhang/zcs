import java.util.Calendar;

/*
 * 练习一:获取任意年的二月有多少天
 * 练习二:获取昨天的现在这个时刻
 * 
 * */
public class CalendarTest {
	public static void test1(int year){
		Calendar c=Calendar.getInstance();
		c.set(year,2,1);//设置时间为指定年份的3月1日
		c.add(Calendar.DAY_OF_MONTH,-1);//三月一日往回推一天就是二月的天数
		int days=c.get(Calendar.DAY_OF_MONTH);
		System.out.println(year+"年的二月有"+days+"天");
	}
	public static void test2(){
		Calendar c=Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH,-1);
		int hour=c.get(Calendar.HOUR_OF_DAY);
		int minute=c.get(Calendar.MINUTE);
		int sec=c.get(Calendar.SECOND);
		System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日"+"  "+hour+":"+minute+":"+sec);
	}
	public static void main(String[] args) {
		test1(2017);
		test2();
	}

}
