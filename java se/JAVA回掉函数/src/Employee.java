
public class Employee {

	
    void work(CallListener lisener) {
    	
    	Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					System.out.println("��ʼ�������ˣ�����");
					sleep(1000);
					lisener.call("����������");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
    		
    	};
    	thread.start();
    	
    }
}
