package co.uk.diegesis.Rory.CorneliusSmith.GT1;

// import thread local random to avoid random seed issues with Random library
import java.util.concurrent.ThreadLocalRandom;

// extends Thread to inherit behaviour
public class GT1Thread extends Thread{
	
	/* volatile keyword ensures reading and writing 
	 * threads have the same value*/
	private volatile boolean isExiting = false;
	
	// record when we start to allow thread termination if setExit fails
	// private final long startTime = System.currentTimeMillis();
	
	// create field for the GT1SynchronisedData (starts as null)
	private GT1SynchronisedData sharedData;
	
	// setter to inject data if there is any provided to the manager method
	public void setSharedData(GT1SynchronisedData data) {
		this.sharedData = data;
	}		
	
	// run() method overriding the Thread definition
	@Override
	public void run() {
		System.out.println(this.getName() + GT1Constants.THREAD_STARTED_STR);
		
		while (!isExiting){
			
//			if (System.currentTimeMillis() - startTime > GT1Constants.MAX_THREAD_RUNTIME) {
//				System.out.println(this.getName() + " reached max runtime, exiting.");
//				// we want to exit the loop and terminate the thread if its run too long and setExit has failed
//				break;
//			}
			
			// check to see if there is any data
			if (sharedData != null) {
				// see if the random boolean create is true
				if (ThreadLocalRandom.current().nextBoolean()) {
					// if it is true increment the value
					sharedData.incrementMyValue();
				}
				else {
					// else decrement the value
					sharedData.decrementMyValue();
				}
			}			
			
			System.out.println(this.getName() + GT1Constants.THREAD_SLEEPING_STR);
            try {
            	Thread.sleep(GT1Constants.THREAD_SLEEP_TIME);
            	System.out.println(this.getName() + GT1Constants.THREAD_WAKING_STR);
            }
            
            catch (InterruptedException e) {
				System.out.println(this.getName() + GT1Constants.THREAD_INTERRUPTED_STR);
			}
		}
		
		System.out.println(getName() + GT1Constants.THREAD_EXITING_STR);
		
		return;
	}

	// setExit() method to set isExisting to true
	public void setExit(boolean shouldExit) {
		// set as parameter instead of a hard code boolean
		this.isExiting = shouldExit;
		return;
	}
	
}
