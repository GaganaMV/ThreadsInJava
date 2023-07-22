package thread;

class Thread4 extends Thread{
	 public void run() {
		 for(int i=0;i<=5;i++) {
				
				System.out.println(i);
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
	 }
}
public class ThreadUsingSleep {

	public static void main(String[] args) {
		
		Thread4 t4=new Thread4();
		t4.start();
	}

}
