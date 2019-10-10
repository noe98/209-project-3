abstract class Shape{
    private boolean filled;
    private String color; 
    private String shapeType;
    private Int xCoordinate;
    private Int yCoordinate;

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