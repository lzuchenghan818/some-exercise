package 计算器;

import java.util.Random;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		int randn =  (int)(Math.random()*100);
		
		System.out.println("请输入一个数 猜测他是多少：");
		Scanner scan = new Scanner(System.in);
		int input;
		while(true) {
			input= scan.nextInt();
			if(randn == input) {
				System.out.println("恭喜您 猜对了！");
				break;
			}if(randn>input) {
				System.out.println("你猜错了  输入的数较小 请重新输入");
			}else {
				
				System.out.println("你猜错了  输入的数较大 请重新输入");
			}
		}
		
		
		
	
	}

}
