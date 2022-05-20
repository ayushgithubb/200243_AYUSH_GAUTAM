/*
 *
 * Following program will print the value of n after 1 sec using Threading(Single thread)
 */
public class SingleThread extends Thread {                                  // using threading

	private long n = 0;
	private long starTime = System.currentTimeMillis();                 // current system time in milliseconds

	public static void main(String[] args) {                            

		SingleThread test1 = new SingleThread();                   // creating thread object test1
		test1.start();                                             // starting the thread
		
	}

	public void run() {
                // here we will do the iteration of loop
		while (System.currentTimeMillis() - starTime <= 1000) {    // subtracting the system time from time at instant of start of loop 
			n++;
		}

		System.out.println(n);                                     // value of n after 1 sec
	}
}
