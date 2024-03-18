package DS_Agenda_05.src;

import java.util.Scanner;

import DS_Agenda_05.src.Class.Console;
import DS_Agenda_05.src.Class.Shopping;

public class DS_Agenda_05 {
   
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Console console = new Console();
        
        console.header();
        
        console.print("Enter a value: ");
        float value = scan.nextFloat();

        Shopping shop = new Shopping(value);

        shop.status();



        console.space();
        scan.close();
    }
    
}
