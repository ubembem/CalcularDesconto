package org.example;

import java.time.LocalDate;

public class DescontoAniversario implements Desconto {
    private final LocalDate dataAniversario;

    public DescontoAniversario(LocalDate dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public double calcularDesconto(double valor) {
        LocalDate dataVenda = LocalDate.now();
        if (dataVenda.getMonthValue() == dataAniversario.getMonthValue() && dataVenda.getDayOfMonth() == dataAniversario.getDayOfMonth()) {
            valor = valor * 0.20;
        }else
            System.out.println("Data de aniversário inválida!");
        return valor;
    }
}
