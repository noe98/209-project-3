

public class Square extends Shape{
    private int[] xCoords;
    private int[] yCoords;
    private int width;



    // methods to find initial x coord, y coord, fill, 
    // and color have already been included in the class
    // this one inheirits from
    public Square(int width, int xCoordinate, int yCoordinate, String color, boolean filled){
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

    public double getWidth(){
        return width;
    }

}