package Classes;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    private List<Point> points;
    private List<Side> sides;
    private double perimeter;
    private double longestSide;
    private double averageLength; //average length of the sides

    public Shape() {
        points = new ArrayList<Point>(); //initialization of a list of points
        sides = new ArrayList<Side>(); //initialization of a list of sides
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter(){
        double perimeter = 0;
        for (Side side:sides) {
            perimeter += side.getLength();
        }
        this.perimeter = perimeter; // set counted perimeter to an object perimeter
        return perimeter;
    }
    public double calculateTheLongestSide(){
        double longestSide = 0;
        for(Side side: sides) {
            if (side.getLength() > longestSide) {
                longestSide = side.getLength();
            }
        }
        this.longestSide = longestSide; // set counted longest side to an object field
        return longestSide;
    }
    public double calculateAverageLength(){
        double averageLength = 0;
        for(Side side: sides) {
            averageLength += side.getLength();
        }
        this.averageLength = averageLength / sides.size(); // set counted length to an object average length
        return this.averageLength;
    }


    public void calculateSides(){
    //this method calculates how many sides an object has
        if (points.size()>2){  //it works only is shape has more than 2 points
            // (because one or two points can't form a figure
            ArrayList<Side> newSides = new ArrayList<Side>();
            for(int i=1; i<points.size();i++){ //i = 1 as to calculate side there must be two points
                // (the point i and the previous one are taken at each iteration)
                Side side = new Side();
                side.addPoints(points.get(i-1));
                side.addPoints(points.get(i));
                side.calculateLength();
                newSides.add(side);
            }
            Side side = new Side(); //calculate the last side (the last point and the first)
            side.addPoints(points.get(points.size()-1)); //the last point
            side.addPoints(points.get(0)); //the first point
            side.calculateLength();
            newSides.add(side);
            sides = newSides; //// set resulted sides to an object sides
        }
    }

    @Override
    public String toString() {
        return "Shape {\n" +
                "perimeter = " + perimeter + "\n" +
                "longestSide = " + longestSide + "\n" +
                "averageLength = " + averageLength + '}';
    }
    //this method is used to improve the output
}
