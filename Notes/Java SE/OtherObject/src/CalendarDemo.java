import java.util.Calendar;
//import java.util.GregorianCalendar;

/*
 * Date类中过时方法被Calendar替代
 * 
 * 
 * */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		//可以通过Calendar的getInstance()方法获取实例
		//也能通过创建Calendar的具体子类创建实例
		//GregorianCalendar gc=new GregorianCalendar();
		
		//获取年月日(获取的月是重0-11)
		//查表法
		String[] mons={"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
		String[] weeks={"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		int month=c.get(Calendar.MONTH);
		int week=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(c.get(Calendar.YEAR)+"年");
		System.out.println(mons[month]);
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"日");
		System.out.println(weeks[week]);
		
		System.out.println("***********************");
		//设置时间
		c.set(2019,7,1);
		//时间往前移或往后推
		c.add(Calendar.YEAR,2);//年加两年
		c.add(Calendar.MONTH,-3);//月减去三月
		System.out.println(c.get(Calendar.YEAR)+"年");
		System.out.println((c.get(Calendar.MONTH)+1)+"月");
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"日");
		System.out.println(weeks[week]);
		
	}

}
