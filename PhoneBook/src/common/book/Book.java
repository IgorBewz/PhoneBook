package common.book;

import java.io.*;
import java.util.ArrayList;
public class Book  {
    ArrayList<Note> phoneList = new ArrayList<>();

    public void createNote(int id, String firsName, String lastName, int number) {
        Note note = new Note(id, firsName, lastName, number);
        phoneList.add(note);
    }
    public void deleteNote(int id) {
        phoneList.remove(id);
    }
    //saveNote_in_file - ������ �� � ���������� ���� phone.txt
    public  void data_writes_file(Book book) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("phone.txt"));
        Note note = new Note();
        for (int i = 0; i < book.showNotesQuantity(); i++){
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
    public void data_load_file() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("phone.txt");
        if (file.exists()){
            BufferedReader reader = new BufferedReader(new FileReader("phone.txt"));
            String act;
            while ((act=reader.readLine())!=null) {
                list.add(act);
            }
            reader.close();
        }
        int listCounter = 0;
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
    }

}
