package thread;
class Thread1 implements Runnable{
	 @Override
	public void run() {
		System.out.println("Thread1:");
		for(int i=0;i<=5;i++) {
			
			System.out.println(i);
		}
	}
	 
	 
	 class Thread2 extends Thread{
		 public void run() {
			 for(int i=0;i<=5;i++) {
					
					System.out.println(i);
				} 
		 }
	 }
	 
	 class Thread3 extends Thread{
		 public void run() {
			 System.out.println("Thread3");
			 int num = 9; 
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(num + " * " + i + " = "
		                               + num * i);
		 }
	 }
}
}
public class ThreadExUsingInterface {

	public static void main(String[] args) {
	
	Thread1 t=new Thread1();
    Thread t1=new Thread(t);
	t1.start();

	Thread2 t2=new Thread2();
	t2.start();
	
	Thread3 t3=new Thread3();
	t3.start();
	}

}

