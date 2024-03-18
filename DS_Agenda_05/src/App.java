package DS_Agenda_05.src;

import java.util.Scanner;

import javax.swing.JOptionPane;

import DS_Agenda_05.src.Class.Console;
import DS_Agenda_05.src.Class.Shopping;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Console console = new Console();

        console.header();


        String aux = "none";
        float value = 0f;

        try {

            aux = JOptionPane.showInputDialog(null, "Enter a value: ");
            value = Float.parseFloat(aux);

            Shopping shop = new Shopping(value);
            shop.status();

        } catch (NumberFormatException e) {

            System.out.format(" Somente numero! [%s]", aux);   

        }

        console.space();
        scan.close();
    }

}
