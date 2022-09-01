import java.util.Scanner;

interface Shape
{
    abstract void area();
}

class Rectangle implements Shape
{
    int len;
    int breadth;
    Rectangle(int len, int breadth)
    {
        this.len = len;
        this.breadth = breadth;
    }
    @Override
    public void area()
    {
        int area = len*breadth;
        System.out.println("Area of the Rectangle: "+area);
    }
}
class Triangle implements Shape
{
    int len;
    int breadth;
    Triangle(int len, int breadth)
    {
        this.len = len;
        this.breadth = breadth;
    }
    @Override
    public void area()
    {

        System.out.println("Area of Triangle: "+ 0.5 * len * breadth);
    }
}
class Factory
{
    public Shape getArea(String shape)
    {
        Scanner scanner = new Scanner(System.in);
        if (shape == null)
            return null;
        else if (shape.equalsIgnoreCase("rectangle")) {
            System.out.println("Enter the Length of Rectangle: ");
            int len = scanner.nextInt();
            System.out.println("Enter the breadth of Rectangle: ");
            int breadth = scanner.nextInt();
            return new Rectangle(len,breadth);
        }
        else if (shape.equalsIgnoreCase("triangle"))
        {
            System.out.println("Enter the Length of Triangle: ");
            int len = scanner.nextInt();
            System.out.println("Enter the breadth of Triangle: ");
            int breadth = scanner.nextInt();
            return new Triangle(len,breadth);
        }
        return null;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Factory f = new Factory();
        System.out.println("Enter the Shape Name: ");
        String shapeName = scan.next();
        Shape s = f.getArea(shapeName);
        s.area();
    }
}