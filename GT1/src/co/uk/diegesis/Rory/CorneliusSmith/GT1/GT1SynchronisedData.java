package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1SynchronisedData {
	private long myprotectedInt = 0;
	
	public synchronized void incrementMyValue(){
		// simply add 1
		myprotectedInt++;
		// output to the console here to avoid concurrency issues
		System.out.println(Thread.currentThread().getName() + GT1Constants.THREAD_INCREMENT_STR + myprotectedInt);
		return;
	}
	public synchronized void decrementMyValue(){
		// simply subtract 1
		myprotectedInt--;
		// output to the console here to avoid concurrency issues
		System.out.println(Thread.currentThread().getName() + GT1Constants.THREAD_DECREMENT_STR + myprotectedInt);
		return;
	}

}

