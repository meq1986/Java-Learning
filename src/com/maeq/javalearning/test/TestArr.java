/**
 * 
 */
package com.maeq.javalearning.test;

/**
 * @author Administrator
 *
 */
public class TestArr {
	
	public void test1(char[] c)
	{
		System.out.println("test1");
	}
	
	public void test2(char c[])
	{
		System.out.println("test2");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] c = {'1','2','3'};
		TestArr ta = new TestArr();
		ta.test1(c);
		ta.test2(c);
	}

}
