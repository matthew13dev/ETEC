package DS_Agenda_05.lib;

import java.util.Scanner;

public class Shopping {

    // Imports

    Console console = new Console();
    Scanner scan = new Scanner(System.in);

    private float value = 0f;
    private float discount = 0f;
    private float total = 0f;
    private String text = "none";

    // Constructor

    public Shopping(float value) {
        setValue(value);

        Positive_Value calc_01 = new Positive_Value(getValue());

        Discount cal_02 = new Discount(calc_01.getValue());

        setValue(cal_02.getValue());
        setDiscount(cal_02.getDiscount());
        setTotal(cal_02.getTotal());
        setText(cal_02.getText());
    }

    // Methods

    public void status() {

        console.header();

        console.print("Value: ");
        System.out.println(getValue());

        console.print(text);
        System.out.println(getDiscount());
        
        console.print("Total: ");
        System.out.println(getTotal());

    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
