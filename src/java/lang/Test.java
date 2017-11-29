package java.lang;

public class Test {

	public static void main(String[] args) {
		//System.out.println("Hello,world. this is from home.");
		
		//String t = new String("123");
		//System.out.println(t);
		
		char[] arr_char = new char[] {'1','2','3','a','b','c','d','e'};
		
		String arr_s = new String(arr_char);
		System.out.println(arr_s);
		
		arr_char[0] = 'a';
		System.out.println(arr_s);
		
		String arr_s2 = new String(arr_char,true);
		System.out.println(arr_s2);
		
		arr_char[0] = 'b';
		System.out.println(arr_s2);
	}

}
