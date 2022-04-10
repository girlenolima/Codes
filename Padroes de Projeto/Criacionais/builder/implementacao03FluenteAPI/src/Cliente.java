import model.CalculoKM;
import model.builder.CalculoKMBuilder;

import java.sql.SQLOutput;

public class Cliente {

    public static void main(String[] args) {

        CalculoKM calculo = new CalculoKMBuilder("200").getCalculoKMBuilder();

        CalculoKM calculo2 = new CalculoKMBuilder("200")
                .andImpostos("IMPOSTO")
                .andkmRodado("RODADO")
                .andServicos("SERVIÇOS")
                .andManutencao("MANUTENCAO")
                .getCalculoKMBuilder();

        System.out.println(calculo2);
    }
}
