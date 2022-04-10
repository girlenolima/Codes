package model.builder;

import model.CalculoKM;

public class CalculoKMBuilder {

    private final String valorCarro;
    private final String manutencao;
    private final String kmRodado;
    private final String impostos;
    private final String servicos;

    public CalculoKMBuilder(String valorCarro, String manutencao, String kmRodado, String impostos, String servicos) {
        this.valorCarro = valorCarro;
        this.manutencao = manutencao;
        this.kmRodado = kmRodado;
        this.impostos = impostos;
        this.servicos = servicos;
    }

    public String getValorCarro() {
        return valorCarro;
    }

    public String getManutencao() {
        return manutencao;
    }

    public String getKmRodado() {
        return kmRodado;
    }

    public String getImpostos() {
        return impostos;
    }

    public String getServicos() {
        return servicos;
    }

    @Override
    public String toString() {
        return "CalculoKMBuilder{" +
                "valorCarro='" + valorCarro + '\'' +
                ", manutencao='" + manutencao + '\'' +
                ", kmRodado='" + kmRodado + '\'' +
                ", impostos='" + impostos + '\'' +
                ", servicos='" + servicos + '\'' +
                '}';
    }

    public static class Builder {


        private String valorCarro;
        private String manutencao;
        private String kmRodado;
        private String impostos;
        private String servicos;


        public Builder(String valorCarro) {
            this.valorCarro = valorCarro;
        }

        public Builder andManutencao(String manutencao) {
            this.manutencao = manutencao;
            return this;

        }

        public Builder andkmRodado(String kmRodado) {
            this.kmRodado = kmRodado;
            return this;

        }

        public Builder andImpostos(String impostos) {
            this.impostos = impostos;
            return this;

        }

        public Builder andServicos(String servicos) {
            this.servicos = servicos;
            return this;

        }

        public CalculoKM getCalculoKMBuilder() {

            return new CalculoKM(valorCarro, manutencao, kmRodado, impostos, servicos);

        }


    }
}
