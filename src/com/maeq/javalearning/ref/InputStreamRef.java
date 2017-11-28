/**
 * 
 */
package com.maeq.javalearning.ref;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author Administrator
 *
 */
public class InputStreamRef {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://www.baidu.com";
		InputStreamRef ir = new InputStreamRef();
		
		System.out.println(ir.getStream_InputStream(url));
	}

    /**
     * 获取字节流
     * @param url
     * @return
     */
    private String getStream_InputStream(String url){
        //获取字节流
        InputStream in = null;
        String result = "";
        try {
            in = new URL(url).openStream();
            int tmp;
            while((tmp = in.read()) != -1){
                result += (char)tmp;
            }
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //输出字节流
        return result;
    }
    
    
    /*
     * 得到字符流前需先有字节流
     */
    private String getStream_InputstreamReader(String url){
        try {
            //得到字节流
            InputStream in = new URL(url).openStream();
            //将字节流转化成字符流，并指定字符集
            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
            String results = "";
            int tmp;
            while((tmp = isr.read()) != -1){
                results += (char)tmp;
            }
            return results;

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
    
    /*
     * 字节流——字符流——缓存输出的字符流
     */
    private String getStream_BufferedReader(String url){
        try {
            //得到字节流
            InputStream in = new URL(url).openStream();
            //将字节流转化成字符流，并指定字符集
            InputStreamReader isr = new InputStreamReader(in,"UTF-8");
            //将字符流以缓存的形式一行一行输出
            BufferedReader bf = new BufferedReader(isr); 
            String results = "";
            String newLine = "";
            while((newLine = bf.readLine()) != null){
                results += newLine+"\n";
            }
            return results;

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
