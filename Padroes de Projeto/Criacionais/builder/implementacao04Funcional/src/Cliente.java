import model.CalculoKM;
import model.builder.CalculoKMBuilder;

public class Cliente {

    public static void main(String[] args) {


        CalculoKM calculo2 = new CalculoKMBuilder.Builder("200")
                .andImpostos("IMPOSTO")
                .andkmRodado("RODADO")
                .andServicos("SERVIÇOS")
                .andManutencao("MANUTENCAO")
                .getCalculoKMBuilder();

        System.out.println(calculo2);
    }
}
