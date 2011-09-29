/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */
public class CoopPlayer extends BasicPlayer {
    
public CoopPlayer() {
        myID="CoopPlayer";
    }
    public int makeMove() {
             return GameMove.COOPERATE;
        }


}
