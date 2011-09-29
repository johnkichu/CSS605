/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */
public class OT4TPlayer extends BasicPlayer {

    int oppLastMove=GameMove.COOPERATE;
    public OT4TPlayer() {
        myID="Optimistic T4T Player";
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
