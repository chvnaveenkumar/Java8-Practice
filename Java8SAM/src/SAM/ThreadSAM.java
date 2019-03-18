package SAM;

public class ThreadSAM {

	public static void main(String args[]) {
		
		//General Method
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("In child thread ... ");
			}
		});
		t1.start();
		
		
		System.out.println("In main thread...");
		Runnable r1 = () ->{
			for(int i=0;i<=2;i++) {
				System.out.println("In child thread...");
			}
		};
		Thread t2 = new Thread(r1);
		t2.start();
		
		Thread t3 = new Thread(()-> {System.out.println("Thread 3 Executed!!");});
		t3.start();
	}
}
