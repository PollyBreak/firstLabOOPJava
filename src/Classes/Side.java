package Classes;

import java.util.ArrayList;
import java.util.List;

//this class describes a side of a shape
public class Side {
    private List<Point> points;  //every side has points
    private double length;
    public Side(){
        points = new ArrayList<Point>(); //initialization of a list of points
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void addPoints(Point point){
        points.add(point);
    }
    public double getLength() {
        return length;
    }

    /*
    public List<Point> getPoints() {
        return points;
    }
    */
    public void calculateLength(){  //this method calculates a side length
        if (points.size() > 1){ //every side must have at least two points
            length = points.get(0).countDistance(points.get(points.size()-1));
            //double x1 = points.get(0).getX();
            //double x2 = points.get(points.size()-1).getX();
            //double y1 = points.get(0).getY();
            //double y2 = points.get(points.size()-1).getY();
            //length = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        }
        else {
            length = 0;
        }
    }
}
