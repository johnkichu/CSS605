package problem_002;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JPANG
 */
public class problem_002 {
    public static void main(String[] args) {
    int max_val = 4000000;
		int fib_val0 = 0;
		int fib_val1 = 1;
		int fib_val = 0;
		int accumulator = 0;
		
		while ((fib_val0 + fib_val1) < max_val) {
			fib_val = fib_val0 + fib_val1;
			fib_val0 = fib_val1;
			fib_val1 = fib_val;
			System.out.println("Sequence  " + fib_val);
			if (fib_val%2 == 0) {
				accumulator = accumulator + fib_val;
				System.out.println("Accumulator   " + accumulator);
			}
		}
	}
    
    
}
