package ţ����_��ָOffer_ϵ�б����;


/**
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2���������������һ��n����̨���ܹ��ж���������
 * @author chengh
 *
 */
public class ��̨�� {
	
	
	public static void main(String[] args) {
		
		System.out.println(JumpFloor(3));
		
	}
	
	
	//�ݹ�
	public static int JumpFloor(int target) {
		
		if(target == 1) {
			return 1;
		}
		if(target == 2) {
			return 2;
		}
		return JumpFloor(target-1)+JumpFloor(target-2);
	}
	
	
	

}
