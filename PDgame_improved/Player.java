/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */
public interface Player {
   
    String getID();
    int makeMove();
    void setScore(int myMove, int oppMove, int myScore, int oppScore, String oppID);
    String toString();

}

