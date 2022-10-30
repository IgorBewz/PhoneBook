package common;

import common.book.Note;

import java.util.ArrayList;

public class Book {
    private String bookName;
    public Book(String bookName) {
        this.bookName = bookName;
    }
    ArrayList<Note> phoneList = new ArrayList<>();

    void createNote() {
        Note note = new Note();
        phoneList.add(note);
    }
    void createNote(String firsName, String lastName, int number) {
        Note note = new Note(firsName, lastName, number);
        phoneList.add(note);
    }
    void deleteNote(Note note) {
        ;
    }
    void editNote(Note note) {
        ;
    }
    public String showNote(int noteNumber) {
        if(noteNumber + 1 <= phoneList.size()) {
            return phoneList.get(noteNumber).getNoteInfo();
        } else {
            return "Note doesn't exist";
        }
    }
    public int showNotesQuantity() {
        return phoneList.size();
    }
}
