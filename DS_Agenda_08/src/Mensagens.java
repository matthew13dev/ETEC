package DS_Agenda_08.src;

public class Mensagens {

    public static void enter_Idade(){
        System.out.print("--\nEnter a age: ");
    }
    public static void enter_Nota(){
        System.out.println("--\nEnter a note:\n" + Mensagens.notas());
    }

    public static void select(){
        System.out.print("Select: ");
    }

    public static void print_Total_Otimas(double total_Otimas){
        System.out.println("quantidade de respostas ótimo: " + total_Otimas);
    }

    public static void print_Media_Ruim(double media_Ruim){
        System.out.println("média de idade das pessoas que responderam ruim: " + media_Ruim);
    }

    public static void print_Percent_Pessimo(double percent_Pessimo){
        System.out.println("porcentagem de respostas pessimo: " + percent_Pessimo + "%");
    }

    public static String notas(){
        String mensage = String.format("[0]Otimo\n[1]Bom\n[2]Regular\n[3]Ruim\n[4]Pessimo\n");
        return mensage;
    }
}
