package static_code_blocks;
/* ��̬�����
 * static{
 * 
 * }
 * ������ļ��ض����أ��ȶ����ȴ��ڣ���һ���ؾ�ִ�о�̬����顣
 * ��������
 * {
 * 
 * }
 * ��������ʱִ�У����ȼ����ڹ��췽����
  */
class Code{
	//���췽��
	Code(){
		System.out.println("code str method");
	}
	//��̬�����
	static{
		System.out.println("static code blocks");
	}
	//��������	
	{
		System.out.println("str code blocks");
	}
}
public class BlocksDemo {
	public static void main(String[] args){
		new Code();
	}
}
