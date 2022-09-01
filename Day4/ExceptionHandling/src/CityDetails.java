import java.util.*;
class City
{
    String cityName;

    public String setCityName(String cityName) {
        this.cityName = cityName;
        return cityName;
    }
    public String getCityName() {
        return cityName;
    }
    @Override
    public String toString() {
        return cityName;
    }
}
class State extends City
{
    Scanner sc = new Scanner(System.in);
    ArrayList<String> getCities = new ArrayList<String>();
    String stateName;

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    void setState()
    {
        System.out.println("How many Cities you want to add?");
        int noOfCities = sc.nextInt();
        for(int i = 0;i<noOfCities;i++) {
            System.out.println("Enter the "+(i+1)+" City Name:");
        getCities.add(setCityName(sc.next()));
        }
    }

}

public class CityDetails {
    public static void main(String[] args) {
        State s = new State();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the State Name: ");
        s.setStateName(sc.next());
        System.out.println("Enter the City Name: ");
        s.setCityName(sc.next());
        System.out.println("State Name: "+s.getStateName());
        System.out.println("City Name:" +s.getCityName());
        s.setState();
        System.out.println(s.getStateName()+" has the following Cities");
        for(String cityName: s.getCities)
            System.out.println(cityName);
        }
    }
