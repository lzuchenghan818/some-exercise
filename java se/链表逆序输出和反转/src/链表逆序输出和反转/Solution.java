package ������������ͷ�ת;

import java.util.ArrayList;

public class Solution {

	
	class ListNode{
		
		int val;
		ListNode next = null;
		
		ListNode(int val) {
		    this.val = val;
		}
	}
	
	//�ݹ�����ת
	private static void ReverseList(ListNode listNode) {
		
	}
	
	//�ݹ����������
	private static void printListFromTailToHead(ListNode listNode) {
		
	}
	
	//�ǵݹ鷴�����
	private static void printListFromTailToHead2(ListNode listNode) {
			
	}
	//�ǵݹ鷴ת
	private static void ReverseList2(ListNode listNode) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if(listNode == null) {
			return;
		}
		
		ListNode pre,cur,tmp;
		//��ǰ���
		cur = listNode.next;
		//��һ���ڵ�
		pre  = listNode;
		
		while(cur !=null) {
			//��ʱ��һ���ڵ�
			tmp = cur.next;
			//�ı�ָ��
			cur.next = pre;
			
			//�ı�ָ��λ��
			pre = cur;
			cur = tmp;
		}
		//ԭ����Ϊ��
		listNode.next = null;
		
		
		while(pre!=null) {
			result.add(pre.val);
			pre = pre.next;
		}
			
	}
	
	
	public static void main(String[] args) {
		
	}

}
