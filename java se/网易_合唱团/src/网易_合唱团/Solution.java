package 网易_合唱团;

import java.util.Scanner;


public class Solution {

	
	public static void main(String[] args) {
		
		
		int number;
		int[] abilitys;
		int[] params;
		
		
		Scanner input = new Scanner(System.in);
		
		String[] strs = new String[3];
		for(int i=0;i<3;i++) {
			
			strs[i] = input.nextLine();
			
		}
		
		try {
				number = Integer.parseInt(strs[0]);
				
				String[] ability = strs[1].split(" ");
				abilitys = new int[ability.length];
				
			    for(int i=0;i<ability.length;i++) {
			    	abilitys[i] = Integer.parseInt(ability[i]);
			    }
			    
			    String[] param = strs[2].split(" ");
				params = new int[param.length];
				
			    for(int i=0;i<param.length;i++) {
			    	params[i] = Integer.parseInt(param[i]);
			    }
		}catch(Exception e) {
			throw new RuntimeException("输入格式不正确");
		}
	}
	
	static void  maxmulity(int number,int[] abilitys,int[] param) {
		//排序
		for(int i=0;i<number;i++)
			for(int j=i+1;j<number;j++) {
				if(abilitys[i]<abilitys[j]) {
					
					int temp = abilitys[i];
					abilitys[i] = abilitys[j];
					abilitys[j] = temp;
					
				}
			}
		//从左到右选择最大的数字相乘 k d
		
		
	}
	
}
