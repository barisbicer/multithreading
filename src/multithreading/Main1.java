package multithreading;

public class Main1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread =new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				throw new RuntimeException("this is a error");
				
			}
		});
		
	
		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
			
				System.out.println("A critical error in therad"+ t.getName()+" the error is "+e.getMessage());
				
			}
		});
		
		thread.start();
		
	

	}
	
	

}
