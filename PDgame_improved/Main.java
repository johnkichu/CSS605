/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

import java.util.ArrayList;

/**
 *
 * @author maksim
 * 
 * modified by John Pang
 */
public class Main {

    ArrayList<Player> players;

    public void setupTournament() {
        players=new ArrayList<Player>();
        players.add(new RandomPlayer());
        players.add(new OT4TPlayer());
        players.add(new PT4TPlayer());
        players.add(new RT4TPlayer());
        players.add(new CoopPlayer());
        players.add(new DefectPlayer());
        players.add(new RandomPlayer());
        players.add(new OT4TPlayer());
        players.add(new PT4TPlayer());
        players.add(new RT4TPlayer());
        players.add(new CoopPlayer());
        players.add(new DefectPlayer());
    }

    public void roundRobin() {
        Judge dredd=new Judge();
        for (Player p1: players) {
            for (Player p2: players) {
                if (p1==p2) continue;

                dredd.playMatch(p1, p2, 100);           //play 100 rounds
            }
        }
    }

    public void printResults() {
        System.out.println("RESULTS>>>>>>>");
        for (Player p : players) {
            System.out.println(p.toString());
        }
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main foo=new Main();

        foo.setupTournament();
        foo.roundRobin();
        foo.printResults();


    }







}
