/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package agents;
import risk.*;

/**
 *
 * @author JPANG
 */

 public class chameleon extends Agent {
     
     protected Agent role;
 
      public chameleon(int id, int type) {
        super(id, type);
        empireName = "chameleon";
        int my_id = this.getId();
        int my_type = this.getType();
        
         double flag1 = Math.random();
         
          if(flag1 < 1/14){
                Agent ruler = new IlBaro(my_id, my_type);
             }else if(flag1 < 2/14){
                Agent ruler = new Calvin(my_id, my_type);
            }else if(flag1 < 3/14){
                Agent ruler = new Catenaccio(my_id, my_type);
            }else if(flag1 < 4/14){
                Agent ruler = new ChuckNorris(my_id, my_type);
            }else if(flag1 < 5/14){
                Agent ruler = new ClarenceYourLord(my_id, my_type);
            }else if(flag1 < 6/14){
                Agent ruler = new Guevara(my_id, my_type);
            }else if(flag1 < 7/14){
                Agent ruler = new Livermore(my_id, my_type);
            }else if(flag1 < 8/14){
                Agent ruler = new SWMBO(my_id, my_type);
            }else if(flag1 < 9/14){
                Agent ruler = new TheNoncommittal(my_id, my_type);
            }else if(flag1 < 10/14){
                Agent ruler = new Kull(my_id, my_type);
            }else if(flag1 < 11/14){
                Agent ruler = new Borg(my_id, my_type);
            }else if(flag1 < 12/14){
                Agent ruler = new ItsGoodToBeTheKing(my_id, my_type);
            }else if(flag1 < 13/14){
                Agent ruler = new aMyYourLord(my_id, my_type);
            }else {
                Agent ruler = new KhanSerai(my_id, my_type);
            }
        
      }

     
              
//     public static void main (String[] args) {
      
     
//     double flag1 = Math.random();
     
     //  depending on the vlaue of flag1, chameleon will
     //  adopt a different identity
     
      
 //           if(flag1 < 1/7){
 //               Agent ruler = new Catenaccio(1, 1);
 //           }
 //           else if(flag1 < 2/7){
 //               Agent ruler = new ChuckNorris(2, 2);
 //           }else if(flag1 < 3/7){
 //               Agent ruler = new Guevara(3, 3);
 //           }else if(flag1 < 4/7){
 //               Agent ruler = new Borg(4, 4);
 //           }else if(flag1 < 5/7){
 //               Agent ruler = new ItsGoodToBeTheKing(5, 5);
 //           }else if(flag1 < 6/7){
 //               Agent ruler = new Calvin(6, 6);
 //           }else {
 //               Agent ruler = new SWMBO(7, 7);
 //           }
        
     
     
//     }
}
