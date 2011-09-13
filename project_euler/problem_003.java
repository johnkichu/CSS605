/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem_003;

/**
 *
 * @author JPANG
 */

import java.math.BigInteger;

public class problem_003 {
    
    public static void main(String[] args) {	
		
		long given_val = 600851475143l;
		long root_val = 0;
		long quot_val = 0;
		boolean ibi_flag;
		boolean iqv_flag;
		
		root_val = (int) Math.sqrt(given_val);
		
//      double root_val = Math.sqrt(given_val);
		
//		long root_val = given_val/2;
		
		for (int i = 2; i <= root_val; i++) {
			
			if (given_val%i == 0) {
				quot_val = given_val/i;
				BigInteger ibi = new BigInteger(""+i);
				BigInteger iqv = new BigInteger(""+quot_val);
				ibi_flag = ibi.isProbablePrime(1000);
				iqv_flag = iqv.isProbablePrime(1000);
				
				System.out.println("i =   " +i +"  Is Prime?  "+ibi_flag+"    Quotient =   "  +quot_val+"  Is Prime?  "+iqv_flag);
			}
			else {};
		}
	}	
    
}
