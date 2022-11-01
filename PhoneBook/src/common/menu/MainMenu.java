package common.menu;

import java.io.IOException;
import java.util.Scanner;

import common.book.Book;

import static common.book.Book.data_load_file;

public class MainMenu {
    public MainMenu() {
        Book book = new Book();
        //book.createNote("Tobias", "Ripper", 202);
        //book.createNote("Tomas", "Anderson", 404);
        //book.createNote();

        System.out.println("|----------------------------|");
        System.out.println("|----WELCOME TO PHONE BOOK---|");
        System.out.println("|----------------------------|");
        System.out.println("---------MAIN MENU------------");
        System.out.println("Type \"help\" to list a commands");
        String command = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("COMMAND: ");
            command = scanner.nextLine();
            switch (command) {
                case "create": {
                    System.out.println("----------CREATE A NOTE----------");
                    System.out.print("Enter a FIRST name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter a LAST name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter a phone NUMBER: ");
                    int number = scanner.nextInt();
                    book.createNote(firstName, lastName, number);
                    System.out.println("******************************");
                    System.out.println("Created note: ");
                    System.out.println(book.showNote(book.showNotesQuantity() - 1));
                    System.out.println("---------MAIN MENU------------");
                    command = scanner.nextLine();
                    break;
                }
                case "list": {
                    System.out.println("---------LIST OF NOTES---------");
                    book.getList(book);
                    break;
                }
                case "help": {
                    Help help = new Help();
                    break;
                }
                case "datafile":{
                    try {
                        book.data_writes_file();
                        System.out.println("Data writes to file");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "loadfile":{
                    try {
                        book.data_load_file();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "exit": {
                    break;
                }
                default:
                    System.out.println("ASSISTANT: Command not exist");
                    command = " ";
            }
        } while (!(command.equals("exit")));
    }
}
