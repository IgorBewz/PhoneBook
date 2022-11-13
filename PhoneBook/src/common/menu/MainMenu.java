package common.menu;

import java.io.IOException;
import java.util.Scanner;

import common.book.Book;

public class MainMenu {
    public MainMenu() {
        Book book = new Book();
        System.out.println("|----------------------------|");
        System.out.println("|----WELCOME TO PHONE BOOK---|");
        System.out.println("|----------------------------|");
        System.out.println("---------MAIN MENU------------");
        System.out.println("Type \"help\" to list a commands");
        String command;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("help | create | list | save | load | delete | exit  ");
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
                    book.createNote(book.showNotesQuantity() + 1, firstName, lastName, number);
                    System.out.println("******************************");
                    System.out.println("Created note: ");
                    System.out.println(book.showNote(book.showNotesQuantity() - 1));
                    System.out.println("---------MAIN MENU------------");
                    command = scanner.nextLine();
                    break;
                }
                case "delete": {
                    System.out.print("Enter subscriber's ID, that you want to delete: ");
                    int id = scanner.nextInt();
                    if((id < 1) || (id > book.showNotesQuantity())) {
                        System.out.println("Subscriber with this ID doesn't exist.");
                    } else {
                        book.deleteNote(id - 1);
                        System.out.println("Subscriber deleted");
                    }
                    command = scanner.nextLine();
                    break;
                }
                case "list": {
                    System.out.println("---------LIST OF NOTES---------");
                    Book.getList(book);
                    break;
                }
                case "help": {
                    Help help = new Help();
                    break;
                }
                case "save":{
                    try {
                        book.data_writes_file(book);
                        System.out.println("Data written to file");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                }
                case "load":{
                    try {
                        book.data_load_file();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
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
