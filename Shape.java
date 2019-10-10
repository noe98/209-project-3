abstract class Shape{
    private boolean filled;
    private String color; 
    private String shapeType;

    public String toString(){
        return "==" + getShapeType() + "==";
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
}