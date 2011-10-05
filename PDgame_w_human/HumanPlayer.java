/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */

   import java.util.Scanner;

public class HumanPlayer extends BasicPlayer {
    
    public HumanPlayer() {
        setID("HumanPlayer");
    }

        public int makeMove() {
        
            Scanner input=new Scanner(System.in);      // Decl. & init. a Scanner
            System.out.println("");
            System.out.print("Enter your move (1 = Defect/0 = Cooperate) >");  
            int HumanMove = Integer.parseInt(input.nextLine());
            
            
            if (HumanMove==1)
            return GameMove.DEFECT;
        else
            return GameMove.COOPERATE;
        }

    


}