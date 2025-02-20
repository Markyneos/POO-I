package com.mycompany.aula20250213;

import java.util.Scanner;

public class Main {
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
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                    System.err.println("Erro: Tente um dos números selecionados");
            }
        }
        scanner.close();
    }
}

class Operadores {
    Scanner scan = new Scanner(System.in);

    public int adicao() {
        System.out.print("Primeiro número: ");
        int primeiro = scan.nextInt();
        System.out.print("Segundo: ");
        int segundo = scan.nextInt();
        return primeiro + segundo;
    }

    public int subtracao() {
        System.out.print("Primeiro número: ");
        int primeiro = scan.nextInt();
        System.out.print("Segundo: ");
        int segundo = scan.nextInt();
        return primeiro - segundo;
    }

    public int multiplicacao() {
        System.out.print("Primeiro número: ");
        int primeiro = scan.nextInt();
        System.out.print("Segundo: ");
        int segundo = scan.nextInt();
        return primeiro * segundo;
    }

    public int divisao() {
        System.out.print("Primeiro número: ");
        int primeiro = scan.nextInt();
        System.out.print("Segundo: ");
        int segundo = scan.nextInt();
        return primeiro / segundo;
    }
}
