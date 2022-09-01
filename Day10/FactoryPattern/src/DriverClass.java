import java.util.Locale;
import java.util.Scanner;

enum carType{SMALL, SEDEN, LUXURY}

class Car
{
    carType model;
    Car(carType model)
    {
        this.model = model;
    }
    public carType getModel() {
        return model;
    }
}

class SmallCar extends Car
{
    SmallCar(carType model) {
        super(model);
    }
}
class SedenCar extends Car
{
    SedenCar(carType model) {
        super(model);
    }
}

class LuxuryCar extends Car
{
    LuxuryCar(carType model) {
        super(model);
    }
}

class CarFactory
{
    Car buildCar(carType model) {
        switch (model) //switching over the enums
        {
            case SMALL:
                return new SmallCar(model);
            case SEDEN:
                return new SedenCar(model);
            case LUXURY:
                return new LuxuryCar(model);
        }
        return null;
    }
}
public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Car Model: ");
        String car = sc.next().toUpperCase();
        try {
            carType model = carType.valueOf(car);
            CarFactory cf = new CarFactory();
            Car c = cf.buildCar(model);
            System.out.println("Car Type: " + c.getModel());
        }
        catch (Exception e)
        {
            System.out.println("Invalid Model.");
        }
    }
}
