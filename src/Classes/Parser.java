package Classes;


//this class is used to parse something
public class Parser {
    public Point parsePoint(String str){  //this method gets line, finds coordinates and forms a new point
        String[] coordinates = new String[2];
        //an array to store coordinates, it is string as it consists of parts of string (line)
        coordinates[0] = ""; //at first coordinates are empty strings
        coordinates[1] = "";
        int j = 0; //index of a coordinates array
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) != ',' && str.charAt(i) != ' ' && str.charAt(i) != '.' && str.charAt(i) !='\n'){
                coordinates[j] += str.charAt(i);
            }
            else {
                if (!coordinates[j].equals("")){ //index will change if a coordinate is not empty
                    j++;
                }
            }
        }

        int x = Integer.parseInt(coordinates[0]); //parse string to double
        int y = Integer.parseInt(coordinates[1]);
        Point point = new Point(x,y);
        return point;
    }
}
