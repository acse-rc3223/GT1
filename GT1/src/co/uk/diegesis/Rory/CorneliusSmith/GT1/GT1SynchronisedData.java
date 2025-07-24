package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1SynchronisedData {
	public volatile long myprotectedInt = 0;
	
	public synchronized void incrementMyValue(){
		// simply add 1
		myprotectedInt ++;
		return;
	}
	public synchronized void decrementMyValue(){
		// simply subtract 1
		myprotectedInt --;
		return;
	}

}

