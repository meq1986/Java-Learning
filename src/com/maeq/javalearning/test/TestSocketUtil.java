/**
 * 
 */
package com.maeq.javalearning.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author maeq
 *
 */
public class TestSocketUtil implements Callable<String>{
	
	private static final String serverHost = "127.0.0.1";
	private static final int serverPort = 2333;
	private static TestSocketUtil instance = new TestSocketUtil();
	private static int year = 1990;
	
	private TestSocketUtil(){};
	
	public static TestSocketUtil getInstance(){
		return instance;
	}
	

	@Override
	public String call() throws Exception {
		return this.crawler();
	}

	public String crawler()
	{
		String result = "";
		
		Socket socket = null;
		PrintWriter write = null;
		BufferedReader in = null;
		try {
			socket = new Socket(serverHost, serverPort);
			write = new PrintWriter(socket.getOutputStream());
	        in = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf-8"));
	        
	        String paramlist = "sex=" + "1" +",year=" + String.valueOf(year++) +",month=" + "12" + ",day=" + "12" + ",hour=" + "12"
	        		+ ",minute=" + "12" + ",sex2=" + "0" + ",year2=" + String.valueOf(year++) + ",month2=" + "12" + ",day2=" + "12"
	        		+ ",hour2=" + "12" + ",minute2=" + "12";
	        
	        write.println(paramlist);
	        write.flush();
	        
	        String str = "";
	        while((str = in.readLine()) != "end"){
	        	if(str.equals("end"))
	        	{
	        		break;
	        	}
	        	result = result + str + "\n";
	        }
	        
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			write.close(); 
	        try {
				in.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			FutureTask<String> result = new FutureTask<String>(TestSocketUtil.getInstance());
			new Thread(result).start();
			try {
				System.out.println(result.get());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
