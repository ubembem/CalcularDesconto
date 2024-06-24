package org.example;

public class DescontoProgressivo implements Desconto{

    @Override
    public double calcularDesconto(double valorTotal){
        return valorTotal * 0.15;
    }
}
