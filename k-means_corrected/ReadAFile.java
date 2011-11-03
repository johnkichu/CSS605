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
**/

class ReadAFile {
    
    public static void main (String[] args) {
        
        int k = 3;                                                     //number of means
        int global_stability = 1;                                      //flag for global stability
        
         LinkedList<Point> point_list = new LinkedList<Point>();       //set up a liked lis to hold points

/**
 * 
 *  Read in from csv file and create a linked list holding points
 *  Uses the example on page 454 of Head First Java as the starting point
 * 
**/         
         
        try {
            File myFile = new File ("in_data.csv");                       //specify data file
            
            FileReader fileReader = new FileReader (myFile);
            BufferedReader reader = new BufferedReader (fileReader);
            
            String line = null;
            
            while ((line = reader.readLine()) != null) {                 //read in each line and parse it
 
                int offset = line.indexOf(",");
                int x = Integer.parseInt(line.substring(0,offset));      //get the x value
                int y = Integer.parseInt(line.substring(offset+1));      //get the y value
                int cent_id = 99;                                        //bogus centroid
                int stabilityFlag = 99;                                      //bogus stability
                
                point_list.add(new Point (x, y, cent_id, stabilityFlag));


            }
   
            reader.close();
            
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
/**
 * 
 *   Select first three k points at set them to be the k initial centroids
 *   Since we're suppose to select the initial centroids randomly, this is as good as other methods 
 * 
**/
        
        
        LinkedList<Centroid> centroid_list = new LinkedList<Centroid>();       //set up a liked list to hold centroids

// while (global_stability == 1) {
        
        for (int i = 0; i<k; i++) {
                Centroid c = new Centroid (point_list.get(i).getX(), point_list.get(i).getY(), i);
                centroid_list.add(c);
        } 

        
//        System.out.println(point_list);
//        System.out.println("Intermediate Centroids:  "+centroid_list);
       


        
/**
 *
 *  Using the 3 centroids, calculate distances from each point and assign centroids to points 
 *  Uses euclidean distance (use mandistanceTo method if you want to use Manhattan distance
 *  This will repeat until no reassignments of centroids occur
 * 
**/
        
 while (global_stability == 1) { 
        
        for (Point p1 : point_list) { 
 //           Point p = point_list.get(i);
 //           System.out.println(p1);

                   
            float max_dist = Float.MAX_VALUE;                         //set initial value to something large
            int nearest_cent_id = -1;                                 //set initial value to something invalid
            
            
            for (Centroid c1 : centroid_list) {
 //               Centroid c = centroid_list.get(j);
                
                float distance_measure = p1.eudistanceTo(c1);          //using euclidean distance
  
                if (distance_measure < max_dist) {
                    max_dist = distance_measure;
                    nearest_cent_id = c1.getID();
                }
            }
            if (nearest_cent_id == p1.getCent_id()) {
                p1.setStability(0);
            } else {
                p1.setStability(1);
            }

            p1.setCent_id(nearest_cent_id);
                
//           System.out.println(point_list);
//           System.out.println(centroid_list);
//            System.out.println();
            
        }
        
/**
 * 
 * Calculate new coordinates for the centroids
 * Need to make this part dynamic with respect to k
 * 
 **/   
        float x_acc0 = 0;                          //initialize accumulator which will hold sum of x coordinate of points belonging to centroid 1                                          
        float y_acc0 = 0;                          //initialize accumulator which will hold sum of y coordinate of points belonging to centroid 1
        float c0_count = 0;                        //initialize counter for centroid 1
        float x_acc1 = 0;                          //initialize accumulator which will hold sum of x coordinate of points belonging to centroid 2
        float y_acc1 = 0;                          //initialize accumulator which will hold sum of y coordinate of points belonging to centroid 2
        float c1_count = 0;                        //initialize counter for centroid 2
        float x_acc2 = 0;                          //initialize accumulator which will hold sum of x coordinate of points belonging to centroid 3
        float y_acc2 = 0;                          //initialize accumulator which will hold sum of y coordinate of points belonging to centroid 3
        float c2_count = 0;                        //initialize counter for centroid 3
        
        
        for (Point p1 : point_list) { 
                if (p1.getCent_id() == 0) {
                    x_acc0 = x_acc0 + p1.getX();
                    y_acc0 = y_acc0 + p1.getY();
                    c0_count = c0_count + 1;
                } else if (p1.getCent_id() == 1) {
                    x_acc1 = x_acc1 + p1.getX();
                    y_acc1 = y_acc1 + p1.getY();
                    c1_count = c1_count + 1;
                } else  {
                    x_acc2 = x_acc2 + p1.getX();
                    y_acc2 = y_acc2 + p1.getY();
                    c2_count = c2_count + 1; 
                }
        }

       
/**
 * 
 * Assign new coordiantes to centroids
 * 
* */        
        float old_x0 = centroid_list.get(0).getX();
        float old_y0 = centroid_list.get(0).getY();
        float old_x1 = centroid_list.get(1).getX();
        float old_y1 = centroid_list.get(1).getY();
        float old_x2 = centroid_list.get(2).getX();
        float old_y2 = centroid_list.get(2).getY();

        
        float new_x0 = x_acc0/c0_count;
        float new_y0 = y_acc0/c0_count;
        float new_x1 = x_acc1/c1_count;
        float new_y1 = y_acc1/c1_count;
        float new_x2 = x_acc2/c2_count;
        float new_y2 = y_acc2/c2_count;
  
            
        
        
        centroid_list.get(0).setX(new_x0);
        centroid_list.get(0).setY(new_y0);
        centroid_list.get(1).setX(new_x1);
        centroid_list.get(1).setY(new_y1);
        centroid_list.get(2).setX(new_x2);
        centroid_list.get(2).setY(new_y2);
        
    System.out.println("Intermediate Centroids:  "+centroid_list);
    
        if ((old_x0 == new_x0)
                && (old_y0 == new_y0)
                && (old_x1 == new_x1)
                && (old_y1 == new_y1)
                && (old_x2 == new_x2)
                && (old_y2 == new_y2)) {                      //if nothing has changed, centroids are stable
            global_stability = 0;
        }
        
    }
        
        System.out.println("Ending Centroids:  "+centroid_list);

        
        
//        Point p = new Point (0,0);
//        Centroid c = new Centroid (1, 1, 0);
        
//        System.out.println (p.mandistanceTo(c));
//        System.out.println (p.eudistanceTo(c));
                
 
    }

 
}
