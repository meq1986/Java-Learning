package com.maeq.javalearning.test;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello,world."); 
		
		try
		{
			throw new NullPointerException();
		}
		catch (NullPointerException e) {
			System.out.println("NullPointerException"); 
		}
		
		System.out.println("i am the end."); 
	}

}
