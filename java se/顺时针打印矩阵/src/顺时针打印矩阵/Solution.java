package ˳ʱ���ӡ����;

import java.util.ArrayList;

public class Solution {
	
	
	
	 public static ArrayList<Integer> printMatrix(int [][] matrix) {
		 
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 
		 
		 if(matrix.length==0) return result;
		 
		 //����һ�������飻
		 int[] row = null;
		 
		 for(int i=0;i<matrix.length;i++) {
			 
			 row = matrix[i];
			 int j;
			 if(i%2==0) {
				//����ǵ����� ˳�����
				 for(j=0;j<row.length;j++) {
					 result.add(row[j]);
				 }
				 
			 }else {
				//�����˫���� �������
				 for(j=row.length-1;j>0;j--) {
					 result.add(row[j]);
				 }
			 }
		
		 }
		return result;
	       
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] tet = {{1}};
		
		
		printMatrix(tet);
	}

}
