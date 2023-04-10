package com.mycompany.testetarget;
import javax.swing.*;


public class TesteTarget {
    
    public static void Exercicio02(){
        int num;
        //Entrada para o valor que será analisado
        String lernum = JOptionPane.showInputDialog("Digite um número inteiro positivo: ");
        num = Integer.parseInt(lernum);
        
        // Inicializa as variáveis da sequência de Fibonacci
        int num1 = 0, num2 = 1, soma;
        boolean pertence = false;
        
        // Calcula a sequência de Fibonacci até o número que foi digitado pelo usuário ou até atingir um número maior
        while (num2 <= num) {
            if (num2 == num) {
                pertence = true;
            }
            soma = num1 + num2;
            num1 = num2;
            num2 = soma;
        }
        
        // Imprime a sequência de Fibonacci e se o número pertence a ela
        if (pertence) {
            JOptionPane.showMessageDialog(null,"O número " + num + " pertence à sequência de Fibonacci!");
        } else {
            JOptionPane.showMessageDialog(null,"O número " + num + " não pertence à sequência de Fibonacci.");
        }      
    }
    
    public static void Exercicio03(){
        
    }
    

    public static void Exercicio04(){
        double faturamentoTotal = 181759.98; //Faturamento total da distribuidora dado a soma dosfaturamentos regionais
        
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        
        //Calculando o percentual de representação de cada estado de acordo com o faturamento total
        double percentualSP = (sp / faturamentoTotal) * 100;
        double percentualRJ = (rj / faturamentoTotal) * 100;
        double percentualMG = (mg / faturamentoTotal) * 100;
        double percentualES = (es / faturamentoTotal) * 100;
        double percentualOutros = (outros / faturamentoTotal) * 100;
        
        //Mostrando Resultados
        System.out.println("Percentual de representação do faturamento por estado:");
        System.out.printf("SP: %.2f%%\n", percentualSP);
        System.out.printf("RJ: %.2f%%\n", percentualRJ);
        System.out.printf("MG: %.2f%%\n", percentualMG);
        System.out.printf("ES: %.2f%%\n", percentualES);
        System.out.printf("Outros: %.2f%%\n", percentualOutros);
    }
    
    public static void Exercicio05(){
        String str = "Hello World";
        String strInvertida = "";
        
        for(int i = str.length() - 1; i >= 0; i--) {
            strInvertida += str.charAt(i);
        }
        
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + strInvertida);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        //Local que será chamado todos os exercícicos
        System.out.println("--------EXERCÍCIO 02-------");
        Exercicio02();
        System.out.println("--------EXERCÍCIO 03-------");
        Exercicio03();
        System.out.println("--------EXERCÍCIO 04-------");
        Exercicio04();
        System.out.println("--------EXERCÍCIO 05-------");
        Exercicio05();
    }
}
