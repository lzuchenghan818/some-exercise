package ���ĸ߶�;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ������һ�úϷ��Ķ����������Ľڵ㶼�������ֱ�ʾ�����ڸ�������������еĸ��ӹ�ϵ����������ĸ߶�
��������:
����ĵ�һ�б�ʾ�ڵ�ĸ���n��1 �� n �� 1000���ڵ�ı��Ϊ0��n-1����ɣ�
������n-1�У�ÿ����������������һ������ʾ���ڵ�ı�ţ��ڶ�������ʾ�ӽڵ�ı��
�������:
������ĸ߶ȣ�Ϊһ������
ʾ��1
����

5
0 1
0 2
1 3
1 4

���

3
 * @author chengh
 *
 */

public class Main {
	
	class Node{
	     int value;
	     Node son = null;
	     Node father = null;
	     
	     
	}
	
	static ArrayList<Node> tree = new ArrayList<Node>();
	
	private int getTreeHeight() {
		
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		Main test  = new Main();
		//����node
		for(int i=0;i<number;i++) {
			tree.add(test.new Node());
		}
		//������
		for(int i=0;i<number-1;i++) {
			int father = input.nextInt();
			tree.get(i).father = tree.get(father);
			int son = input.nextInt();
			tree.get(i).son = tree.get(son);
		}
	
	}

}
