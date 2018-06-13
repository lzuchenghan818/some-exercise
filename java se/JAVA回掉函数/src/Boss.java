
public class Boss implements CallListener{

	
	Employee e;
	
    
	
	@Override
	public void call(String content) {
		// TODO Auto-generated method stub
		System.out.println(content);
	}
	
	public static void main(String[] args) {
		
		Boss boss = new Boss();
		Employee e = new Employee();
		e.work(boss);
	}
}
