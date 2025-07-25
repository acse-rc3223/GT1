package co.uk.diegesis.Rory.CorneliusSmith.GT1;

// import the array list package
import java.util.ArrayList;
import java.util.List;

public class GT1Manager {
	
	public void runOneThread() {
		
		// constructor for new instance
		GT1Thread gt1Thread = new GT1Thread();
		
		// start the thread which calls the run() extension
		gt1Thread.start();
		
		// let the thread run for some time, by sleeping the main thread
		try {
			Thread.sleep(GT1Constants.MANAGER_WAIT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// call the setter method for the exit
		gt1Thread.setExit(true);
		
		// need to allow the thread to finish before System.exit
		try {
			gt1Thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("All threads stopped.");
		
		return;
	}
	
	public void runManyThreads(){
		
		// create an arrayList of the threads (changed from basic array)
		List<GT1Thread> threads = new ArrayList<>(GT1Constants.N_THREADS);
		
		// create a for loop to initialise each thread and start it
		for (int i = 0; i < GT1Constants.N_THREADS; i++) {
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
		try {
			Thread.sleep(GT1Constants.MANAGER_WAIT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		// create a for loop to exit each thread
		for (GT1Thread gt1Thread : threads) {
			// once the thread has woken up we call the setExit() method
			gt1Thread.setExit(true);
		}
		
		// create a for loop to wait for all threads to die
		for (GT1Thread gt1Thread : threads) {
			// need to allow all the threads to finish and die before System.exit
			// first check if the thread is alive
			if (gt1Thread.isAlive()) {
				try {
					gt1Thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("All threads stopped.");
		
		return;
	}
		
	
	public void runThreadsData() {
		
		// Needs updating to instantiate the threads with the new data constructor
		GT1SynchronisedData sharedData = new GT1SynchronisedData();
		
		// create an arrayList of the threads (changed from basic array)
		List<GT1Thread> threads = new ArrayList<>(GT1Constants.N_THREADS);
		
		// create a for loop to initialise each thread and start it
		for (int i = 0; i < GT1Constants.N_THREADS; i++) {
			// create each instance of the threads at index i
			GT1Thread gt1Thread = new GT1Thread();
			// use the setter to inject the data
			gt1Thread.setSharedData(sharedData);
			// add the new thread to the arrayList
			threads.add(gt1Thread);
		}
		
		for (GT1Thread gt1Thread : threads) {
			// start each array object as we loop through
			gt1Thread.start();
		}
			
		// sleep the main thread outside of initialisation for parallel thread running?
		try {
			Thread.sleep(GT1Constants.MANAGER_WAIT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
		// create a for loop to exit each thread
		for (GT1Thread gt1Thread : threads) {
			// once the thread has woken up we call the setExit() method
			gt1Thread.setExit(true);
		}
		
		// create a for loop to wait for all threads to die
		for (GT1Thread gt1Thread : threads) {
			// need to allow all the threads to finish and die before System.exit
			// first check if the thread is alive
			if (gt1Thread.isAlive()) {
				try {
					gt1Thread.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("All threads stopped.");
		
		return;
	}
	

}
