package ţ����_ͳһģ����_�任����;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	static int  total = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> input = new ArrayList<Integer>();
			
			
		String x = scan.nextLine();
		
		 if(x.length()>2) { 
			bianhuan(x);
		 }
		System.out.println(total);
		
	}
	//����long���ͱ��Arraylist
	private static void bianhuan(String x) {
		 total++;
	     char chars[] = x.toCharArray();
	     int result = 1;
	     for(int i=0;i<chars.length;i++) {
	    	 int number = chars[i]-'0';
	    	 result = result * number;
	     }
	     if(result>10) {
	    	 bianhuan(String.valueOf(result));
	     }else {
	    	 return;
	     }
	}
}
