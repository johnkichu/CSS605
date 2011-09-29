/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */
public interface RuleSet {

	int[] getScores(Player p1, Player p2, int moveP1, int moveP2);
	String getName();

}