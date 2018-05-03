/**
 * 
 */
package com.maeq.javalearning.ref;

/**
 * @author maeq
 * 计算程序运行时间的两种方式
 * 一种，单位 毫秒
 * 一种，单位 纳秒
 */
public class CalcRunTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	  
		// 以 ms 为单位
		long startTime = System.currentTimeMillis();    //获取开始时间
		
		for(int i=0;i<=10000;i++){
			System.out.println("hello,world");
		}

		long endTime = System.currentTimeMillis();    //获取结束时间

		//System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
		
		//第二种是以纳秒为单位计算的。

		long startTime2=System.nanoTime();   //获取开始时间  

		for(int i=0;i<=10000;i++){
				System.out.println("hello,world");
		}

		long endTime2=System.nanoTime(); //获取结束时间  

		System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
		System.out.println("程序运行时间： "+(endTime2-startTime2)+"ns"); 

	}

}
