/**
 * Project Name:Java-Learning
 * File Name:RandomCode.java
 * Package Name:com.maeq.javalearning.ref
 * Date:2018年5月3日下午3:58:26
 * Copyright (c) 2018, meq1986@163.com All Rights Reserved.
 *
*/
/**
 * Project Name:Java-Learning
 * File Name:RandomCode.java
 * Package Name:com.maeq.javalearning.ref
 * Date:2018年5月3日下午3:58:26
 * Copyright (c) 2018, meq1986@163.com All Rights Reserved.
 *
 */

package com.maeq.javalearning.ref;

import java.util.Random;

/**
 * ClassName:RandomCode <br/>
 * Function: 产生随机数 两种方式 
 * Reason:	 
 * Date:     2018年5月3日 下午3:58:26 <br/>
 * @author   meq1986@163.com
 * @version  1.0.0
 * @since    JDK 1.6
 * @see 	 
 */
public class RandomCode {

  /**
   * main:(这里用一句话描述这个方法的作用). <br/>
   * TODO(这里描述这个方法适用条件 – 可选).<br/>
   * TODO(这里描述这个方法的执行流程 – 可选).<br/>
   * TODO(这里描述这个方法的使用方法 – 可选).<br/>
   * TODO(这里描述这个方法的注意事项 – 可选).<br/>
   *
   * @author Administrator
   * @param args
   * @since JDK 1.6
   */
  public static void main(String[] args) {

    // 以这种形式实例化对象时，Java编译器以系统当前时间作为随机数生成器的种子
    // 因为每时每刻的时间都不可能相同，所以产生的随机数也不同。如果运行速度太快，也会产生两次运行结果相同的随机数。
    Random ran=new Random();  
    
    for(int i = 0;i<100;i++){
      System.out.println(ran.nextInt());    // 生成的随机数，杂乱无章，有正有负
      System.out.println(ran.nextDouble());
      System.out.println(ran.nextBoolean());
    }

    //////////////////////////////////////////////////////////////////////
    
    // Math类的random()方法可以生成大于等于0.0、小于1.0的double型随机数。
    double tempRand = Math.random();
    System.out.println(tempRand);
    
    for(int j=0;j<100;j++){
      System.out.println(Math.random());
    }
    
  }

}

