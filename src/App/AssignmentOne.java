package App;

import Classes.Shape;
import Classes.ShapeCreator;

import java.io.File;
import java.io.FileNotFoundException;

public class AssignmentOne {
    public static void main(String[] args) throws FileNotFoundException{
        File file1 = new File("resources/file1.txt");
        ShapeCreator shapeCreator = new ShapeCreator(); //this object is responsible for creating shapes
        Shape shape1 = shapeCreator.createShapeFromFile(file1); //creating a shape from file
        File file2 = new File("resources/file2.txt");
        Shape shape2 = shapeCreator.createShapeFromFile(file2);

        shape1.calculatePerimeter();
        shape1.calculateTheLongestSide();
        shape1.calculateAverageLength();
        shape2.calculatePerimeter();
        shape2.calculateTheLongestSide();
        shape2.calculateAverageLength();

        System.out.println("Information about the first shape(file1):\n" + shape1);
        System.out.println();
        System.out.println("Information about the second shape(file2):\n" + shape2);
    }
}
