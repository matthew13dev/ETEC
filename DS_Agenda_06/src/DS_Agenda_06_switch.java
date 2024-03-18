package DS_Agenda_06.src;

import java.util.Scanner;
import DS_Agenda_06.src.Classes.Console;

public class DS_Agenda_06_switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Console console = new Console();

        console.clear();

        console.header();

        console.print("Enter a final nuber car: ");
        int final_number = scanner.nextInt();

        Boolean validation = final_number >= 0 && final_number <= 9;

        if (!validation) {

            do {

                console.header();

                console.print("Invalid Command! Enter a final nuber car : ");
                final_number = scanner.nextInt();

                validation = final_number >= 0 && final_number <= 9;

            } while (!validation);
        }

        console.header();

        switch (final_number) {
            case 1:
                console.println("Pagamento até 30/04");
                break;
            case 2:
                console.println("Pagamento até 31/05");
                break;
            case 3:
                console.println("Pagamento até 30/06");
                break;
            case 4:
                console.println("Pagamento até 31/07");
                break;
            case 5:
                console.println("Pagamento até 31/08");
                break;
            case 6:
                console.println("Pagamento até 30/09");
                break;
            case 7:
                console.println("Pagamento até 31/10");
                break;
            case 8:
                console.println("Pagamento até 30/11");
                break;
            case 9:
                console.println("Pagamento até 31/12");
                break;
            case 0:
                console.println("Pagamento até 31/12");
                break;
        }

        console.space();

        scanner.close();
    }

}
