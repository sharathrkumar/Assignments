package Day3;

abstract class Shape
{
    abstract void area(int length , int breadth);
}

class Rectangle extends Shape{
    @Override
    public void area(int length ,int breadth)
    {
        System.out.println("Area of the Rectangle: "+length*breadth);
    }
}
class Triangle extends Shape
{
    @Override
    public void area(int length,int breadth) {
        System.out.println("Area of the Triangle: "+0.5*(length*breadth));
    }
}
public class Main {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.area(4,8);
        Shape s2 = new Triangle();
        s2.area(4,8);
    }
}