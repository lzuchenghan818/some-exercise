package ţ����_ͳһģ����_�ڰ׿�Ƭ;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		//BBWBWWBWBWWBBBWBWBWBBWBBW
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		StringBuffer inputBuffer1 = new StringBuffer(input);
		StringBuffer inputBuffer = new StringBuffer(input);
		int number = 0;
		int Wnumber = 0;
		
		//�����B��ͷ
		
		char first = input.charAt(0);
		
		  inputBuffer1.setCharAt(0, 'B');
		  if(first!='B') {
			  Wnumber++;
			    }
			for(int i=0;i<inputBuffer1.length()-1;i++) {
				//�ж�ǰ��ͺ����Ƿ���� ����������
				char index_now = inputBuffer1.charAt(i);
				char index_next = inputBuffer1.charAt(i+1);
				if(index_now==index_next) {
					//B��ͷ�ô���+1
					Wnumber++;
					//����
					switch(index_now) {
					case 'B':inputBuffer1.setCharAt(i+1, 'W');break;
					case 'W':inputBuffer1.setCharAt(i+1, 'B');break;
					}
				}
			}
			
			
		    inputBuffer.setCharAt(0, 'W');
		    
		    if(first!='W') {
			number++;
		    }
			for(int i=0;i<inputBuffer.length()-1;i++) {
				//�ж�ǰ��ͺ����Ƿ���� ����������
				char index_now = inputBuffer.charAt(i);
				char index_next = inputBuffer.charAt(i+1);
				if(index_now==index_next) {
					//B��ͷ�ô���+1
					number++;
					//����
					switch(index_now) {
					case 'B':inputBuffer.setCharAt(i+1, 'W');break;
					case 'W':inputBuffer.setCharAt(i+1, 'B');break;
					}
				}
			}
			System.out.println(inputBuffer);
			System.out.println(inputBuffer1);
		System.out.println(((Wnumber>number)?number:Wnumber));
	}
	
}
