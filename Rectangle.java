

public class Rectangle extends Shape{
    private int[] xCoords;
    private int[] yCoords;
    private int width;
    private int height;



    // methods to find initial x coord, y coord, fill, 
    // and color have already been included in the class
    // this one inheirits from
    public Rectangle(int width, int xCoordinate, int yCoordinate, String color, boolean filled){
        super(xCoordinate, yCoordinate, color, filled);
        int[] xCoords = new int[3];
        xCoords[0]= xCoordinate;
        xCoords[1]=xCoordinate + width;
        xCoords[2]=xCoordinate + width;
        xCoords[3] = xCoordinate;
    
        int[] yCoords = new int[3];
        yCoords[0]= yCoordinate;
        yCoords[1]=yCoordinate;
        yCoords[2]=yCoordinate + width;
        yCoords[3] = yCoordinate + width;
            
    }

    public int getWidth(){
        return width;
    }
        
    public int getHeight(){
        return height;
    }

    public String toString(){
        String str = super.toString();
        str += "==Rectangle==";
        str += "\nWidth: " + width;
        str += "\nHeight: " + height;
        str += "\nCoordinates: " + "(" +xCoords[0] + "," + yCoords[0] +")";
        str += ", (" + xCoords[1] + "," +yCoords[1] +")";
        str += ", (" + xCoords[2] + "," +yCoords[2] +")";
        str += ", (" + xCoords[3] + "," +yCoords[3] +")";
        str += "\nPosition: " + xCoordinate + ", " + yCoordinate;
        str += "\nFiled: " + filled;
        str += "\nColor: " + color;
        str += "\n";
        str += "\nSide 1: " + width;
        str += "\nSide 2: " + height;
        str += "\nSide 3: " + width;
        str += "\nSide 3: " + height;
        str += "\nPerimeter: " + 2 * width + 2 * height;
        str += "\n====";
        return str;
    }
}