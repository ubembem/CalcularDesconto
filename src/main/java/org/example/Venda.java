package org.example;
import java.time.LocalDate;

public class Venda {
    private Cliente cliente;
    private Desconto desconto;
    private LocalDate data;
    private double valorTotal;

    // ... outros métodos ...

    public Venda(Cliente cliente, LocalDate data, double valorTotal, Desconto desconto) {
        this.cliente = cliente;
        this.data = data;
        this.valorTotal = valorTotal;
        this.desconto = desconto;
    }

    public double calcularValorFinal() {
        double valorDesconto = desconto.calcularDesconto(valorTotal);
        return valorTotal - valorDesconto;
    }
}

