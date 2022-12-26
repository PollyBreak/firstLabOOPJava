package Classes;

public class Point {

    private double x;
    private double y;

    public Point (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    //this method calculates distance between two points (this point and a given point)
    public double countDistance(Point point) {
        double distance = Math.sqrt(Math.pow(point.getX() - this.x,2) + Math.pow(point.getY() - this.y,2));
        return distance;
    }

}
