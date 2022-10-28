package MyProject;

//* Клас Note містить поля абонента та конструктор
public class Note {
    private String firstname;//Прізвище абонента
    private String lastname;//Ім'я абонента
    private int number; //Телефоний номер
    Note(String firstname, String lastname, int number){ // Конструктор класу Note
        this.firstname = firstname;
        this.lastname = lastname;
        this.number = number;
    }
    @Override
    public String toString() { // Тимчасовий метод для налагодження роботи програми
        return "Прізвище " + firstname + ", Ім'я " + lastname +", номер "+ number;
    }
}
