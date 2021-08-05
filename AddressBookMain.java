import java.util.*;
public class AddressBookMain{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        String firstName, lastName, address, city, state, phoneNo, email;
        long zip;
        System.out.print("Enter First Name  : ");  
        firstName = sc.nextLine(); 
        System.out.print("\nEnter Last Name  : ");  
        lastName = sc.nextLine();  
        System.out.print("\nEnter E-mail  : ");
        email = sc.nextLine();  
        AddressBook contact = new AddressBook(firstName, lastName, email);
        System.out.print("\nEnter Address  : ");  
        address = sc.nextLine(); 
        System.out.print("\nEnter City  : ");  
        city = sc.nextLine(); 
        System.out.print("\nEnter State  : ");  
        state = sc.nextLine();         
        System.out.print("\nEnter Phone Number  : ");   
        phoneNo = sc.nextLine(); 
        System.out.print("\nEnter Zip  : ");  
        zip = sc.nextLong(); 
        
        contact.setDetails(address, city, state, phoneNo,zip);
        contact.printValue();
        sc.close();
    }
}
