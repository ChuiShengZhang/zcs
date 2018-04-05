package jdk_1_5_new;

/*
 * jdk1.5版本新特性  可变参数
 *   		数据类型... 数组名====将传递来的参数封装成数组
 *   		注意事项:可变参数一定要定义在参数列表的最后面
 * 
 * */
public class ParamMethodDemo {
	public static void main(String[] args){
		show(1,5,6);
		show(4,5);
		show("8",1,2,3);
	}
	public static void show(int... arr){
		for(int i:arr){
			System.out.println(i);
		}
	}
	public static void show(String str,int... arr){
		System.out.println("show2");
		System.out.println(str);
		System.out.println(arr.length);
	}
	//public static void show(int... arr,String str){}可变参数要定义在最后
}
