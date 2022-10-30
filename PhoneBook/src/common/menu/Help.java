package common.menu;

import java.util.Scanner;

public class Help {
    public Help() {
        String command = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("----------HELP------------");
        System.out.println("create - create a new note");
        System.out.println("help - show HELP");
        System.out.println("list - show list of BOOK NOTES");
        System.out.println("exit - exit from program");
        System.out.println("---------MAIN MENU------------");
    }
}
