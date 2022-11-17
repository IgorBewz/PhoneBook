package common.book;

import java.io.*;
import java.util.ArrayList;
import java.lang.Thread;
public class Book {
    ArrayList<Note> phoneList = new ArrayList<>();

    public void createNote(int id, String firsName, String lastName, int number) {
        Note note = new Note(id, firsName, lastName, number);
        phoneList.add(note);
    }

    public void deleteNote(int id) {
        phoneList.remove(id);
    }

    //saveNote_in_file - ������ �� � ���������� ���� phone.txt
    public void data_writes_file(Book book) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("phone.txt"));
        Note note;
        for (int i = 0; i < book.showNotesQuantity(); i++) {
            note = book.phoneList.get(i);
            writer.write(Integer.toString(note.getId()));
            writer.newLine();
            writer.write(note.getFirstName());
            writer.newLine();
            writer.write(note.getLastName());
            writer.newLine();
            writer.write(Integer.toString(note.getPhoneNumber()));
            writer.newLine();
        }
        writer.close();
    }

    //data_load_file() - ��������� �� � ���������� ����� phone.txt
    //������ �������� �� �������� �����
    public void data_load_file() throws IOException, InterruptedException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("phone.txt");
        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader("phone.txt"));
            String act;
            while ((act = reader.readLine()) != null) {
                list.add(act);
            }
            reader.close();
        }
        int listCounter = 0;
        phoneList.clear();
        while (listCounter < list.size()) {
            Note note = new Note();
            if (listCounter < list.size()) {
                note.setId(Integer.parseInt(list.get(listCounter)));
                listCounter++;
            }
            if (listCounter < list.size()) {
                note.setFirstName(list.get(listCounter));
                listCounter++;
            }
            if (listCounter < list.size()) {
                note.setLastName(list.get(listCounter));
                listCounter++;
            }
            if (listCounter < list.size()) {
                note.setPhoneNumber(Integer.parseInt(list.get(listCounter)));
                listCounter++;
            }
            phoneList.add(note);
        }
        System.out.println("Loading from file complete.");
        Thread.sleep(1000);
    }

    public String showNote(int noteNumber) {
        if (noteNumber + 1 <= phoneList.size()) {
            return phoneList.get(noteNumber).getNoteInfo();
        } else {
            return "Note doesn't exist";
        }
    }

    public void findContact(String findValue) throws InterruptedException {
        findValue.toUpperCase();
        Note note = new Note();
        int counter = 0;
        for (int i = 0; i < phoneList.size(); i++) {
            note = phoneList.get(i);
            if ((findValue.equals(note.getFirstName().toUpperCase())) || (findValue.equals(note.getLastName().toUpperCase())) || (Integer.toString(note.getPhoneNumber()).equals(findValue))) {
                System.out.println(note.getNoteInfo());
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Such contact not found.");
            Thread.sleep(1000);
        }
    }
    public boolean findContactByID (int id) {
       Note note = new Note();
       int counter = 0;
        for (int i = 0; i < phoneList.size(); i++) {
            note = phoneList.get(i);
            if (note.getId() == id) {
                counter++;
            }
        }
        if (counter > 0) return true;
        else return false;
    }
    public void editContact(int id) {
        ;
    }
    public int showNotesQuantity() {
        return phoneList.size();
    }

    public static void getList(Book book) {
        for (int i = 0; i < book.showNotesQuantity(); i++) {
            System.out.println(book.showNote(i));
        }
    }

    public void editFirstName (int id, String firstName) {
        Note note = new Note();
        for (int i = 0; i < phoneList.size(); i++) {
            note = phoneList.get(i);
            if (note.getId() == id) {
                note.setFirstName(firstName);
                phoneList.set(i, note);
            }
        }
    }
    public void editLastName(int id, String lastName) {
        Note note = new Note();
        for (int i = 0; i < phoneList.size(); i++) {
            note = phoneList.get(i);
            if (note.getId() == id) {
                note.setLastName(lastName);
                phoneList.set(i, note);
            }
        }
    }
    public void editNumber (int id, int number) {
        Note note = new Note();
        for (int i = 0; i < phoneList.size(); i++) {
            note = phoneList.get(i);
            if (note.getId() == id) {
                note.setPhoneNumber(number);
                phoneList.set(i, note);
            }
        }
        ;
    }
}