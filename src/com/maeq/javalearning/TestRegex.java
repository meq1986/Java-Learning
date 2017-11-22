/**
 * 
 */
package com.maeq.javalearning;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.*;

/**
 * @author Administrator
 *
 */
public class TestRegex {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//System.out.println("Hello,world.");
		
		// 要验证的字符串
	    String input = "女命　　　出生地区：未知\r\n公历日期：1985年4月1日1时0分出生（北京时间）\r\n　　　　一九八五年　　　二月　　　　十二日　　　丑时";
	    //System.out.println(input);
	    
	    String regex = "^.*公历日期.*$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        
/*        while (matcher.find()) {
            System.out.printf("%d-%d\n", matcher.start(), matcher.end());
            System.out.printf(input.substring(matcher.start(), matcher.end()));
        }*/
        
        input = "女命　　　出生地区：未知\r\n公历日期：1985年4月1日1时0分出生（北京时间）\r\n　　　　一九八五年　　　二月　　　　十二日　　　丑时\r\n　　　　　　才　　　　　印　　　　　日　　　　　官\r\n八字：　　　乙　　　　　己　　　　　庚　　　　　丁\r\n　　　　　　丑　　　　　卯　　　　　午　　　　　丑　　[戌亥空]\r\n　　　　　辛己癸　　　　乙　　　　己丁　　　　辛己癸\r\n　　　　　劫印伤　　　　才　　　　印官　　　　劫印伤\r\n四支旺衰：　墓　　　　　胎　　　　　沐　　　　　墓";
        regex = "^.*八字：.*$";
        pattern = Pattern.compile(regex, Pattern.MULTILINE);
        matcher = pattern.matcher(input);
        
        if (matcher.find()) {
            //System.out.printf("%d-%d\n", matcher.start(), matcher.end());
            //System.out.println(input.substring(matcher.start(), matcher.end()));
            int start = matcher.start();
            int end = matcher.end();
            
            BufferedReader bre = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(input.getBytes(Charset.forName("utf8"))), Charset.forName("utf8")));
            String line;  
            bre.readLine();
            bre.readLine();
            bre.readLine();
            
            line = bre.readLine();
            System.out.println(line);
/*            while ( (line = bre.readLine()) != null ) {  
                System.out.println(line);  
            }  */
            
        }
        
        
	}

}
