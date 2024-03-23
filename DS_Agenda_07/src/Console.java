
public class Console {
    
    public static void  clear(){
        System.out.print("\033[H\033[2J");
    }

    public static void println(String text){
        System.out.println(text);
    }

    public static void print(String text){
        System.out.print(text);
    }

    public static void trace(){
        println("----------------------------------------------------");
    }

    public static void space(){
        println("");
        println("");
        println("");
    }

    public static void header(String text){
        println(text);
        trace();
    }
}
