package DS_Agenda_08.src;

public enum OPINIONS {

    OTIMO(0),
    BOM(1),
    REGULAR(2),
    RUIM(3),
    PESSIMO(4);


    public int code;

    OPINIONS(int code){
        this.code = code;
    }

    public int code(){
        return code;
    }
}
