package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1Manager {
	
	public void runOneThread() throws InterruptedException{
		
		// constructor for new instance
		GT1Thread gt1Thread = new GT1Thread();
		
		// start the thread which calls the run() extension
		gt1Thread.start();
		
		// let the thread run for some time, by sleeping the main thread
		//Thread.sleep(5000);
		
		// call the setter method for the exit
		gt1Thread.setExit();
		
		// need to allow the thread to finish before System.exit
		gt1Thread.join();
	}
	
	public void runManyThreads(int N_THREADS) throws InterruptedException{
		
		// create an array of the threads
		GT1Thread[] arrGT1Threads = new GT1Thread[N_THREADS];
		
		// create a for loop to initialise each thread and start it
		for (int i = 0; i < N_THREADS; i++) {
			
			// create each instance of the threads at index i
			arrGT1Threads[i] = new GT1Thread();
			
			// start each array object as we loop through
			arrGT1Threads[i].start();
			
			// sleep the main thread
			Thread.sleep(GT1Constants.THREAD_SLEEP_TIME);
			
			// once the thread has woken up we call the setExit() method
			arrGT1Threads[i].setExit();
			
			// need to allow the thread to finish before System.exit
			arrGT1Threads[i].join();
		}
	}
	

}
