package �滻�ո�;

/**
 * ��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
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
