package thread;


class MultiThread2 extends Thread{
	public void run() {
		System.out.println("Running Thread Name :"+this.currentThread().getName());
		System.out.println("Running Thread Priority:"+this.currentThread().getPriority());
		
	}
}
public class MultiThread1 {

	public static void main(String[] args) {
	 MultiThread2 multiThread1=new MultiThread2();
	 multiThread1.setName("First Thread");
	 multiThread1.setPriority(Thread.MIN_PRIORITY);
	 
	 MultiThread2 multiThread2=new MultiThread2();
	 multiThread2.setName("Second Thread");
	 multiThread2.setPriority(Thread.MAX_PRIORITY);
	 
	 MultiThread2 multiThread3=new MultiThread2();
	 multiThread3.setName("Third Thread");
	 multiThread3.setPriority(Thread.NORM_PRIORITY);
	 
	 multiThread1.start();
	 multiThread2.start();
	 multiThread3.start();
	}

}
