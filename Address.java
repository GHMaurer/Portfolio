
import java.util.Scanner; 
public class Address 
{ 
    public static void main(String[] args) 
    { 
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter name");
        String name = myObj.nextLine();
        
        System.out.println("Enter address");
        String address = myObj.nextLine();
        
        System.out.println("Enter city");
        String city = myObj.nextLine();
        
        System.out.println("Enter state");
        String state = myObj.nextLine();
        
        System.out.println("Enter zipcode");
        String zipcode = myObj.nextLine();
        
        System.out.println(name);
        System.out.println(address);
        System.out.print(city + ", ");
        System.out.print(state + " ");
        System.out.print(zipcode);
    }
}