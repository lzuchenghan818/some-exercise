package 腾讯实习_回文串;

import java.util.ArrayList;

/**
 * 题目链接 https://www.nowcoder.com/test/question/28c1dc06bc9b4afd957b01acdf046e69?pid=1725829&tid=13621222
 * @author chengh
 *
 */
public class Solution {

	public static void main(String[] args) {
		
		ishuiwen("google");
		
	}
	private static int ishuiwen(String input) {
		
		
		ArrayList<Integer> firstposotion = new ArrayList<Integer>();
		ArrayList<Integer> lastposotion = new ArrayList<Integer>();
		int firstindex=0;
		int lastindex = input.length()-1;
		while(true) {
			
			char first = input.charAt(firstindex);
			char last = input.charAt(lastindex);
			
			if(lastindex-firstindex<=1) {
				//打印list
				for(Integer test:firstposotion) {
					System.out.println(test);
				}
				for(Integer test:lastposotion) {
					System.out.println(test);
				}
				return 0;
			}else if(first==last) {
				firstposotion.add(firstindex);
				lastposotion.add(lastindex);
				firstindex++;
				lastindex--;
				//记录first last位置
			}else {
				firstindex++;
				lastindex--;
			}
		}
	}
	
	
}
