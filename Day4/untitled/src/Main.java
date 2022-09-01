abstract class Interest
{
    abstract void bankName();
    abstract void rateOFInterest();
}

class SBI extends Interest{
    @Override
    void bankName() {
        System.out.println("Name of the Bank: State Bank of India");
    }

    @Override
    void rateOFInterest() {
        System.out.println("Rate of the Interest is 4.5%");
    }
}

class HDFC extends Interest{
    @Override
    void bankName() {
        System.out.println("Name of the Bank: HDFC Bank");
    }

    @Override
    void rateOFInterest() {
        System.out.println("Rate of the Interest is 4.7%");
    }
}

class Axis extends Interest{
    @Override
    void bankName() {
        System.out.println("Name of the Bank: Axis Bank");
    }

    @Override
    void rateOFInterest() {
        System.out.println("Rate of the Interest is 4%");
    }
}
public class Main {
    static void display(Interest ref)
{
    Interest i ;
    i = ref;
    i.bankName(); i.rateOFInterest();
}
    public static void main(String[] args) {

        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();
        Axis ax = new Axis();

        display(sbi);
        display(hdfc);
        display(ax);
    }
}