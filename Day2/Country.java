package Day2;
import java.util.*;
class CountryDetails
{
    ArrayList<String> countryName = new ArrayList<String>();
    ArrayList<String> capital = new ArrayList<String>();
    ArrayList<Double> population = new ArrayList<Double>();
    String coName;
    public void setCoName(String coName) {
        this.coName = coName;
    }
    public String getCoName() {
        return coName;
    }
    void addingCountries(){
    System.out.println("Enter the Number of Countries You Want to Add");
    Scanner scan = new Scanner(System.in);
    int noOfCountry = scan.nextInt();
    for(int i =0;i<noOfCountry;i++)
        {
            System.out.println("Enter the Name of the Country: ");
            countryName.add(scan.next());
            System.out.println("Enter the Capital Name: ");
            capital.add(scan.next());
            System.out.println("Enter the Country's Population: ");
            population.add(scan.nextDouble());
        }
        scan.close();
    }
    void capital(){
        int flag = 0;
        for(int i =0;i<countryName.size();i++)
        {
            
            if (this.coName.equals(countryName.get(i)))
            {
                System.out.println("Capital of the "+this.coName+" is "+capital.get(i));
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Country not found in the list");
        }
        
    }
    void maximun(){
        double maximum = population.get(0);
        String name = countryName.get(0);
        for (int i = 1;i<population.size();i++)
        {
            if (maximum<population.get(i))
            {
                maximum = population.get(i);
                name = countryName.get(i);
            }
        }
        System.out.println(name+ " having the highest Population of: "+ maximum );

    }   
}
    
class Country
{
    public static void main(String[] args) {
        CountryDetails cd = new CountryDetails();
        cd.addingCountries();
        System.out.println("Enter the Country Name: ");
        Scanner scan = new Scanner(System.in);
        cd.setCoName(scan.next());
        cd.capital();
        cd.maximun();
        scan.close();
    }
}