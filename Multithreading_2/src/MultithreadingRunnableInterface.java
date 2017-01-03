
public class MultithreadingRunnableInterface implements Runnable{
	private String threadName;
	private Thread t;
	MultithreadingRunnableInterface( String name) {
		threadName = name;
		System.out.println("Creating " +  threadName );
	}

	public void run() {
		System.out.println("Running " +  threadName );
		try {
			for(int i = 1; i <=5 ; i++) {
				System.out.println("Thread: " + threadName + ", " + i);
			// Let the thread sleep for a while.
			Thread.sleep(50);
			}
		}catch (InterruptedException e) {
			System.out.println("Thread " +  threadName + " interrupted.");
		}
			System.out.println("Thread " +  threadName + " exiting.");
	}

	public void start () {
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
			if(threadName.equalsIgnoreCase("Thread-1")){
				t.setPriority(Thread.MIN_PRIORITY);
			}
			t.start ();
		}
	}
	
}
