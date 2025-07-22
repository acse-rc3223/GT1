package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GT1Manager gt1Manager = new GT1Manager();
		
//		gt1Manager.runOneThread();
		gt1Manager.runManyThreads(4);
		
		System.exit(0);

	}

}
