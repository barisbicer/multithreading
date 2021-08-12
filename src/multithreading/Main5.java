package multithreading;

public class Main5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				System.out.println("We are now thread Before**: "+Thread.currentThread().getName());
				
			}
		});
		
		System.out.println("We are in thread Before: "+Thread.currentThread().getName());
		
		thread.start();
		
		System.out.println("We are in thread After: "+Thread.currentThread().getName());

	}

}
