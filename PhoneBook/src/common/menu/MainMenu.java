package common.menu;

import java.io.IOException;
import java.util.Scanner;

import common.book.Book;

public class MainMenu {
    public MainMenu() throws InterruptedException {
        Book book = new Book();
        System.out.println("|----------------------------|");
        System.out.println("|----WELCOME TO PHONE BOOK---|");
        System.out.println("|----------------------------|");
        System.out.println("---------MAIN MENU------------");
        System.out.println("Type \"help\" to list a commands");
        String command;
        do {
            System.out.println("help | create | edit | delete | list | find | save | load | exit");
            System.out.print("COMMAND: ");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            switch (command) {
                case "create": {
                    String firstName = "";
                    String lastName = "";
                    int number = 0;
                    System.out.println("----------CREATE A NOTE----------");
                    System.out.print("Enter a FIRST name: ");
                    if (scanner.hasNextLine()) {
                        firstName = scanner.nextLine();
                    } else {System.out.println("It's not name. Name will be UNKNOWN. You can change it later.");}
                    System.out.print("Enter a LAST name: ");
                    if (scanner.hasNextLine()) {
                        lastName = scanner.nextLine();
                    } else {System.out.println("It's not name. Name will be UNKNOWN. You can change it later.");}
                    System.out.print("Enter a phone NUMBER: ");
                    if (scanner.hasNextInt()) {
                        number = scanner.nextInt();
                    } else {System.out.println("It's not number. Number will be 0. You can change it later.");}
                    book.createNote(book.showNotesQuantity() + 1, firstName.toUpperCase(), lastName.toUpperCase(), number);
                    System.out.println("******************************");
                    System.out.println("Created note: ");
                    System.out.println(book.showNote(book.showNotesQuantity() - 1));
                    System.out.println("---------MAIN MENU------------");
                    command = scanner.nextLine();
                    break;
                }
                case "edit": {
                    System.out.print("Enter ID of contact you want to EDIT: ");
                    int select = 0;
                    int id = 0;
                    scanner = new Scanner(System.in);
                    if (scanner.hasNextInt()) {
                        id = scanner.nextInt();
                        if (book.findContactByID(id)) {
                            System.out.print("What do you want to change?\n" +
                                    "1 - First name\n" +
                                    "2 - Last name\n" +
                                    "3 - Number\n" +
                                    "0 - Cancel change\n" +
                                    "COMMAND: ");
                            if (scanner.hasNextInt()) {
                                select = scanner.nextInt();
                            }
                            switch (select) {
                                case 1: {
                                    System.out.print("Enter new FIRST name: ");
                                    scanner = new Scanner(System.in);
                                    if (scanner.hasNextLine()) {
                                        book.editFirstName(id, scanner.nextLine().toUpperCase());
                                        System.out.println("FIRST name was changed");
                                        Thread.sleep(1000);
                                    }
                                    break;
                                }
                                case 2: {
                                    System.out.print("Enter new LAST name: ");
                                    scanner = new Scanner(System.in);
                                    if (scanner.hasNextLine()) {
                                        book.editLastName(id, scanner.nextLine().toUpperCase());
                                        System.out.println("LAST name was changed");
                                        Thread.sleep(1000);
                                    }
                                    break;
                                }
                                case 3: {
                                    System.out.print("Enter new NUMBER name: ");
                                    scanner = new Scanner(System.in);
                                    if (scanner.hasNextInt()) {
                                        book.editNumber(id, scanner.nextInt());
                                        System.out.println("Number was changed");
                                        Thread.sleep(1000);
                                        scanner.nextLine();
                                    }
                                    break;
                                }
                                default: break;
                            }
                            break;
                        } else {
                            System.out.println("Such contact not found.");
                            Thread.sleep(1000);
                        }
                    }
                    break;
                }
                case "delete": {
                    System.out.print("Enter Contact's ID, that you want to delete: ");
                    int id = scanner.nextInt();
                    if((id < 1) || (id > book.showNotesQuantity())) {
                        System.out.println("Contact with this ID doesn't exist.");
                    } else {
                        book.deleteNote(id - 1);
                        System.out.println("Contact deleted");
                        Thread.sleep(1000);
                    }
                    command = scanner.nextLine();
                    break;
                }
                case "list": {
                    System.out.println("---------LIST OF NOTES---------");
                    Book.getList(book);
                    break;
                }
                case "find": {
                    System.out.print("Enter NAME or NUMBER: ");
                    String findValue = scanner.nextLine();
                    book.findContact(findValue.toUpperCase());
                    break;
                }
                case "help": {
                    new Help();
                    break;
                }
                case "save":{
                    try {
                        book.data_writes_file(book);
                        System.out.println("Data written to file");
                        Thread.sleep(1000);
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
