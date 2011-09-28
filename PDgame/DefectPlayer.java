/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */
public class DefectPlayer extends BasicPlayer {
  public DefectPlayer() {
        myID="DefectPlayer";
    }  
    public int makeMove() {
             return GameMove.DEFECT;
        }


}
