

public class Square extends Shape{
    private int[] xCoords;
    private int[] yCoords;
    private int width;



    // methods to find initial x coord, y coord, fill, 
    // and color have already been included in the class
    // this one inheirits from
    public Square(int width, int xCoordinate, int yCoordinate, String color, boolean filled){
        super(xCoordinate, yCoordinate, color, filled);
        this.width = width;

        xCoords = new int[4];
        xCoords[0]= xCoordinate;
        xCoords[1]=xCoordinate + width;
        xCoords[2]=xCoordinate + width;
        xCoords[3] = xCoordinate;
    
        yCoords = new int[4];
        yCoords[0]= yCoordinate;
        yCoords[1]=yCoordinate;
        yCoords[2]=yCoordinate + width;
        yCoords[3] = yCoordinate + width;
        
        shapeType = "Square";
    }

    public int getWidth(){
        return width;
    }
        
    public String toString(){
        String str = super.toString();
        str += "\nWidth: " + width;
        str += "\nCoordinates: " + "(" +xCoords[0] + "," + yCoords[0] +")";
        str += ", (" + xCoords[1] + "," +yCoords[1] +")";
        str += ", (" + xCoords[2] + "," +yCoords[2] +")";
        str += ", (" + xCoords[3] + "," +yCoords[3] +")";
        str += "\nPosition: " + xCoordinate + ", " + yCoordinate;
        str += "\nFiled: " + filled;
        str += "\nColor: " + color;
        str += "\n";
        str += "\nSide 1: " + width;
        str += "\nSide 2: " + width;
        str += "\nSide 3: " + width;
        str += "\nSide 4: " + width;
        str += "\nPerimeter: " + 4 * width;
        str += "\n====";
        return str;
    }
}