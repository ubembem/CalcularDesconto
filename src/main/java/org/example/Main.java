package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "João Silva", LocalDate.of(1980, 06, 24));
        Venda venda1 = new Venda(cliente, LocalDate.now(), 1000, new DescontoPorcentagemFixa(10));
        System.out.println("Venda 1 (10% de desconto): Valor final: " + venda1.calcularValorFinal());

        Venda venda2 = new Venda(cliente, LocalDate.now(), 2500, new DescontoProgressivo());
        System.out.println("Venda 2 (Desconto progressivo): Valor final: " + venda2.calcularValorFinal());

        Venda venda3 = new Venda(cliente, LocalDate.of(2024, 06, 24), 3000, new DescontoAniversario(cliente.getDataNascimento()));
        System.out.println("Venda 3 (Desconto aniversário): Valor final: " + venda3.calcularValorFinal());
    }
}
