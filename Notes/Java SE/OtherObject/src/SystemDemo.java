import java.util.Properties;
//System����

public class SystemDemo {
	public static void main(String[] args){
		//��ȡ�ض�������
		
		System.out.println("****my os name****"+System.getProperty("os.name"));
		//�����Զ��������
		System.setProperty("myKey","myValue");
		
		Properties pro=System.getProperties();//��ȡϵͳ����
		//��ΪProperties��HashTable������
		//������Map���ϵ�ȡ����ʽȡ��
		for(Object obj:pro.keySet()){
			String value=(String)pro.get(obj);
			System.out.println(obj+":"+value);
			
		
		}
	}
}
