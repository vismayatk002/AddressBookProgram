public class AddressBook extends Contact{

    String address, city, state, phoneNo ;
    long zip;
    public AddressBook(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public void setDetails(String address, String city, String state, String phoneNo, long zip){

        this.address = address;
        this.city = city;
        this.state = state;
        this.phoneNo = phoneNo;
        this.zip = zip;
    }
    public void printValue(){

        System.out.println("\nFirst Name  : " + firstName  + "\nLast Name : " + lastName + "\nAddress : " + address + "\nCity : " + city + "\nState   : " + state + "\nZip    : " + zip + "\nPhone Number : " + phoneNo + "\nE-mail   : " + email); 
    }
}