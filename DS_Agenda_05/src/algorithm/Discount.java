package DS_Agenda_05.src.algorithm;

import java.util.Scanner;

public class Discount {

    // Imports

    Console console = new Console();
    Scanner scan = new Scanner(System.in);

    private static final float FIVE_PERCENT = 0.05f;
    private static final float TEN_PERCENT = 0.1f;
    private static final float FIFTEEN_PERCENT = 0.15f;

    private static final float VALOR200 = 200f;
    private static final float VALOR300 = 300f;
    private static final float ZERO = 0f;

    private float value = 0f;
    private float discount = 0f;
    private float total = 0f;
    private String text = "none";
    private Boolean validation = true;

    // Constructor

    public Discount(float value) {

        setValue(value);
        verification_01();
        verification_02();
    }

    // Methods

    public void status(){

        console.header();
        console.print("Value: "); System.out.println(getValue());
        console.print(getText()); System.out.println(getDiscount());
        console.print("Total: "); System.out.println(getTotal());

    }
    public void verification_01() {

        setValidation(getValue() <= getZero());
        while (getValidation()) {

            console.header();
            console.print("ERRO! ");

            setValidation(getValue() == getZero());
            if (getValidation()) {

                console.print("Value ZERO is not permited: ");
            } else {
                console.print("Value NEGATIVE is not permited: ");
            }

            value = scan.nextFloat();
            setValue(value);

            setValidation(getValue() <= getZero());
        }

    }

    public void verification_02() {

        console.header();

        setValidation(getValue() >= getValor300());

        if (getValidation()) {

            setDiscount(getValue() * getFifteenPercent());
            setText("15% of Discount: ");

        } else {

            setValidation(getValue() >= getValor200());

            if (getValidation()) {

                setDiscount(getValue() * getTenPercent());
                setText("10% of Discount: ");

            } else {

                setDiscount(getValue() * getFivePercent());
                setText("5% of Discount: ");

            }
        }

        setTotal(getValue() - getDiscount());
    }

    // Constants

    private static float getFivePercent() {
        return FIVE_PERCENT;
    }

    private static float getTenPercent() {
        return TEN_PERCENT;
    }

    private static float getFifteenPercent() {
        return FIFTEEN_PERCENT;
    }

    private static float getValor200() {
        return VALOR200;
    }

    private static float getValor300() {
        return VALOR300;
    }

    private static float getZero() {
        return ZERO;
    }

    // Variables

    public float getValue() {
        return value;
    }

    private void setValue(float value) {
        this.value = value;
    }

    public float getDiscount() {
        return discount;
    }

    private void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getTotal() {
        return total;
    }

    private void setTotal(float total) {
        this.total = total;
    }

    private String getText() {
        return text;
    }

    private void setText(String text) {
        this.text = text;
    }

    private Boolean getValidation() {
        return validation;
    }

    private void setValidation(Boolean validation) {
        this.validation = validation;
    }
}
