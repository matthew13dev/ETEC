package DS_Agenda_06.src.Classes;


public class Console {
    
    public void  clear(){
        System.out.print("\033[H\033[2J");
    }

    public void println(String text){
        System.out.println(text);
    }

    public void print(String text){
        System.out.print(text);
    }

    public void trace(){
        println("----------------------------------------------------");
    }

    public void space(){
        println("");
        println("");
        println("");
    }

    public void header(){
        println("DS_Agenda_06");
        trace();
    }
}
