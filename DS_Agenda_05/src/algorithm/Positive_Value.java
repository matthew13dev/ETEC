package DS_Agenda_05.src.algorithm;

import java.util.Scanner;

public class Positive_Value {

    private static final float ZERO = 0f;
    private float value = 0f;
    private Boolean validation = false;

    // imports

    Console console = new Console();
    Scanner scan = new Scanner(System.in);

    // constructor

    public Positive_Value(float value) {

        setValue(value);

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


    // Getters and Setters

    public static float getZero() {
        return ZERO;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    private Boolean getValidation() {
        return validation;
    }

    private void setValidation(Boolean validation) {
        this.validation = validation;
    }

}
