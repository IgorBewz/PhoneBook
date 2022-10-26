import Book.Note;

import java.util.ArrayList;

public class Book {
    ArrayList<Note> phoneList = new ArrayList<Note>();

    void createNote() {
        Note note = new Note();
        phoneList.add(note);
    }
    void createNote(String firsName, String lastName, int number) {
        ;
    }
    void deleteNote(Note note) {
        ;
    }
    void editNote(Note note) {
        ;
    }
    String showNote(int noteNumber) {
        if(noteNumber + 1 <= phoneList.size()) {
            return phoneList.get(noteNumber).getNoteInfo();
        } else {
            return "Phone book is empty";
        }
    }
}
