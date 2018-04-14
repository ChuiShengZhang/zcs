package design_patterns;
/*���ģʽ�����ĳһ��������֮��Ч�ķ�����
 * Java����23�����ģʽ��
 */


/*    �������ģʽ�����һ�������ڴ���ֻ����һ������
 *    ��Ҫ�ö���Ψһ
 *    1.Ϊ�˱��������������Ĵ�������Ķ����Ƚ�ֹ�������򴴽��������
 *    2.Ϊ����������������ʸö���ֻ���ڱ����д���һ������
 *    Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ������
 */
/*   *****************����ʽ******************/
class HungrySingle{
	private HungrySingle(){
		System.out.println("��ʽ���ģʽ");
	}
	static HungrySingle hungrysingal=new HungrySingle();
	public static HungrySingle getInstance(){
		return hungrysingal;
	}
}
/*  ******************����ʽ******************/
class LazySingle{
	private LazySingle(){
		System.out.println("����ʽ���ģʽ");
	}
	static LazySingle lazysingle=null;
	public static LazySingle getInstance(){
		if(lazysingle==null){
			lazysingle=new LazySingle();
		}
		return lazysingle;
	}
}
public class SingleDemo {
	public static void main(String[] args){
		//   ����ʽ
		//HungrySingle hungrysingle=new HungrySingle();  �޷���������
		HungrySingle hungrysingle=HungrySingle.getInstance();//��������getInstance������ȡ���󣬱�֤�˶����Ψһ
		
		//����ʽ
		//LazySingle lazysingle=new LazySingle();  �޷���������
		LazySingle lazysingle=LazySingle.getInstance();//��������getInstance������ȡ���󣬱�֤�˶����Ψһ
	}
}
