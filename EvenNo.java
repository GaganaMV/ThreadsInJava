package thread;


class Even extends Thread{
	public void run() {
		
		
		System.out.println("Even number");
		for(int i=0;i<=20;i++) {
		if(i%2==0) {
			System.out.println(i);
			
		}
	}
}
}
public class EvenNo {

	public static void main(String[] args) {
		Even e=new Even();
		e.start();
	}

}
