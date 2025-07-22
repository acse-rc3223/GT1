package co.uk.diegesis.Rory.CorneliusSmith.GT1;

// extends Thread to inherit behaviour
public class GT1Thread extends Thread{
	private boolean isExiting = false;
	private long threadSleepTime = 1000;
	
//	run() method
	public void run() {
		System.out.println(getName() + " thread has started.");
		
		while (!isExiting){
			System.out.println(getName() + " thread is sleeping...");
            try {
				Thread.sleep(threadSleepTime);
			} 
            
            catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " thread is exiting.");
		
	}

//	setExit() method to set isExisting to true
	public void setExit() {
		isExiting = true;
	}
	
}
