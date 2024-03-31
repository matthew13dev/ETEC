package DS_Agenda_08.src;

public enum NOTAS {

    OTIMO(0),
    BOM(1),
    REGULAR(2),
    RUIM(3),
    PESSIMO(4);

    private static int size = 5;

    public static int getSize() {
        return size;
    }

    public int code;

    NOTAS(int code){
        this.code = code;
    }

    public int code(){
        return code;
    }
}
