/**
 * 
 */
package JavaBooklet5;

/**
 * @author Richard
 *
 */
public class Homework1E4 {
		   //triangular number using n(n+1)/2
		   public static int triangular(int n)
		   {
		      if (n < 0) return -1;
		      return n*(n+1)/2;
		   } //end triangular
		   public static int fib(int n){ // Returns the nth fibbonacci number
			   if (n < 1) return 0;
			   else if (n < 3) return 1;
			   else {
				   int count = 2;
				   int fib = 1, fibn = 1, t;
				   while (count < n){
					   t = fibn;
					   fibn += fib; 
					   fib = t;
					   count++;
				   }
				   return fibn;
			   }
		   }
		   public static double apTerm(double a, double d, int n){
			   double res = a + (n-1)*d;
			   return res;
		   }
		   public static int apTerm(int a, int d, int n){
			   int res = a + (n-1)*d;
			   return res;
		   }
}
