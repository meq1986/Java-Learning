/**
 * 
 */
package com.maeq.javalearning;

/**
 * @author Administrator
 * 数组为null  数组长度为0 有何不同
 */
public class TestArrNull {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr1 = null;
		int [] arr2 = new int[0];
		
		System.out.println(arr1);	// null
		System.out.println(arr2);	// [I@1fe256b
		
		
		System.out.println(arr1.length);	// java.lang.NullPointerException
		System.out.println(arr2.length);	// 0
		
		// 注意顺序 不可逆反
		// 数组判断为空 
		if(arr1 == null || arr1.length == 0)
		{
			System.out.println("arr1 == null || arr1.length == 0");	// null
		}
		
	}

}
