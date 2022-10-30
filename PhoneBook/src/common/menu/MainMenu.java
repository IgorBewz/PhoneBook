package common.menu;

import java.util.Scanner;

import common.book.Book;

public class MainMenu {
    public MainMenu() {
        Book book = new Book();
        book.createNote("Tobias", "Ripper", 202);
        book.createNote("Tomas", "Anderson", 404);
        book.createNote();

        System.out.println("|----------------------------|");
        System.out.println("|----WELCOME TO PHONE BOOK---|");
        System.out.println("|----------------------------|");
        System.out.println("---------MAIN MENU------------");
        System.out.println("Type \"help\" to list a commands");
        System.out.print("COMMAND: ");
        String command = "";
        Scanner scanner = new Scanner(System.in);
        do {
            command = scanner.nextLine();
            switch (command) {
                case "create": {
                    System.out.print("ASSISTANT: created\nCOMMAND: ");
                    break;
                }
                case "list": {
                    System.out.println("---------LIST OF NOTES---------");
                    book.getList(book);
                    System.out.print("COMMAND: ");
                    break;
                }
                case "help": {
                    Help help = new Help();
                    break;
                }
                case "exit": {
                    break;
                }
                default:
                    System.out.print("ASSISTANT: Command not exist\nCOMMAND: ");
                    command = " ";
            }
        } while (!(command.equals("exit")));
    }
}
