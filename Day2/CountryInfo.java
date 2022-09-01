package Day2;
import java.util.Scanner;
class CountryDetails
{
    String countryName;
    String capitalName;
    long population;
    Scanner sc = new Scanner(System.in);

    void getCountryInfo(CountryDetails[] country)
    {
        for(int i = 0;i<4;i++)
        {
        System.out.println("Enter the Country Name: ");
        country[i].countryName = sc.next();
        System.out.println("Enter the Capital Name: ");
        country[i].capitalName = sc.next();
        System.out.println("Enter the Population: ");
        country[i].population = sc.nextLong();
        }
        
    }
}
class CountryInfo{
    public static void main(String[] args) {
        CountryDetails[] country = new CountryDetails[4];
        CountryDetails cd = new CountryDetails();
        cd.getCountryInfo(country);
    }
}