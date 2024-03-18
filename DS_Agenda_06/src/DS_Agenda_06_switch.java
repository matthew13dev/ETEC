package DS_Agenda_06.src;

import java.util.Scanner;

public class DS_Agenda_06_switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        clear_Console();

        header();

        print("Enter a final nuber car: ");
        int final_number = scanner.nextInt();

        Boolean validation = final_number >= 0 && final_number <= 9;

        if (!validation) {

            do {

                header();

                print("Invalid Command! Enter a final nuber car : ");
                final_number = scanner.nextInt();

                validation = final_number >= 0 && final_number <= 9;

            } while (!validation);
        }

        header();

        switch (final_number) {
            case 1:
                println("Pagamento até 30/04");
                break;
            case 2:
                println("Pagamento até 31/05");
                break;
            case 3:
                println("Pagamento até 30/06");
                break;
            case 4:
                println("Pagamento até 31/07");
                break;
            case 5:
                println("Pagamento até 31/08");
                break;
            case 6:
                println("Pagamento até 30/09");
                break;
            case 7:
                println("Pagamento até 31/10");
                break;
            case 8:
                println("Pagamento até 30/11");
                break;
            case 9:
                println("Pagamento até 31/12");
                break;
            case 0:
                println("Pagamento até 31/12");
                break;
        }

        space();

        scanner.close();
    }

    public static void clear_Console() {
        System.out.print("\033[H\033[2J");
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void print(String text) {
        System.out.print(text);
    }

    public static void trace() {
        println("----------------------------------------------------");
    }

    public static void space() {
        println("");
        println("");
        println("");
    }

    public static void header() {
        clear_Console();
        println("Matheus Henrique da Silva Mendes - Agenda_04_DS");
        trace();
    }

}
