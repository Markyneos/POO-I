package com.mycompany.aula20250213;
import java.util.Scanner;

public class Aula20250213 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA");
        int input = 1;
        while (input != 0) {
            System.out.print("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair\nEscolha: ");
            input = scanner.nextInt();
            Operadores operacao = new Operadores();
            switch (input) {
                case 1:
                    System.out.println("Resposta: " + operacao.adicao());
                    break;
                case 2:
                    System.out.println("Resposta: " + operacao.subtracao());
                    break;
                case 3:
                    System.out.println("Resposta: " + operacao.multiplicacao());
                    break;
                case 4:
                    System.out.println("Resposta: " + operacao.divisao());
                    break;
                default:
                    System.out.println("Saindo");
                    break;
            }
        }
        scanner.close();
    }
}

class Operadores {
    public int adicao() {
        return 1;
    }
    public int subtracao() {
        return 2;
    }
    public int multiplicacao() {
        return 3;
    }
    public int divisao() {
        return 4;
    }
}