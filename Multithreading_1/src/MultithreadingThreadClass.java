
public class MultithreadingThreadClass extends Thread {
	private Thread t;
	private String threadName;
	public MultithreadingThreadClass(String tName) {
		threadName = tName;
		System.out.println("Created thread : " + threadName);
	}
	public void run(){
		System.out.println("Running thread : " + threadName);
		try {
			for(int i=0; i<5; i++) {
				System.out.println("Thread : " + threadName + " Value is : " + i );
				Thread.sleep(50);
			} 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread " +  threadName + " exiting.");
		
		
	}
	
	public void startThread(){
		System.out.println("Thread starting is : " + threadName);
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
}
