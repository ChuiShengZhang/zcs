package File;

import java.io.File;

/*
 * �оٳ�Ŀ¼�µ������ļ���������Ŀ¼���ļ�
 * 
 * �õ��ݹ�(�����������)
 * �ݹ�ע������:
 * 1.�޶�����
 * 2.ע��ݹ���õĴ��������������ڴ����
 */
public class ListAllDemo {

	public static void main(String[] args) {
		File dir = new File("F:\\����");//��Ŀ¼��װ��File����
		listFile(dir);
	}
	
	//�о������ļ��ķ���
	public static void listFile(File dir){
		File[] files=dir.listFiles();
		for(int i=0; i<files.length; i++){
			System.out.println(dir);
			//�ж��Ƿ�ΪĿ¼�������ڵ����Լ����оٳ���Ŀ¼�µ������ļ����������ӡ
			if(files[i].isDirectory()){
				listFile(files[i]);
			}else{
				System.out.println(files[i]);
			}
		}	
	}
}
