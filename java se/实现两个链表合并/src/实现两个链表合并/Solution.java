package ʵ����������ϲ�;


public class Solution {
	
	class ListNode{
		
		int val;
		ListNode next = null;
		
		ListNode(int val) {
		    this.val = val;
		}
	}
	
	  public static ListNode Merge(ListNode list1,ListNode list2) {
		  
		if(list2==null&&list1==null) return null;
		if(list1==null&&list2!=null) return list2;
		if(list2==null&&list1!=null) return list1;
		
		//�õ�����һ��β�ڵ�
		
		//����ǰһ��Ԫ��
		ListNode pre1,pre2,tmp1,tmp2;
        pre1 = list1;
        pre2 = list2;
        tmp1 = list1;
        tmp2 = list2;
		while(pre1!=null && pre2!=null) {
			if(pre1.val<=pre2.val){
                //�ƶ���һ����ıȽ���
                tmp1 = pre1;
				pre1 = pre1.next;
				//�ϲ�1��2
//				if(pre1==null) {
//					tmp1.next = pre2;
//					break;
//				}
			}else {
				//����ָ��λ��
				tmp1.next = pre2;
                tmp2 = pre2.next;
				pre2.next = pre1;
                //�ƶ��ڶ�����ıȽ��� ��һ�����治��
                pre2 = tmp2;
                tmp1 = tmp1.next;
			}
            
		}
		return list1;
	  }
	  
	  public static void main(String[] args) {
		  Solution test  = new Solution();
		  ListNode list1 = test.new ListNode(1);
		  ListNode list3 = test.new ListNode(3);
		  ListNode list5 = test.new ListNode(5);
		  list1.next = list3;
		  list3.next = list5;
		  
		  ListNode list2 = test.new ListNode(2);
		  ListNode list4 = test.new ListNode(4);
		  ListNode list6 = test.new ListNode(6);
		  list2.next = list4;
		  list4.next = list6;
		  
		  Merge(list1,list2);
		  while(list1!=null) {
			  System.out.println(list1.val);
			  list1 = list1.next;
		  }
	  }

}
