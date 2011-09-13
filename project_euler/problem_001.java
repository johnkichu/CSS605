/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_001;

/**
 *
 * @author JPANG
 */
public class problem_001 {
    public static void main(String[] args) {	
        System.out.println("Starting");
	int b1 = 3;  
	int b2 = 5;
	int x = 1;
	int accum = 0;
	int lim1 = 1000;
	
	for (int i = 1; i < lim1; i++) {
		if (i%b1 == 0) {
			accum = accum + i;   
		}
		else if (i%b2 ==0) {
			accum = accum + i;
		}
		x = x + 1;
	}
	System.out.println("Sum of Mulitples of 3 and 5 below 1000:  " + accum);
	}
    
}
