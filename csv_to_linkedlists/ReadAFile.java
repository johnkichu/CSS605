/*
 * Read in ordered pairs from csv and write it out to linked list
 * 
 * Assumes that each line of the csv file contains two integers separated by a comma (no text)
 * 
 * 
 */
package csv_to_linkedlists;

    import java.io.*;
    import java.util.LinkedList;

/**
 *
 * @author JPANG
 * 
 */

class ReadAFile {
    
    public static void main (String[] args) {
        try {
            File myFile = new File ("in_data.csv");                    //specify data file
            
            FileReader fileReader = new FileReader (myFile);
            BufferedReader reader = new BufferedReader (fileReader);
            
            String line = null;
            
            LinkedList<Point> point_list = new LinkedList<Point>();   //set up a liked lis to hold points

//            LinkedList<Integer> x_list = new LinkedList<Integer>();     //set up a linked list to hold x values
//            LinkedList<Integer> y_list = new LinkedList<Integer>();     //set up a linked list to hold y values
            
            while ((line = reader.readLine()) != null) {      //read in each line and parse it
 
                int offset = line.indexOf(",");
                int x = Integer.parseInt(line.substring(0,offset));      //get the x value
                int y = Integer.parseInt(line.substring(offset+1));      //get the y value
                
                point_list.add(new Point (x, y));

/*
 * 
 * Old code used in testing                
 *               
 *                x_list.add(x);                                           //store x value in x_list
 *                y_list.add(y);                                           //store y value in y_list
 * 
*/

                
/*
 * 
 * Following print statements for debugging purposes, only
 *
 *               System.out.println(line);
 *               System.out.println(x);
 *               System.out.println(y);
 * 
 */
            }
   
            reader.close();
            
/*  
 * Following print statements for debugging purposes, only
 *
 *           System.out.println(x_list);
 *           System.out.println(y_list);
 *
 */
            
            System.out.println(point_list);
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
 /*       
  *      Point a = new Point(10, 10);
  *      Point b = new Point(0, 0);
  *      
  *      float e_ab = a.eudistanceTo(b);
  *              
  *      System.out.println (e_ab);
  *
  *      float m_ab = a.mandistanceTo(b);
  *      
  *      System.out.println (m_ab);
  *
  */ 
   }
 
 
}
