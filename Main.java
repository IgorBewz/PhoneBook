package common;

import common.menu.OutputList;

public class Main {
    public static void main(String[] args) {
        Book phoneBook = new Book();
        phoneBook.createNote();
        phoneBook.createNote("Tobias", "Ripper", 202);
        //System.out.println(phoneBook.phoneList.size());
        //System.out.println(phoneBook.showNote(0));
        //System.out.println(phoneBook.showNote(1));
        OutputList.getList(phoneBook);
        //System.out.println(phoneBook.showNote(2));
    }
}