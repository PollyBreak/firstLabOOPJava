package Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//this class is needed to create shapes from different sources
public class ShapeCreator {
    public Shape createShapeFromFile(File file) throws FileNotFoundException{ //this method reads a file, find points in it and create a shape
        Shape shape = new Shape();
        Parser parser = new Parser();
        Scanner scanner = new Scanner(file); // a scanner constructor with a file argument throws FileNotFoundException
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Point point = parser.parsePoint(line); //parsePoint checks line, find coordinates and create a point
            shape.addPoint(point);
        }
        shape.calculateSides(); //after all points were added, the method calculates sides of the shape
        return shape;
    }
}
