package 合并数组;
/**
 * 对于已经有顺序的两个数组合并 并保持顺序 
 * @author chengh
 *
 */
public class Main {

	
	//非递归版
	private static int[] MergeArray(int[] a,int[] b) {
		
		int aIndex=0;
		int bIndex=0;
		int cLength = a.length + b.length;
		int[] c = new int[cLength];
		for(int i=0;i<cLength;i++) {
			
			if(aIndex>=a.length) {
				c[i] = b[bIndex];
				bIndex++;
			}else if(bIndex>=b.length) {
				c[i] = a[aIndex];
				aIndex++;
			}else if(a[aIndex]>b[bIndex]) {
				c[i] = b[bIndex];
				bIndex++;
			}else {
				c[i] = a[aIndex];
				aIndex++;
			}
		}
		return c;
	}
	//递归版
	private static int[] RecursiveMergeArray(int[] a,int[] b) {
		
		
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] a = {1,3,5,7,9,11,13,15,18};
           int[] b = {2,4,6,8,10};
           int[] c = MergeArray(a,b);
           
           for(int i=0;i<c.length;i++) {
        	   System.out.print(c[i]);
           }
	}

}
