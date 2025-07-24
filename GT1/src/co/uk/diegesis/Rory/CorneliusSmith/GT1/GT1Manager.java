package co.uk.diegesis.Rory.CorneliusSmith.GT1;

import java.util.ArrayList;
import java.util.List;

public class GT1Manager {
	
	public void runOneThread() throws InterruptedException{
		
		// constructor for new instance
		GT1Thread gt1Thread = new GT1Thread();
		
		// start the thread which calls the run() extension
		gt1Thread.start();
		
		// let the thread run for some time, by sleeping the main thread
		Thread.sleep(GT1Constants.MANAGER_WAIT_TIME);
		
		// call the setter method for the exit
		gt1Thread.setExit(true);
		
		// need to allow the thread to finish before System.exit
		gt1Thread.join();
		
		return;
	}
	
	public void runManyThreads(int N_THREADS) throws InterruptedException{
		
		// create an arrayList of the threads (changed from basic array)
		List<GT1Thread> threads = new ArrayList<>(N_THREADS);
		
		// create a for loop to initialise each thread and start it
		for (int i = 0; i < N_THREADS; i++) {
			// create each instance of the threads at index i
			GT1Thread gt1Thread = new GT1Thread();
			// add the new thread to the arrayList
			threads.add(gt1Thread);
		}
		
		for (GT1Thread gt1Thread : threads) {
			// start each array object as we loop through
			gt1Thread.start();
		}
			
		// sleep the main thread outside of initialisation for parallel thread running?
		Thread.sleep(GT1Constants.MANAGER_WAIT_TIME);
			
		// create a for loop to exit each thread
		for (GT1Thread gt1Thread : threads) {
			// once the thread has woken up we call the setExit() method
			gt1Thread.setExit(true);
		}
		
		// create a for loop to wait for all threads to die
		for (GT1Thread gt1Thread : threads) {
			// need to allow all the threads to finish and die before System.exit
			gt1Thread.join();
		}
		
		return;
	}
	

}
