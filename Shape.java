abstract class Shape{
    protected boolean filled;
    protected String color; 
    protected String shapeType;
    protected int xCoordinate;
    protected int yCoordinate;

    public Shape(int xCoordinate, int yCoordinate, String color, boolean filled){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.color = color;
        this.filled = filled;
    }

    public String toString(){
        String str = "==" + getShapeType() + "==";
        str += "\nFilled: " + getFilled();
        str += "\nColor: " + getColor();
    }

    public boolean getFilled(){
        return filled;
    }

    public String getColor(){
        return color;
    }

    public String getShapeType(){
        return shapeType;
    }

    public int getXCoordinate(){
        return xCoordinate;
    }

    public int getYCoordinate(){
        return yCoordinate;
    }
}