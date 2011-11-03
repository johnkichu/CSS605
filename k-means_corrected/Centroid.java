/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csv_to_linkedlists;

/**
 *
 * @author JPANG
 */
public class Centroid {
    
    private float x;
    private float y;
    private int c_id;
    
    public Centroid (float x, float y, int c_id) {
        
        this.x = x;
        this.y = y;
        this.c_id = c_id;
        
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getID() {
        return c_id;
    }
     public String toString () {
        return "("+this.x+", "+this.y+", "+this.c_id+")";
     }
}
