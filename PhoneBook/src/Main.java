public class Main {
    public static void main(String[] args) {
        Book phoneBook = new Book();
        phoneBook.createNote();
        //phoneBook.createNote("Tobias", "Ripper", 202);
        System.out.println(phoneBook.showNote(0));
    }
}