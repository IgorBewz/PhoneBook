package common.menu;

import common.Book;

public class OutputList {
    public static void getList(Book book) {
        for (int i = 0; i < book.showNotesQuantity(); i++){
            System.out.println(book.showNote(i));
        }
    };
}
