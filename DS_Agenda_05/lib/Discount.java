package DS_Agenda_05.lib;

public class Discount {

    private static final float FIVE_PERCENT = 0.05f;
    private static final float TEN_PERCENT = 0.1f;
    private static final float FIFTEEN_PERCENT = 0.15f;

    private static final float VALOR200 = 200f;
    private static final float VALOR300 = 300f;

    private float value = 0f;
    private float discount = 0f;
    private float total = 0f;
    private String text = "none";
    private Boolean validation = false;

    Console console = new Console();

    public Discount(float value) {
        console.header();


        setValue(value);

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

    public String getText() {
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
