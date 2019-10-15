public class Circle extends Shape{
    protected int radius;
    
    public Circle(int radius, int xCoordinate, int yCoordinate, String color, boolean filled){
        super(xCoordinate,yCoordinate,color,filled);
        this.radius = radius;
        shapeType = "Circle";
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public String toString(){
        String str = super.toString();
        str += "Radius: " + radius;
        str += "\nPosition: " + xCoordinate + ", " + yCoordinate;
        str += "\nFiled: " + filled;
        str += "\nColor: " + color;
        str += "\n====\n";
        return str;
    }

}