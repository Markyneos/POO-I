package com.mycompany.aula20250213;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        int input = 1;
        while (input != 0) {
            System.out.println("CALCULADORA");
            System.out.print("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair\nEscolha: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Resposta: " + adicao(scanner) + "\n");
                    break;
                case 2:
                    System.out.println("Resposta: " + subtracao(scanner) + "\n");
                    break;
                case 3:
                    System.out.println("Resposta: " + multiplicacao(scanner) + "\n");
                    break;
                case 4:
                    try {
                        System.out.println("Resposta: " + divisao(scanner) + "\n");
                    } catch (ArithmeticException e) {
                        System.err.println("Erro: não é possível dividir por 0\n");
                    }
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

    public static int adicao(Scanner s) {
        System.out.print("Primeiro número: ");
        int primeiro = s.nextInt();
        System.out.print("Segundo: ");
        int segundo = s.nextInt();
        return primeiro + segundo;
    }

    public static int subtracao(Scanner s) {
        System.out.print("Primeiro número: ");
        int primeiro = s.nextInt();
        System.out.print("Segundo: ");
        int segundo = s.nextInt();
        return primeiro - segundo;
    }

    public static int multiplicacao(Scanner s) {
        System.out.print("Primeiro número: ");
        int primeiro = s.nextInt();
        System.out.print("Segundo: ");
        int segundo = s.nextInt();
        return primeiro * segundo;
    }

    public static int divisao(Scanner s) {
        System.out.print("Primeiro número: ");
        int primeiro = s.nextInt();
        System.out.print("Segundo: ");
        int segundo = s.nextInt();
        return primeiro / segundo;
    }
}

// class Operadores {
// Scanner scan = new Scanner(System.in);
//
// public int adicao() {
// System.out.print("Primeiro número: ");
// int primeiro = scan.nextInt();
// System.out.print("Segundo: ");
// int segundo = scan.nextInt();
// return primeiro + segundo;
// }
//
// public int subtracao() {
// System.out.print("Primeiro número: ");
// int primeiro = scan.nextInt();
// System.out.print("Segundo: ");
// int segundo = scan.nextInt();
// return primeiro - segundo;
// }
//
// public int multiplicacao() {
// System.out.print("Primeiro número: ");
// int primeiro = scan.nextInt();
// System.out.print("Segundo: ");
// int segundo = scan.nextInt();
// return primeiro * segundo;
// }
//
// public int divisao() {
// System.out.print("Primeiro número: ");
// int primeiro = scan.nextInt();
// System.out.print("Segundo: ");
// int segundo = scan.nextInt();
// return primeiro / segundo;
// }
// }
