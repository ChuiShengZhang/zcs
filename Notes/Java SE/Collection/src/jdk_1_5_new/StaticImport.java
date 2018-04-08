package jdk_1_5_new;
/*
 * jdk1.5版本新特性
 * 				静态导入  格式import static 
 * 				当类名重复时，需要指定具体的包名
 * 				当方法名重复时，需要指定具体所属的对象或类名
 * */

import static java.util.Arrays.*;//导入的是这个类里面的所有静态成员(包括静态变量和静态方法)
import java.util.Arrays;//导入的是这个包里所有的类。


public class StaticImport {
	public static void main(String[] args){
		int[] arr={1,2,6,8,5};
		sort(arr);//静态导入后，特有方法可以直接调用
		System.out.println(Arrays.toString(arr));//toString方法与Object中重名，所以不可以直接调用，只能通过Arrays.调用
	}
}
