package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1Main {

	public static void main(String[] args) {
		// create an instance of the manager on the main thread
		GT1Manager gt1Manager = new GT1Manager();
		
		// Uncomment chosen method below to run
		
		gt1Manager.runOneThread();
		gt1Manager.runManyThreads();
		gt1Manager.runThreadsData();
		
		System.exit(0);

	}

}
