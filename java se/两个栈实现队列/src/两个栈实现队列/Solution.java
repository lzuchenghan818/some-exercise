package ����ջʵ�ֶ���;

import java.util.Stack;

public class Solution {
    static //��ջ
    Stack<Integer> stack1 = new Stack<Integer>();
    //��ջ
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void push(int node) {
        stack1.add(node);
        //���stack2
    	stack2.clear();
    	int i =stack1.size()-1;
    	for(;i>0;i--) {
    		stack2.push(stack1.get(i));
    	}
    }
    
    public static int pop() {
    	//���stack1�е�
        stack1.remove(0);
    	return  stack2.pop();
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		push(1);
		push(2);
		push(3);
		
		pop();
//		for(Integer val:stack1) {
//			System.out.println(val);
//    	}
//		System.out.println(stack1.get(0));
//		System.out.println(stack1.pop());
	}

}
