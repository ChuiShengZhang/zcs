import java.io.IOException;

/*
 * Runtime����
 * û�й��캯����ʹ���˵������ģʽ��ͨ��getRuntime��ȡRuntime����
 * exec()����ϵͳӦ�ó��� ���ؽ��̶���Process
 * 
 * */
public class RuntimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime r=Runtime.getRuntime();
		Process p=r.exec("D:\\KGMusic\\KuGou.exe");//����exec����ϵͳ��execӦ�ó��򣬸ķ����׳����쳣
		
		Thread.sleep(4000);
		p.destroy();//ɱ���ӽ���
		
		r.exec("D:\\QQӰ��\\QQPlayer\\QQPlayer.exe D:\\��Ӱ\\sdyjq519.mp4");//��ǰ��ָ����Ӧ�ó���򿪺�����ļ�������Ҫһ��
	}

}
