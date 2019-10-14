public class Circle extends Shape{
    private Int radius;
    
    public Circle(double radius, int xCoordinate, int yCoordinate, String color, boolean filled){
        super(xCoordinate,yCoordinate,color,filled);
        this.radius = radius;
        shapeType = "Circle";
    }

    public Int getRadius(){
        return radius;
    }

    public void setRadius(Int radius){
        this.radius = radius;
    }

}