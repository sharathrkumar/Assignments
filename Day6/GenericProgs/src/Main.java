class Addition<T>
{
    T firstElement;
    T secondElement;
    Addition(T firstElement,T secondElement)
    {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }
     public void display(){
         System.out.println(firstElement+" "+secondElement);


}
}
public class Main {
    public static void main(String[] args) {
        Addition<Integer> Obj1= new Addition<Integer>(25,32);
        Addition<Float> Obj2 = new Addition<Float>(2.5F,92.5F);
        Addition<String> Obj3 = new Addition<String>("Hello","World!");

        Obj1.display();
        Obj2.display();
        Obj3.display();
    }
}