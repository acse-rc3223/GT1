package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1Manager {
	
	public void runOneThread() throws InterruptedException{
		
		// constructor for new instance
		GT1Thread gt1Thread = new GT1Thread();
		
		// start the thread which calls the run() extension
		gt1Thread.start();
		
		// let the thread run for some time
		//Thread.sleep(5000);
		
		// call the setter method for the exit
		gt1Thread.setExit();
		
		// need to allow the thread to finish before System.exit
		gt1Thread.join();
	}

}
