
public class Employee {

	
    void work(CallListener lisener) {
    	
    	Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					System.out.println("开始做事情了，，，");
					sleep(1000);
					lisener.call("事情做完了");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
    		
    	};
    	thread.start();
    	
    }
}
