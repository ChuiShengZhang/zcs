package jdk_1_5_new;
/*
 * jdk1.5�汾������
 * 				��̬����  ��ʽimport static 
 * 				�������ظ�ʱ����Ҫָ������İ���
 * 				���������ظ�ʱ����Ҫָ�����������Ķ��������
 * */

import static java.util.Arrays.*;//��������������������о�̬��Ա(������̬�����;�̬����)
import java.util.Arrays;//�����������������е��ࡣ


public class StaticImport {
	public static void main(String[] args){
		int[] arr={1,2,6,8,5};
		sort(arr);//��̬��������з�������ֱ�ӵ���
		System.out.println(Arrays.toString(arr));//toString������Object�����������Բ�����ֱ�ӵ��ã�ֻ��ͨ��Arrays.����
	}
}
