package Book;

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
        ;
    }
    //Getters
    public String getNoteInfo() {
        return "\nFIRST NAME: " + this.firstName + "\tLAST NAME: " + this.lastName + "\tNUMBER: " + this.phoneNumber;
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