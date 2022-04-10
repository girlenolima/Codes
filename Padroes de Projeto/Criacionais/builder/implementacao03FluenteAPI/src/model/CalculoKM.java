package model;

public class CalculoKM {

    private String valorCarro;
    private String manutencao;
    private String kmRodado;
    private String impostos;
    private String servicos;

    public CalculoKM(String valorCarro, String manutencao, String kmRodado, String impostos, String servicos) {
        this.valorCarro = valorCarro;
        this.manutencao = manutencao;
        this.kmRodado = kmRodado;
        this.impostos = impostos;
        this.servicos = servicos;
    }


    public String getValorCarro() {
        return valorCarro;
    }

    public void setValorCarro(String valorCarro) {
        this.valorCarro = valorCarro;
    }

    public String getManutencao() {
        return manutencao;
    }

    public void setManutencao(String manutencao) {
        this.manutencao = manutencao;
    }

    public String getKmRodado() {
        return kmRodado;
    }

    public void setKmRodado(String kmRodado) {
        this.kmRodado = kmRodado;
    }

    public String getImpostos() {
        return impostos;
    }

    public void setImpostos(String impostos) {
        this.impostos = impostos;
    }

    public String getServicos() {
        return servicos;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }


    @Override
    public String toString() {
        return "CalculoKM{" +
                "valorCarro='" + valorCarro + '\'' +
                ", manutencao='" + manutencao + '\'' +
                ", kmRodado='" + kmRodado + '\'' +
                ", impostos='" + impostos + '\'' +
                ", servicos='" + servicos + '\'' +
                '}';
    }
}
