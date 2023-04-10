package com.mycompany.testetarget;




import java.util.Arrays;
public class FaturamentoMes{
private double[] faturamentoDiario;

public FaturamentoMes(double[] faturamentoDiario) {
    this.faturamentoDiario = faturamentoDiario;
}

public double menorFaturamento() {
    double menor = Double.MAX_VALUE;
    for (double faturamento : faturamentoDiario) {
        if (faturamento < menor) {
            menor = faturamento;
        }
    }
    return menor;
}

public double maiorFaturamento() {
    double maior = Double.MIN_VALUE;
    for (double faturamento : faturamentoDiario) {
        if (faturamento > maior) {
            maior = faturamento;
        }
    }
    return maior;
}

public int diasAcimaDaMedia() {
    double media = calcularMedia();
    int count = 0;
    for (double faturamento : faturamentoDiario) {
        if (faturamento > media) {
            count++;
        }
    }
    return count;
}

private double calcularMedia() {
    double soma = 0;
    int count = 0;
    for (double faturamento : faturamentoDiario) {
        if (faturamento > 0) {
            soma += faturamento;
            count++;
        }
    }
    return soma / count;
}

public static void main(String[] args) {
    // Exemplo de uso com alguns faturamentos 
    double[] faturamentoDiario = {1000.0, 2000.0, 500.0, 1500.0, 0.0, 3000.0, 2500.0};
    FaturamentoMes faturamento = new FaturamentoMes(faturamentoDiario);
    System.out.println("Menor faturamento: " + faturamento.menorFaturamento());
    System.out.println("Maior faturamento: " + faturamento.maiorFaturamento());
    System.out.println("Dias acima da média: " + faturamento.diasAcimaDaMedia());
}
}



 

