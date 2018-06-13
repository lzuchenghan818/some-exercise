package 链表逆序输出和反转;

import java.util.ArrayList;

public class Solution {

	
	class ListNode{
		
		int val;
		ListNode next = null;
		
		ListNode(int val) {
		    this.val = val;
		}
	}
	
	//递归链表反转
	private static void ReverseList(ListNode listNode) {
		
	}
	
	//递归链表反序输出
	private static void printListFromTailToHead(ListNode listNode) {
		
	}
	
	//非递归反序输出
	private static void printListFromTailToHead2(ListNode listNode) {
			
	}
	//非递归反转
	private static void ReverseList2(ListNode listNode) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(listNode == null) {
			return;
		}
		
		ListNode pre,cur,tmp;
		//当前结点
		cur = listNode.next;
		//上一个节点
		pre  = listNode;
		
		while(cur !=null) {
			//临时下一个节点
			tmp = cur.next;
			//改变指针
			cur.next = pre;
			
			//改变指针位置
			pre = cur;
			cur = tmp;
		}
		//原链表为空
		listNode.next = null;
		
		
		while(pre!=null) {
			result.add(pre.val);
			pre = pre.next;
		}
			
	}
	
	
	public static void main(String[] args) {
		
	}

}
