import java.util.Calendar;
//import java.util.GregorianCalendar;

/*
 * Date���й�ʱ������Calendar���
 * 
 * 
 * */
public class CalendarDemo {

	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		//����ͨ��Calendar��getInstance()������ȡʵ��
		//Ҳ��ͨ������Calendar�ľ������ഴ��ʵ��
		//GregorianCalendar gc=new GregorianCalendar();
		
		//��ȡ������(��ȡ��������0-11)
		//���
		String[] mons={"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		String[] weeks={"������","����һ","���ڶ�","������","������","������","������"};
		int month=c.get(Calendar.MONTH);
		int week=c.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(c.get(Calendar.YEAR)+"��");
		System.out.println(mons[month]);
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(weeks[week]);
		
		System.out.println("***********************");
		//����ʱ��
		c.set(2019,7,1);
		//ʱ����ǰ�ƻ�������
		c.add(Calendar.YEAR,2);//�������
		c.add(Calendar.MONTH,-3);//�¼�ȥ����
		System.out.println(c.get(Calendar.YEAR)+"��");
		System.out.println((c.get(Calendar.MONTH)+1)+"��");
		System.out.println(c.get(Calendar.DAY_OF_MONTH)+"��");
		System.out.println(weeks[week]);
		
	}

}
