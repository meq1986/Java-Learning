package com.maeq.javalearning;

import java.io.IOException;

public class StandardInputOutput1 {

	public static void main(String[] args) {
        int b;  
        try {  
        	// 从标准输入 键盘 读取
            System.out.println("please Input:");  
            while ((b = System.in.read()) != -1) {  
                System.out.print((char) b);  
            }  
        } catch (IOException e) {  
            System.out.println(e.toString());  
        } 

	}

}
