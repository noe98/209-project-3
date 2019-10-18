
public class PolygonTester{
    public static void main(String[] args) {
        Square testsquare = new Square(2, 2, 2, "black", true);
        System.out.println(testsquare);
        Rectangle r = new Rectangle(2,3,1,1,"BLACK",true);
        System.out.println(r);
        Triangle t = new Triangle(2,3,1,1,"BLACK", true);
        System.out.println(t);
        Octagon o = new Octagon(2, 2, 2, 2, "BLACK", true);
        System.out.println(o);
    }
}