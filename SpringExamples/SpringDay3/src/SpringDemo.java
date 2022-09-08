import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Demo
{
    @Autowired
    Demo()
    {
        System.out.println("Displaying inside Demo");
    }
    void display()
    {
        System.out.println("Inside display method.....");
    }

    public void init()
    {
        System.out.println("programming has been Initialized.");
    }
    public void destroy()
    {
        System.out.println("Programm has been Executed and about to destroy");
    }
}
class Demo2
{
    Demo demo;
    public Demo2(Demo demo) {
        this.demo = demo;
    }
    public void show()
    {
        System.out.println("Displaying inside Demo2");
        demo.display();
    }
}
public class SpringDemo {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("exercise.xml");
//        Demo2 demo2 = (Demo2) context.getBean("demo2");
//        demo2.show();

        ApplicationContext context = new AnnotationConfigApplicationContext(exercise.class);
        Demo2 demo2 = context.getBean(Demo2.class);
        demo2.show();

        Demo2 demo = context.getBean(Demo2.class);
        demo.show();
    }
}
