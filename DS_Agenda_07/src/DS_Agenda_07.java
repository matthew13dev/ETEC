import java.util.Scanner;
import javax.swing.JOptionPane;

public class DS_Agenda_07 {

    public static void main(String[] args) {

        Console.clear();

        Scanner scan = new Scanner(System.in);
        String name = "none";
        int age = 0;
        int select = 0;

        int size_Execelente = 0;
        int size_Bom = 0;
        int size_Ruim = 0;
        double full_Age = 0.0;

        String mensage = String.format("DS_Agenda_07 \n Matheus Henrique da Silva Mendes");
        JOptionPane.showMessageDialog(null, mensage);

        for (int i = 0; i < ATENDIMENTO.USERS.length; i++) {
            String string_To_Integer = "none";

            String text = String.format("Pessoa: %d//%d", i+1, ATENDIMENTO.PARTICIPANTES);
            JOptionPane.showMessageDialog(null, text);

            name = JOptionPane.showInputDialog("Informe o seu nome: ");

            string_To_Integer = JOptionPane.showInputDialog("Informe a sua idade: ");
            age = Integer.parseInt(string_To_Integer);

            ATENDIMENTO.USERS[i] = name;
            full_Age = full_Age + age;

            mensage="Selecione o nivel de atendimento abaixo: \n";

            for (int a = 0; a < ATENDIMENTO.ATENDIMENTOS.length; a++) {
                mensage = mensage + String.format("[%d] %s\n", a, ATENDIMENTO.ATENDIMENTOS[a]);
                
            }

            string_To_Integer = JOptionPane.showInputDialog(null, mensage);
            select = Integer.parseInt(string_To_Integer);

            if (select == ATENDIMENTO.EXECELENTE) {
                size_Execelente++;

            } else {
                if (select == ATENDIMENTO.BOM) {
                    size_Bom++;

                } else {
                    if (select == ATENDIMENTO.RUIM) {
                        size_Ruim++;

                    } else {
                        JOptionPane.showConfirmDialog(null,"digito invalido","ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }

        }

        double media = full_Age / ATENDIMENTO.PARTICIPANTES;

        mensage = String.format("-----------------------------------------------------\n Resultado da pesquisa:\n Exelente: %d \n Bom: %d \n Ruim %d \n ----------------------------------------------------- \n Media das idades: %f", 
        size_Execelente, size_Bom, size_Ruim, media);

        JOptionPane.showMessageDialog(null, mensage);

        mensage = String.format("Participantes:\n");

        for(int i = 0; i < ATENDIMENTO.USERS.length; i++){
            mensage = mensage + String.format("[%d] %s\n", i, ATENDIMENTO.USERS[i]);
        }

        JOptionPane.showMessageDialog(null, mensage);


        
        scan.close();
    }
}