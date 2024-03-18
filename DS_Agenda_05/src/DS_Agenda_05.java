package DS_Agenda_05.src;

import java.util.Scanner;
import DS_Agenda_05.src.algorithm.Console;
import DS_Agenda_05.src.algorithm.Discount;

public class DS_Agenda_05 {
   
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Console console = new Console();
        
        console.header();
        
        console.print("Enter a value: ");
        float value = scan.nextFloat();

        Discount market = new Discount(value);
        market.status();



        scan.close();
    }
    
}
