package DS_Agenda_08.src;

public class App {
    static final int QUANTIDADADE_PARTICIPANTES = 40;
    public static void main(String[] args) {

        
        Pesquisa pesquisa = new Pesquisa(QUANTIDADADE_PARTICIPANTES);

        pesquisa.start();
        pesquisa.resultado();
    }
}
