package DS_Agenda_05.src.algorithm;

public class Console {

    public void clear() {
        System.out.print("\033[H\033[2J");
    }

    public void println(String text) {
        System.out.println(text);
    }

    public void print(String text) {
        System.out.print(text);
    }

    public void trace() {
        println("----------------------------------------------------");
    }

    public void space() {
        println("");
        println("");
        println("");
    }

    public void header() {
        clear();
        println("Modulo_01_DS_Agenda_05");
        trace();
    }
}
