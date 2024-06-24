package org.example;

public class DescontoPorcentagemFixa implements Desconto{
    private double porcentagem;

    public DescontoPorcentagemFixa(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public double calcularDesconto(double valor){
        return valor * porcentagem / 100;
    }
}
