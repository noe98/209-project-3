

public class Octagon extends Shape{
    private int[] xCoords;
    private int[] yCoords;
    private int width;
    private int height;



    // methods to find initial x coord, y coord, fill, 
    // and color have already been included in the class
    // this one inheirits from
    public Octagon(int width, int height, int xCoordinate, int yCoordinate, String color, boolean filled){
        super(xCoordinate, yCoordinate, color, filled);
        this.width = width;
        this.height = height;

        xCoords = new int[8];
        xCoords[0]= xCoordinate;
        xCoords[1]= xCoordinate + ((1/3) * width);
        xCoords[2]= xCoordinate + ((2/3) * width);
        xCoords[3] = xCoordinate + ((2/3) * width);
        xCoords[4] = xCoordinate + ((1/3) * width);;
        xCoords[5] = xCoordinate + width;
        xCoords[6] = xCoordinate - ((1/3) * width);;
        xCoords[7] = xCoordinate - ((1/3) * width);;
    
        yCoords = new int[8];
        yCoords[0]= yCoordinate;
        yCoords[1]=yCoordinate;
        yCoords[2]=yCoordinate - ((1/3)*height);
        yCoords[3] = yCoordinate - ((2/3)*height);
        yCoords[4]= yCoordinate - height;
        yCoords[5]= yCoordinate - height;
        yCoords[6]= yCoordinate - ((2/3)*height);
        yCoords[7]= yCoordinate - ((1/3)*height);
            
        shapeType = "Octagon";
    }

    public int getWidth(){
        return width;
    }
        
    public int getHeight(){
        return height;
    }

    public String toString(){
        String str = super.toString();
        str += "\nWidth: " + width;
        str += "\nHeight: " + height;
        str += "\nCoordinates: " + "(" +xCoords[0] + "," + yCoords[0] +")";
        str += ", (" + xCoords[1] + "," +yCoords[1] +")";
        str += ", (" + xCoords[2] + "," +yCoords[2] +")";
        str += ", (" + xCoords[3] + "," +yCoords[3] +")";
        str += ", (" + xCoords[4] + "," +yCoords[4] +")";
        str += ", (" + xCoords[5] + "," +yCoords[5] +")";
        str += ", (" + xCoords[6] + "," +yCoords[6] +")";
        str += ", (" + xCoords[7] + "," +yCoords[7] +")";
        str += "\nPosition: " + xCoordinate + ", " + yCoordinate;
        str += "\nFiled: " + filled;
        str += "\nColor: " + color;
        str += "\n";
        str += "\nSide 1: " + ((1/3) * width);
        str += "\nSide 2: " + Math.sqrt(pow((1/3) * height),2) + pow(((1/3) * width), 2);
        str += "\nSide 3: " + ((1/3) * height);
        str += "\nSide 3: " + ((1/3) * height);
        str += "\nSide 4: " + Math.sqrt(pow((1/3) * height),2) + pow(((1/3) * width), 2);
        str += "\nSide 5: " + ((1/3) * width);
        str += "\nSide 6: " + Math.sqrt(pow((1/3) * height),2) + pow(((1/3) * width), 2);
        str += "\nSide 7: " + ((1/3) * height);
        str += "\nSide 8: " + Math.sqrt(pow((1/3) * height),2) + pow(((1/3) * width), 2);
        str += "\nPerimeter: " + ((2 * width *(1/3)) + (2 * height * (1/3)) + (2 * Math.sqrt(pow((1/3) * height),2) + pow(((1/3) * width), 2)));
        str += "\n====";
        return str;
    }
}