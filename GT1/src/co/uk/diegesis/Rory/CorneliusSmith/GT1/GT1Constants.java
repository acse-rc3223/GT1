package co.uk.diegesis.Rory.CorneliusSmith.GT1;

public class GT1Constants {
	public static final int N_THREADS           = 15;
	public static final int THREAD_SLEEP_TIME   = 1000;
	public static final long MANAGER_WAIT_TIME  = 5000;
//	public static final long MAX_THREAD_RUNTIME = 10_000;
	
	// logging string messages
	public static final String THREAD_STARTED_STR     = " thread has started.";
    public static final String THREAD_SLEEPING_STR    = " thread is sleeping...";
    public static final String THREAD_WAKING_STR      = " thread is waking up...";
    public static final String THREAD_INTERRUPTED_STR = " thread was interrupted.";
    public static final String THREAD_EXITING_STR     = " thread is exiting.";
    public static final String THREAD_FAILED_STR      = " thread has failed...";
    public static final String THREAD_INCREMENT_STR   = " incremented shared value to: ";
    public static final String THREAD_DECREMENT_STR   = " decremented shared value to: ";
    public static final String THREAD_STOP_STR        = "All threads stopped.";
}
