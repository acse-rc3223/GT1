package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1SynchronisedData {
	private long myprotectedInt = 0;
	
	public synchronized void incrementMyValue(){
		// simply add 1
		myprotectedInt++;
		return;
	}
	public synchronized void decrementMyValue(){
		// simply subtract 1
		myprotectedInt--;
		return;
	}
	
	// create a getter method so that threads can see myprotectedInt
	public synchronized long getMyValue() {
		return myprotectedInt;
	}

}

