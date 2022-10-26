package common.book;

public class Note {
    //Fields
    private String firstName;
    private String lastName;
    private int phoneNumber;

    //Constructors
    public Note() {
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.phoneNumber = 0;
    }
    public Note(String firstName, String lastName, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(phoneNumber > 0) {
            this.phoneNumber = phoneNumber;
        } else this.phoneNumber = 0;
    }
    //Getters
    public String getNoteInfo() {
        return "----------------------------------------" +
                "\nFirst name: " + firstName.toUpperCase() + "\nLast name: " + this.lastName.toUpperCase() +
                "\nNumber: " + this.phoneNumber +
               "\n----------------------------------------";
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    //Setters
    public void setFirstName(String firstName) {
        ;
    }
    public void setLastName(String lastName) {
        ;
    }
    public void setPhoneNumber(int phoneNumber) {
        ;
    }
}