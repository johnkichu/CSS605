/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PDgame;

/**
 *
 * @author JPANG
 */
public class Judge {

    public Judge() {
    }
    
    
    public void playMatch(Player p1, Player p2, int rounds){

        p1Score = 0;
        p2Score = 0;
        //TODO: Add Scorekeeping

            
        for (int i=0;i<rounds;i++) { //i++ means i=i+1
            playRound(p1,p2);
        }
    System.out.println("Match Result >>     Player 1:  " + p1.getID() +"     Player 2:  " + p2.getID() +"   Player 1 Score:  " +p1Score +"   Player 2 Score:  "+ p2Score); 
    }

    int p1Score = 0;
    int p2Score = 0;
    
    public void playRound(Player p1, Player p2) {
        int m1=p1.makeMove();
        int m2=p2.makeMove();

        if (m1==0 && m2==0) {
            p1.setScore(m1, m2, 1, 1,p2.getID());
            p1Score+=1;
            p2.setScore(m2, m1, 1, 1,p1.getID());
            p2Score+=1;
        } else if (m1==0 && m2==1) {
            p1.setScore(m1, m2, 5, 0,p2.getID());//you can modify payoff here - 5 or 12
            p1Score+=5;
            p2.setScore(m2, m1, 0, 5,p1.getID());
        } else if (m1==1 && m2==0) {
            p1.setScore(m1, m2, 0, 5,p2.getID());
            p2.setScore(m2, m1, 5, 0,p1.getID());
            p2Score+=5;
        } else if (m1==1 && m2==1) {
            p1.setScore(m1, m2, 3,3,p2.getID());
            p1Score+=3;
            p2.setScore(m2, m1, 3,3,p1.getID());
            p2Score+=3;
        }

    }
 

}
