package com.maeq.javalearning.ref;

import java.io.IOException;

/**
 * ClassName: StandardInputOutput1 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2018年5月3日 下午2:22:49 <br/>
 *
 * @author Administrator
 * @version 
 * @since JDK 1.6
 */
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
