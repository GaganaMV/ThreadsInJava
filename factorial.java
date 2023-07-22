package thread;

class fact extends Thread{
	public void run() {
		int i,fact=1,n=5;  
		     
		  for(i=1;i<=n;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+n+" is: "+fact);   

	      }

	}

public class factorial {

	public static void main(String[] args) {
		fact f1=new fact();
		f1.start();

	}

}
