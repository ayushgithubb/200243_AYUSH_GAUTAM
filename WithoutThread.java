/*
 * 
 * Following program will print the value of n after 1 sec without using threading 
*/
public class WithoutThread {

	public static void main(String[] args) {
		long n = 0;                                              
		long starTime = System.currentTimeMillis();                      // current system time in milliseconds
		while (System.currentTimeMillis() - starTime <= 1000) {          // subtracting the system time from time at instant of start of loop 
			n++;                                                     // incrementing n for a duration of 1000 millisecond
		}

		System.out.println(n);                                           // value of n after 1 second

	}

}