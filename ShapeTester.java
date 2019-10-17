public class ShapeTester{
    public static void main(String[] args) {
        Square s = new Square(2,1,1,"GREEN",false);
        System.out.println(s);
        Rectangle r = new Rectangle(2,3,1,1,"PINK",true);
        System.out.println(r);
        Triangle t = new Triangle(2,3,1,1,"PURPLE",false);
        Circle c = new Circle(3,1,1,"BLUE",true);
        System.out.println(c);
        Oval o = new Oval(3,2,1,1,"GREEN", false);
        System.out.println(o);
    }
}
