package 替换空格;

/**
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @author chengh
 *
 */

public class Solution {

	public static String replaceSpace(StringBuffer str) {
		StringBuffer result = new StringBuffer("");
		char index = 0;
		for(int i=0;i<str.length();i++) {
			index = str.charAt(i);
			if(index!=' ') {
				result.append(index);
			}else {
				result.append("%20");
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
