package common.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import common.Book;

public class CreateBook {
    public static void NewBook() throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter new book name: ");
        Book phoneBook = new Book(reader.readLine());

    }
    //    phoneBook.createNote();
    //    phoneBook.createNote("Tobias", "Ripper", 202);
    //System.out.println(phoneBook.phoneList.size());
    //System.out.println(phoneBook.showNote(0));
    //System.out.println(phoneBook.showNote(1));
    //    OutputList.getList(phoneBook);
    //System.out.println(phoneBook.showNote(2));
}
