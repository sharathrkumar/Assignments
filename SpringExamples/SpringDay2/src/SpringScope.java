import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
class Bank
{
    private double amt;
    private String ac_num;
    private String name;


    public double getAmt() {
        return amt;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public String getAc_num() {
        return ac_num;
    }

    public void setAc_num(String ac_num) {
        this.ac_num = ac_num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "amt=" + amt +
                ", ac_num='" + ac_num + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SpringScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ae = new ClassPathXmlApplicationContext("bank.xml");
        Bank bank1 = (Bank)ae.getBean("bank1");
        bank1.setName("Sharath");
        bank1.setAmt(1878658.956);
        bank1.setAc_num("21455265");
        System.out.println(bank1.toString());

        Bank bank2 = (Bank) ae.getBean("bank1");
        //bank1.setAmt(1415231.1);
        //bank2.setAc_num("1451451");
        //bank2.setName("XYZ");
        System.out.println(bank2.toString());
    }


}
