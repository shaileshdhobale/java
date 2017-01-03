

public class ThreadClass{
	public static void main(String a[]){
		MultithreadingThreadClass threadObj1 = new MultithreadingThreadClass("Thread-1");
		threadObj1.startThread();
		
		MultithreadingThreadClass threadObj2 = new MultithreadingThreadClass("Thread-2");
		threadObj2.startThread();
	}
}
