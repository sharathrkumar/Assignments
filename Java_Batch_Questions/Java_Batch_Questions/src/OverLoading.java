class Area
{
    void area(int len, int breadth)
    {
        System.out.println("Area of the Rectangle is: "+ len*breadth);
    }
    void area(int radius)
    {
        System.out.println("Area of the Circle is: "+ Math.PI*(radius*radius));
    }
}
public class OverLoading {
    public static void main(String[] args) {
        Area a1 = new Area();
        a1.area(2,4);
        a1.area(12);
    }
}
