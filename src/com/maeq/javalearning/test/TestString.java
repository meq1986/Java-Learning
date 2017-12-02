/**
 * 
 */
package com.maeq.javalearning.test;

/**
 * @author Administrator
 *
 */
public class TestString {
	public static void main(String[]args){
		System.out.println("Hello,world.");
		
		String str = "goodbye,shanghai.";
		System.out.println(str);
		
		System.out.println(str.codePointAt(0));
		
		String strc= "你好";
		System.out.println(strc.codePointAt(0));
	}
}
