package 两个栈实现队列;

import java.util.Stack;

public class Solution {
    static //入栈
    Stack<Integer> stack1 = new Stack<Integer>();
    //出栈
    static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static void push(int node) {
        stack1.add(node);
        //清空stack2
    	stack2.clear();
    	int i =stack1.size()-1;
    	for(;i>0;i--) {
    		stack2.push(stack1.get(i));
    	}
    }
    
    public static int pop() {
    	//清楚stack1中的
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
