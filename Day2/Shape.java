package Day2;

class Area {
    int len;
    int breadth;

    Area ( int i, int j)
    {
        len = i;
        breadth = j;
        
    }
    public double calcArea()
    {
       return 0;
    }
    
}
class Rectangle extends Area {
    Rectangle(int i ,int j)
    {
        super (i,j);
    }
    public double calcArea()
    {
        double a = len*breadth;
        return a;
    }
}
class Triangle extends Area {
    Triangle(int i , int j)
    {
        super (i,j);
    }
    public double calcArea()
    {
        double ar= len*breadth;
        return ar;
    }
}
class Shape {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(4,8); 
        System.out.println(r1.calcArea());
        Triangle t1 = new Triangle(4,8);
        System.out.println(t1.calcArea());
    }
}