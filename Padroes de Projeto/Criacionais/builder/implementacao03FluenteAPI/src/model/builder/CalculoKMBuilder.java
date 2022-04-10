package model.builder;

import model.CalculoKM;

public class CalculoKMBuilder {

    private String valorCarro;
    private String manutencao;
    private String kmRodado;
    private String impostos;
    private String servicos;


    public CalculoKMBuilder(String valorCarro) {
        this.valorCarro = valorCarro;
    }

    public CalculoKMBuilder andManutencao(String manutencao) {
        this.manutencao = manutencao;
        return this;

    }

    public CalculoKMBuilder andkmRodado(String kmRodado) {
        this.kmRodado = kmRodado;
        return this;

    }

    public CalculoKMBuilder andImpostos(String impostos) {
        this.impostos = impostos;
        return this;

    }

    public CalculoKMBuilder andServicos(String servicos) {
        this.servicos = servicos;
        return this;

    }

    public CalculoKM getCalculoKMBuilder() {

        return new CalculoKM(valorCarro, manutencao, kmRodado, impostos, servicos);

    }

}
