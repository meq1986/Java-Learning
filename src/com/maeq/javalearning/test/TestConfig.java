/**
 * 
 */
package com.maeq.javalearning.test;

import java.io.File;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

/**
 * @author user
 *
 */
public class TestConfig {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello,world.");
		
		Configurations configs = new Configurations();
		try
		{
		    Configuration config = configs.properties(new File("config.properties"));
		    System.out.println("Hello,world.");
		    // access configuration properties
		}
		catch (ConfigurationException cex)
		{
			System.out.println(cex.toString());
		} 
		

	}

}
