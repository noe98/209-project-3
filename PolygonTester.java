
public class PolygonTester{
    public static void main(String[] args) {
        Square s = new Square(2,1,1,"GREEN",false);
        System.out.println(s);
        Rectangle r = new Rectangle(2,3,1,1,"PINK",true);
        System.out.println(r);
        Triangle t = new Triangle(2,3,1,1,"PURPLE",false);
        System.out.println(t);
        Octagon o = new Octagon(5,5,5,5, "YELLOW", true);
        System.out.println(o);
    }
}   