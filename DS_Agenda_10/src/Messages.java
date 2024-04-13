import java.util.Scanner;

import javax.swing.JOptionPane;

public class Messages {

    public static String enter_InputNumber(){
        String text = String.format("Enter a new number: ");
        String value = JOptionPane.showInputDialog(text);
        return value;
    }

    public static void printrResults(String text){
        JOptionPane.showMessageDialog(null, text);
    }
}
