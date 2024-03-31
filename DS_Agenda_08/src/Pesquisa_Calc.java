package DS_Agenda_08.src;

public class Pesquisa_Calc {

    private int otimo = 0;
    private int bom = 0;
    private int regular = 0;
    private int ruim = 0;
    private int pessimmo = 0;
    private int age = 0;
    private int participantes = 0;

    public Pesquisa_Calc(int participantes) {
        this.participantes = participantes;
    }

    public int media_Ruim() {
        int media = getAge() / getRuim();
        return media;

    }

    public double percent_Pessimo() {
        final int percent = 100;
        double percent_Pessimo = (getParticipantes() / getPessimmo()) * percent;
        return percent_Pessimo;
    }

    // GETTERS AND SETTTERS

    public int getOtimo() {
        return otimo;
    }

    public void setOtimo(int otimo) {
        this.otimo = otimo;
    }

    public int getBom() {
        return bom;
    }

    public void setBom(int bom) {
        this.bom = bom;
    }

    public int getRegular() {
        return regular;
    }

    public void setRegular(int regular) {
        this.regular = regular;
    }

    public int getRuim() {
        return ruim;
    }

    public void setRuim(int ruim) {
        this.ruim = ruim;
    }

    public int getPessimmo() {
        return pessimmo;
    }

    public void setPessimmo(int pessimmo) {
        this.pessimmo = pessimmo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getParticipantes() {
        return participantes;
    }

    public void setParticipantes(int quantidade_Pessoas) {
        this.participantes = quantidade_Pessoas;
    }

}
