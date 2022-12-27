package Classes;

public class Point {

    private int x;
    private int y;

    public Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    //this method calculates distance between two points (this point and a given point)
    public double countDistance(Point point) {
        double distance = Math.sqrt(Math.pow(point.getX() - this.x,2) + Math.pow(point.getY() - this.y,2));
        return distance;
    }

    @Override
    public String toString() {
        return "Point {" + "x = " + x + ", y = " + y + '}';
    }
}
