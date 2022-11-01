package common.book;

import common.book.Note;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Book  {
    ArrayList<Note> phoneList = new ArrayList<>();

    public void createNote() {
        Note note = new Note();
        phoneList.add(note);
    }
    public void createNote(String firsName, String lastName, int number) {
        Note note = new Note(firsName, lastName, number);
        phoneList.add(note);
    }
    void deleteNote(Note note) {
        ;
    }
    //saveNote_in_file - зберігає БД в текстовому файлі phone.txt
    public  void data_writes_file() throws IOException {
        List<Note>notes = new ArrayList<>(phoneList);
        BufferedWriter writer = new BufferedWriter(new FileWriter("phone.txt"));
        for(Note note1: phoneList){
            String name1 = note1.getFirstName();
            String name2 = note1.getLastName();
            int numer = note1.getPhoneNumber();
            writer.write(name1 + " " + name2 + " " + numer + System.getProperty("line.separator"));
        }
        writer.close();
    }
    //data_load_file() - завантажує БД з текстового файлу phone.txt
    //виконує перевірку на наявність файла
    public static void data_load_file() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        File file = new File("phone.txt");
        if (file.exists()){
            BufferedReader reader = new BufferedReader(new FileReader(new File("phone.txt")));
            String act;
            while ((act=reader.readLine())!=null) {
                //String[] dat = act.split(" ");
                //list.add(dat[0], dat[1], dat[3]);
                list.add(act);
                System.out.println(list);

            }
            reader.close();
        }
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
    public static void getList(Book book) {
        for (int i = 0; i < book.showNotesQuantity(); i++){
            System.out.println(book.showNote(i));
        }
    };
}
