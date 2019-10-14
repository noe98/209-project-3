abstract class Shape{
    protected boolean filled;
    protected String color; 
    protected String shapeType;
    protected Int xCoordinate;
    protected Int yCoordinate;

    public Shape(Int xCoordinate, Int yCoordinate, String color, boolean filled){
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

    public Int getXCoordinate(){
        return xCoordinate;
    }

    public Int getYCoordinate(){
        return yCoordinate;
    }
}