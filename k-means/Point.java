/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csv_to_linkedlists;

/**
 *
 * @author JPANG, with help from Patrick Dwyer
 */
public class Point {
    
    private int x;
    private int y;
    private int cent_id;             //keep track of which centroid this point belongs to
//    private Centroid c;              //keep track of which centroid this point belongs to
    private int stabilityFlag = 0;       //stability flag - will be set to 1 if a centroid assignment changes
    
    public Point (int x, int y, int cent_id, int stabilityFlag) {
        
        this.x = x;
        this.y = y;
        this.cent_id = cent_id;
        this.stabilityFlag = stabilityFlag;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCent_id() {
        return cent_id;
    }

    public void setCent_id(int cent_id) {
        this.cent_id = cent_id;
    }

    
//    public Centroid getCentroid() {
//        return c;
//    }

//    public void setCentroid(Centroid c) {
//        this.c = c;
//    }

    public int getStability() {
        return stabilityFlag;
    }

    public void setStability(int stabilityFlag) {
        this.stabilityFlag = stabilityFlag;
    }
    
    public float eudistanceTo (Centroid other) {
        int xa = this.x;
        int ya = this.y;
        
        float xb = other.getX();
        float yb = other.getY();
        
        return (float)Math.sqrt((xb - xa)*(xb - xa) + (yb - ya)*(yb - ya));
        
    }
    
    public float mandistanceTo (Centroid other) {
        int xa = this.x;
        int ya = this.y;
        
        float xb = other.getX();
        float yb = other.getY();
        
        return (float)(Math.abs(xb - xa) + Math.abs(yb - ya));
    }
    
    public String toString () {
        return "("+this.x+", "+this.y+", "+this.cent_id+", "+this.stabilityFlag+")";
    }
}
