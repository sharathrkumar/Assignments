import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DriverClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("demo.xml");
        Demo d = (Demo) context.getBean("demo");
        d.display();
    }
}
