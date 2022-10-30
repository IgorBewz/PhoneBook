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
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
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
        if (firstName != null && firstName != "") {
            this.firstName = firstName;
        } else {
            this.firstName = "Unknown";
        }
    }
    public void setLastName(String lastName) {
        if (lastName != null && lastName != "") {
            this.lastName = lastName;
        } else {
            this.lastName = "Unknown";
        }
    }
    public void setPhoneNumber(int phoneNumber) {
        if(phoneNumber > 0) {
            this.phoneNumber = phoneNumber;
        } else {
            this.phoneNumber = 0;
        }
    }
}