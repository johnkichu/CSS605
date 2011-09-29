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

public class RT4TPlayer extends BasicPlayer {

    Random r=new Random();
    int oppLastMove;
   
    public RT4TPlayer() {
        myID="Random T4T Player";
        
         if (r.nextFloat()>=0.5) {
            int oppLastMove = GameMove.DEFECT;
         } else {
            int oppLastMove = GameMove.COOPERATE;
         }
    
    }

    public int makeMove() {
        if (oppLastMove==GameMove.COOPERATE)
                return GameMove.COOPERATE;
        else
                return GameMove.DEFECT;
    }

    @Override
    public void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID) {
        oppLastMove=oppMove;
        super.setScore(myMove,oppMove,myScore,oppScore,oppID);
    }


}
