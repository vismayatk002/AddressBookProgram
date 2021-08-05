public class AddressBook{

    String firstName, lastName, address, city, state, phoneNo, email;
    long zip;
    public void setDetails(){

        firstName = "Vismaya";
        lastName = "T K";
        address = "House 3";
        city ="Calicut";
        state = "Kerala";
        zip = 564732;
        phoneNo = "9587879600";
        email = "vismayatk002@gmail.com";
    }
    public void printValue(){

        System.out.println("First Nmae : " + firstName  + "\nLast Name : " + lastName + "\nAddress : " + address + "\nCity : " + city + "\nState : " + state + "\nZip : " + zip + "\nPhone Number : " + phoneNo + "\nE-mail : " + email); 
    }
}