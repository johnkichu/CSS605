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
    
    public Point (int x, int y) {
        
        this.x = x;
        this.y = y;
        
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
    
    public float eudistanceTo (Point other) {
        int xa = this.x;
        int ya = this.y;
        
        int xb = other.getX();
        int yb = other.getY();
        
        return (float)Math.sqrt((xb - xa)*(xb - xa) + (yb - ya)*(yb - ya));
        
    }
    
    public float mandistanceTo (Point other) {
        int xa = this.x;
        int ya = this.y;
        
        int xb = other.getX();
        int yb = other.getY();
        
        return (float)(Math.abs(xb - xa) + Math.abs(yb - ya));
    }
    
    public String toString () {
        return "("+this.x+", "+this.y+")";
    }
}
