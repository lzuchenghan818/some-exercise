
/**
 * 绕过编译器 检查异常不需要try catch
 * @author chengh
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution.enter();
	}
	
	
	public static void enter(){
		Exceptions.reflect();
	}
	static class Exceptions{
		public Exceptions() throws Exception{
			throw new Neo();
		}
		public static void reflect() {
			try {
				Exceptions.class.newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static <E extends Throwable> void throwException0(Throwable t) throws E {  
        throw (E) t;  
    } 
	public static <E extends Throwable> void test(Throwable t) throws E {
		throw (E)t;
	}
	
	
}
