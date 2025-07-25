package co.uk.diegesis.Rory.CorneliusSmith.GT1;

// extends Thread to inherit behaviour
public class GT1Thread extends Thread{
	
	/* volatile keyword ensures reading and writing 
	 * threads have the same value*/
	private volatile boolean isExiting = false;
	
	// record when we start to allow thread termination if setExit fails
//	private final long startTime = System.currentTimeMillis();
	
	// run() method overriding the Thread definition
	@Override
	public void run() {
		System.out.println(this.getName() + " thread has started.");
		
		while (!isExiting){
			
//			if (System.currentTimeMillis() - startTime > GT1Constants.MAX_THREAD_RUNTIME) {
//				System.out.println(this.getName() + " reached max runtime, exiting.");
//				// we want to exit the loop and terminate the thread if its run too long and setExit has failed
//				break;
//			}
			
			System.out.println(this.getName() + " thread is sleeping...");
            try {
            	Thread.sleep(GT1Constants.THREAD_SLEEP_TIME);
            }
            
            catch (InterruptedException e) {
				System.out.println(this.getName() + " thread has failed...");
			}
		}
		
		return;
	}

	// setExit() method to set isExisting to true
	public void setExit(boolean shouldExit) {
		// set as parameter instead of a hard code boolean
		this.isExiting = shouldExit;
		System.out.println(this.getName() + " thread is exiting.");
		return;
	}
	
}
