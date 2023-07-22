package thread;

class Multtithread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("Thread Start to running");
			
		}
		System.out.println();
		
		
	}
	
}

class Thread2 extends Thread{
	@Override
	public void run() {
		System.out.println("Multiplication :");
		int num = 9; 
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = "
                               + num * i);
		}
	}
}

public class ThreadEx12 {

	public static void main(String[] args) {
		Multtithread m1=new Multtithread();
		Thread t1=new Thread(m1);
		t1.start();
		Thread t2=new Thread(m1);
		t2.start();
		
		Thread2 thread2=new Thread2();
		thread2.start();
		
		// TODO Auto-generated method stub

	}

}

