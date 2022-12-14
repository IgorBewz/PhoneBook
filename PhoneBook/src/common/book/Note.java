package common.book;

public class Note {
    //Fields
    private int id;
    private String firstName;
    private String lastName;
    private int phoneNumber;

    //Constructors
    public Note() {
        this.id = 0;
        this.firstName = "Unknown";
        this.lastName = "Unknown";
        this.phoneNumber = 0;
    }
    public Note(int id, String firstName, String lastName, int phoneNumber) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
    }
    //Getters
    public Note getNote() {
        Note note = new Note();
        note.setId(this.id);
        note.setFirstName(this.firstName);
        note.setLastName(this.lastName);
        note.setPhoneNumber(this.phoneNumber);
        return note;
    }
    public String getNoteInfo() {
        return "----------------------------------------" +
                "\nID: " + id + "\nFirst name: " + firstName.toUpperCase() + "\nLast name: " + this.lastName.toUpperCase() +
                "\nNumber: " + this.phoneNumber +
               "\n----------------------------------------";
    }

    public int getId() {
        return id;
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

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !(firstName.equals(""))) {
            this.firstName = firstName;
        } else {
            this.firstName = "Unknown";
        }
    }
    public void setLastName(String lastName) {
        if (lastName != null && !(lastName.equals(""))) {
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