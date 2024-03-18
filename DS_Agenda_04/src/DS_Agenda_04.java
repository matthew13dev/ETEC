package DS_Agenda_04.src;
import java.util.Scanner;

public class DS_Agenda_04 {
    static final String[] MODELS_CARS = {"Sedan", "Hatch", "USV", "4X4", "Sport"};
    static final Double VALUE_KM = 0.2;
    public static void main(String[] args){

        clear_Console();
        Scanner scan = new Scanner(System.in);

        println("Enter a car model: "); break_Line();

        print_Vetor_String(MODELS_CARS); break_Line();

        print("Select: "); Integer select_Model_Car = scan.nextInt(); break_Line();

        Double value_Model_Car = 0.0;
        Boolean validation = select_Model_Car > 0 && select_Model_Car <= MODELS_CARS.length;
        
        if(!validation){
            do{
                clear_Console();

                println("Invalid Value! Enter a car model: "); break_Line();

                print_Vetor_String(MODELS_CARS); break_Line();

                print("Select Model Car: "); select_Model_Car = scan.nextInt(); break_Line();


                validation = select_Model_Car > 0 && select_Model_Car <= MODELS_CARS.length;
                
            } while (!validation);
        }
        else{

            switch (select_Model_Car) {
                case 1:
                    value_Model_Car = 100.0;
                    break;
            
                case 2:
                    value_Model_Car = 200.0;
                    break;
                case 3:
                    value_Model_Car = 300.0;
                    break;
                case 4:
                    value_Model_Car = 400.0;
                    break;
                case 5:
                    value_Model_Car = 500.0;
                    break;
            }
            
        }
        
        
        println("Model Car: " + MODELS_CARS[select_Model_Car - 1]);

        print("Enter value diary; "); Double day_Value = scan.nextDouble();
        validation = day_Value <= 0;

        while(validation){
            print("Value Negative! Enter a value diary positive; "); day_Value = scan.nextDouble();
            validation = day_Value <= 0;
        }

        print("Enter amount days; "); Integer amount_Days = scan.nextInt();
        validation = amount_Days <= 0;

        while(validation){
            print("Value Negative! Enter a value amount positive; "); amount_Days = scan.nextInt();
            validation = amount_Days <= 0;
        }

        print("Enter amount KMs; "); Double amount_Km = scan.nextDouble();
        validation = amount_Km <= 0;

        while(validation){
            print("Value Negative! Enter a value KMs positive; "); amount_Km = scan.nextDouble();
            validation = amount_Km <= 0;
        }
            
        
        Double total_Diary = amount_Days * day_Value;
        Double total_Km = amount_Km * VALUE_KM;
        Double total = value_Model_Car + total_Diary + total_Km;

        clear_Console();

        System.out.println("Model Car.....: " + MODELS_CARS[select_Model_Car - 1]);
        System.out.println("Day Value.....: " + day_Value);
        System.out.println("Amount days...: " +  amount_Days);
        System.out.println("Amount KMs....: " + amount_Km);
        break_Line();
        System.out.println("Total.........: " + total);
        
        scan.close();
    }

    public static void clear_Console(){
        System.out.print("\033[H\033[2J");
    }

    public static void print(String text){
        System.out.print(text);
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void break_Line(){
        println("");
    }
    
    public static void print_Err(String text){
        System.err.println(text);
    }

    public static void print_Vetor_String(String[] vetor){
        for(int i = 0; i < vetor.length; i++){
            int item = i + 1;
            System.out.println("[" + item + "]" + vetor[i]);
        }

    }
}
