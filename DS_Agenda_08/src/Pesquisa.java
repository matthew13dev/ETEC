package DS_Agenda_08.src;

import java.util.Scanner;

public class Pesquisa {

    static final int ZERO = 0;
    static final int PERCENT = 100;

    private double quantidade_Participantes = 0;
    private int select = 0;

    private double idade = 0;

    private double quantidade_Otimo = 0;
    private double quantidade_Bom = 0;
    private double quantidade_Regular = 0;
    private double quantidade_Ruim = 0;
    private double quantidade_Pessimo = 0;

    public Pesquisa(double quantidade_Participantes) {
        this.quantidade_Participantes = quantidade_Participantes;
    }

    public void start(){

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= getQuantidade_Participantes(); i++) {

            System.out.println("pessoa Numero: " + i );
            Mensagens.enter_Idade();
            set_Idade(scan.nextInt());

            do {
                Mensagens.enter_Nota();
                Mensagens.select();
                Select(scan.nextInt());


            } while (getSelect() < ZERO || getSelect() > NOTAS.getSize());
        }

        scan.close();
    }

    public void resultado(){
        Mensagens.print_Total_Otimas(getQuantidade_Otimo());
        Mensagens.print_Media_Ruim(media_Idade_Quantidade_Ruim());
        Mensagens.print_Percent_Pessimo(percent_Pessimo());
    }

    private double getSelect() {
        return select;
    }

    private void Select(int select) {
        this.select = select;

        if (select == NOTAS.OTIMO.code()) {
            setQuantidade_Otimo();
        } else {
            if (select == NOTAS.BOM.code()) {
                setQuantidade_Bom();
            } else {
                if (select == NOTAS.REGULAR.code()) {
                    setQuantidade_Regular();
                } else {
                    if (select == NOTAS.RUIM.code()) {
                        setQuantidade_Ruim();
                    } else {
                        if (select == NOTAS.PESSIMO.code()) {
                            setQuantidade_Pessimo();
                        } else {
                            System.out.println("------------------------");
                            System.out.println("Digito invalido!");
                        }
                    }
                }
            }
        }
    }

    private double media_Idade_Quantidade_Ruim() {

        if (getQuantidade_Ruim() != ZERO) {
            double media = getidade() / getQuantidade_Ruim();

            return media;
        }
        return 0.0;
    }

    private double percent_Pessimo() {
        
        if (getQuantidade_Pessimo() != ZERO) {

            double percent_Pessimo = (getQuantidade_Pessimo() / getQuantidade_Participantes()) * PERCENT;
            return percent_Pessimo;
        }

        return 0;
    }



    // GETTERS AND SETTTERS

    public double getQuantidade_Otimo() {
        return quantidade_Otimo;
    }

    private void setQuantidade_Otimo() {
        quantidade_Otimo++;
    }

    public double getQuantidade_Bom() {
        return quantidade_Bom;
    }

    private void setQuantidade_Bom() {
        quantidade_Bom++;
    }

    public double getQuantidade_Regular() {
        return quantidade_Regular;
    }

    private void setQuantidade_Regular() {
        quantidade_Regular++;
    }

    public double getQuantidade_Ruim() {
        return quantidade_Ruim;
    }

    private void setQuantidade_Ruim() {
        quantidade_Ruim++;
    }

    public double getQuantidade_Pessimo() {
        return quantidade_Pessimo;
    }

    private void setQuantidade_Pessimo() {
        quantidade_Pessimo++;
    }

    public double getidade() {
        return idade;
    }

    private void set_Idade(double idade) {
        this.idade = this.idade + idade;
    }

    public double getQuantidade_Participantes() {
        return quantidade_Participantes;
    }

}
