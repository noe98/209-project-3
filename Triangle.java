
public class Triangle extends Shape{
    private int[] xCoords;
    private int[] yCoords;
    private int width;
    private int height;



    // methods to find initial x coord, y coord, fill, 
    // and color have already been included in the class
    // this one inheirits from
    public Triangle(int width, int height, int xCoordinate, int yCoordinate, String color, boolean filled){
        super(xCoordinate, yCoordinate, color, filled);
        int[] xCoords = new int[2];
        xCoords[0]= xCoordinate + width/2;
        xCoords[1]=xCoordinate + width;
        xCoords[2]=xCoordinate;
    
        int[] yCoords = new int[2];
        yCoords[0]= yCoordinate;
        yCoords[1]=yCoordinate + height;
        yCoords[2]=yCoordinate + height;
    
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public String toString(){


        String str = super.toString();
        str += "Width: " + width;
        str += "\nHeight: " + height;
        str += "\nPosition: " + xCoordinate + ", " + yCoordinate;
        str += "\nFiled: " + filled;
        str += "\nColor: " + color;
        str += "\n"
        side = math.sqrt((width^2 + height^2));
        str += "\nSide 1: " + side;
        str += "\nSide 2: " + width;
        str += "\nSide 3: " + side;
        str += "\nPerimeter: " + side *2 + width;
     
    }
}