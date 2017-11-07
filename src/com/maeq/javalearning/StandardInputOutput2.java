package com.maeq.javalearning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class StandardInputOutput2 {

	public static void main(String[] args) throws IOException {
        String s;  
        // 创建缓冲区阅读器从键盘逐行读入数据  
        InputStreamReader ir = new InputStreamReader(System.in);  
        BufferedReader in = new BufferedReader(ir);  
        System.out.println("Unix系统: ctrl-d 或 ctrl-c 退出"  
                + "\nWindows系统: ctrl-z 退出");  
        try {  
            // 读一行数据，并标准输出至显示器  
            s = in.readLine();  
            // readLine()方法运行时若发生I/O错误，将抛出IOException异常  
            while (s != null) {  
                System.out.println("Read: " + s);  
                s = in.readLine();  
            }  
            // 关闭缓冲阅读器  
            in.close();  
        } catch (IOException e) { // Catch any IO exceptions.  
            e.printStackTrace();  
        }  

        // BufferedReader 另一种用法  从文件读取内容
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\ming.txt")));
        String data = null;
        while((data = br.readLine())!=null)
        {
        	System.out.println(data);
        }
        
        // BufferedReader 另一种用法  从网络读取数据
        String str3 = StandardInputOutput2.getHtml("http://www.baidu.com");
        System.out.println(str3);
	}
	
	public static String getHtml(String url) throws IOException {
		String source ="";
		String line ="";
		URL _url = new URL(url);
		InputStream inStream = _url.openStream();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inStream,"UTF-8"));
		while((line = bufferedReader.readLine())!=null) {
		source += line;
		}
		return source;
	}

}
