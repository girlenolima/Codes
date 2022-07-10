import java.util.Date;

public class ChegadaAniversarianteEvent {

    private final Date HORA_DA_CHEGADA;

    public ChegadaAniversarianteEvent(Date HORA_DA_CHEGADA) {

        this.HORA_DA_CHEGADA = HORA_DA_CHEGADA;

    }

    public Date getHORA_DA_CHEGADA() {
        return HORA_DA_CHEGADA;
    }
}
