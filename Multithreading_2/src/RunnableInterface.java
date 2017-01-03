
public class RunnableInterface {
	public static void main(String [] args) {
	MultithreadingRunnableInterface thread1 = new MultithreadingRunnableInterface("Thread-1");
	thread1.start();
	MultithreadingRunnableInterface thread2 = new MultithreadingRunnableInterface("Thread-2");
	thread2.start();
	}
}
