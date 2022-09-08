public class Demo {
    int id;
    String name;
    Demo(int id)
    {
        this.id = id;
    }
    Demo(String name)
    {
        this.name = name;
    }
    Demo(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    void display()
    {
        System.out.println("id: "+id+"\nName: "+name);
    }
}
