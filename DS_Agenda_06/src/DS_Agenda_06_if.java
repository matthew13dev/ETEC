package DS_Agenda_06.src;

import java.util.Scanner;

public class DS_Agenda_06_if {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        clear_Console();

        header();
        
        print("Enter a final nuber car: ");
        Integer final_number = scanner.nextInt();

        Boolean validation = final_number >= 0  && 
            final_number <= 9;

        while(!validation){

                clear_Console();
                header();

                print("Invalid Command! Enter a final nuber car : ");
                final_number = scanner.nextInt();

                validation = final_number >= 0 && final_number <= 9;
                
        }
    


        if(validation){
            
            validation = final_number == 9 || final_number == 0 ;

            if(validation){
                println("Pagamento até 31/12");
            }
            else {

                validation = final_number == 8;

                if(validation){
                    println("Pagamento até 30/11");
                }
                else {
                    
                    validation = final_number == 7;

                    if(validation){
                        println("Pagamento até 31/10");
                    }
                    else {

                        validation = final_number == 6;

                        if(validation){
                            println("Pagamento até 30/09");
                        }
                        else {
                            
                            validation = final_number == 5;

                            if(validation){
                                println("Pagamento até 31/08");
                            }
                            else {
                                
                                validation = final_number == 4;

                                if(validation){
                                    println("Pagamento até 31/07");
                                }
                                else {
                                    
                                    validation = final_number == 3;

                                    if(validation){
                                        println("Pagamento até 30/06");
                                    }
                                    else {
                                        
                                        validation = final_number == 2;

                                        if(validation){
                                            println("Pagamento até 31/05");
                                        }
                                        else {
                                            
                                            validation = final_number == 1;

                                            if(validation){
                                                println("Pagamento até 30/04");
                                            }
                                            else {
                                                
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } 
        
        
        space();

        scanner.close();
    }


    public static void clear_Console(){
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

    public static void header(){
        println("Matheus Henrique da Silva Mendes - Agenda_04_DS");
        trace();
    }

}
