package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1Main {

	public static void main(String[] args) throws InterruptedException {
		// create an instance of the manager on the main thread
		GT1Manager gt1Manager = new GT1Manager();
		
//		gt1Manager.runOneThread();
		gt1Manager.runManyThreads();
//		gt1Manager.runThreadsData();
		
		System.exit(0);

	}

}
