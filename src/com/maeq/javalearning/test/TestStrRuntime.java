/**
 * 
 */
package com.maeq.javalearning.test;

/**
 * @author Administrator
 *
 */
public class TestStrRuntime {

	/**
	 * @param args
	 */
	public static void main(String[]args){
		  String str="";
		  System.out.println("str length = " + str.length());
		  
		  long starTime=System.currentTimeMillis();
		  //计算循环10000的时间
		  for(int i=0;i<10000;i++){
		   str=str+i;
		   //System.out.println(str);
		  }
		  long endTime=System.currentTimeMillis();
		  long Time=endTime-starTime;
		  System.out.println("str length = " + str.length());
		  System.out.println(Time);
		  
		  StringBuffer 
		  StringBuilder bulider=new StringBuilder("");
		  System.out.println("StringBuilder length = " + bulider.toString().length());
		  starTime=System.currentTimeMillis();
		  for(int j=0;j<10000;j++){
		   bulider.append(j);
		  }
		  endTime=System.currentTimeMillis();
		  Time=endTime-starTime;
		  System.out.println("StringBuilder length = " + bulider.toString().length());
		  System.out.println(Time);
		}

}
