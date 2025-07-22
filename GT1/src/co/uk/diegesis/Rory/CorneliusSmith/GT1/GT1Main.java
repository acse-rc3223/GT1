package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		GT1Thread gt1Thread = new GT1Thread();
		gt1Thread.start();
		
		// let the thread run for some time
		Thread.sleep(5000);
		
		// call the setter method for the exit
		gt1Thread.setExit();
		
		System.exit(0);

	}

}
