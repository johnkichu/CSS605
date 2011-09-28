/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */
import java.util.Random;


/**
 *
 * @author maksim
 */
public class RandomPlayer extends BasicPlayer {
    
     public RandomPlayer() {
        myID="RandomPlayer";
    }
    public int makeMove() {
        Random r=new Random();
            if (r.nextFloat()>=0.5)
            return GameMove.DEFECT;
        else
            return GameMove.COOPERATE;
        }


}
