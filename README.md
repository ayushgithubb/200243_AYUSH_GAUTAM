# 200243_AYUSH_GAUTAM
SNT PROJECT :: 6 LANGUAGES IN 6 WEEKS
*********************************************************
EXPLANATION OF THE CODE ::
---------------------------------------------------------

So we have to determine how fast our computer is. For this we have made a program.

Initial value of n is 0. Now the program will run a loop that will be executed for 1000 milliseconds.
We will use the concept of THREADING.I have used the java programming language.
'extends Thread" after class name means we will use threading.
So first,we find the system current time using the currentTimeMillis() function and store it in starTime variable.
In the main() function we will declare the thread object "test1" and gave it a start using start() function.
Finally,in the run() function we have done the iteration of the loop. We have subtracted value of starTime from the current system time the gives the running duration of loop and meanwhile we are incrementing n.
As the the reaches t=1000 milliseconds, we get exit from the loop and print the value if n just after 1 second.
This value changes every time we run the code depending upon various factors like internet speed etc. 

                                                           That's it !!
