package ������;

import java.util.Random;
import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		
		int randn =  (int)(Math.random()*100);
		
		System.out.println("������һ���� �²����Ƕ��٣�");
		Scanner scan = new Scanner(System.in);
		int input;
		while(true) {
			input= scan.nextInt();
			if(randn == input) {
				System.out.println("��ϲ�� �¶��ˣ�");
				break;
			}if(randn>input) {
				System.out.println("��´���  ���������С ����������");
			}else {
				
				System.out.println("��´���  ��������ϴ� ����������");
			}
		}
		
		
		
	
	}

}
