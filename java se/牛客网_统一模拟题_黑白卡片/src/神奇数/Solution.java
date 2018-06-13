package ÉñÆæÊı;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	
	public static void main(String[] args) {
		
		//System.out.println(isShuSu(70));
		Scanner input = new Scanner(System.in);
		
		int start = input.nextInt();
		int end = input.nextInt();
		
		int x;
		int y;
		int result;
		Set<String> total = new HashSet<String>();
		
		for(int i = start;i<=end;i++) {
			
			
			String str = String.valueOf(i);
			
			char[] chars = str.toCharArray();
			
			for(int j=0;j<chars.length;j++) {
				
				 x = chars[j]-'0';
				 if(x==0)  continue;
				for(int k=0;k<chars.length;k++) {
					if(j==k) continue;
					y= chars[k]-'0';
					result = x*10+y;
					
					if(isShuSu(result)) {
						if(!total.contains(result)) {
							total.add(str);
							break;
						}
					}
				}
			}
		}
		for(String s:total) {
			System.out.println(s);
		}
		System.out.println(total.size());
	}
	
	private static boolean isShuSu(int x) {
		
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;
	}
	
	
	
}
