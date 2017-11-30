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
		    
		    String dbHost = config.getString("database.host");
		    int dbPort = config.getInt("database.port");
		    String dbUser = config.getString("database.user");
		    long dbTimeout = config.getLong("database.timeout");
		    
		    System.out.println("database.host = " + dbHost);
		    System.out.println("database.port = " + dbPort);
		    System.out.println("database.user = " + dbUser);
		    System.out.println("database.timeout = " + dbTimeout);
		}
		catch (ConfigurationException cex)
		{
			cex.printStackTrace();
			System.out.println(cex.toString());
		} 
		

	}

}
