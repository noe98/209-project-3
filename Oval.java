public class Oval extends Circle{
    protected int radius2;

    public Oval(int radius, int radius2, int xCoordinate, int yCoordinate, String color, boolean filled){
        super(radius, xCoordinate, yCoordinate, color, filled);
        this.radius2 = radius2;
        shapeType = "Oval";
    }

    public int getRadius2(){
        return radius2;
    }

    public void setRadius2(int radius2){
        this.radius2 = radius2;
    }
}