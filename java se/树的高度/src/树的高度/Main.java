package 树的高度;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 现在有一棵合法的二叉树，树的节点都是用数字表示，现在给定这棵树上所有的父子关系，求这棵树的高度
输入描述:
输入的第一行表示节点的个数n（1 ≤ n ≤ 1000，节点的编号为0到n-1）组成，
下面是n-1行，每行有两个整数，第一个数表示父节点的编号，第二个数表示子节点的编号
输出描述:
输出树的高度，为一个整数
示例1
输入

5
0 1
0 2
1 3
1 4

输出

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
		//创建node
		for(int i=0;i<number;i++) {
			tree.add(test.new Node());
		}
		//生成树
		for(int i=0;i<number-1;i++) {
			int father = input.nextInt();
			tree.get(i).father = tree.get(father);
			int son = input.nextInt();
			tree.get(i).son = tree.get(son);
		}
	
	}

}
