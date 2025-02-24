package com.mycompany.aula20250213;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ArithmeticException {
        int input = 1;
        while (input != 0) {
            System.out.println("CALCULADORA");
            System.out.print("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n0 - Sair\nEscolha: ");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Resposta: " + adicao() + "\n");
                    break;
                case 2:
                    System.out.println("Resposta: " + subtracao() + "\n");
                    break;
                case 3:
                    System.out.println("Resposta: " + multiplicacao() + "\n");
                    break;
                case 4:
                    try {
                        System.out.println("Resposta: " + divisao() + "\n");
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

    public static int adicao() {
        System.out.print("Primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.print("Segundo: ");
        int segundo = scanner.nextInt();
        return primeiro + segundo;
    }

    public static int subtracao() {
        System.out.print("Primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.print("Segundo: ");
        int segundo = scanner.nextInt();
        return primeiro - segundo;
    }

    public static int multiplicacao() {
        System.out.print("Primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.print("Segundo: ");
        int segundo = scanner.nextInt();
        return primeiro * segundo;
    }

    public static int divisao() {
        System.out.print("Primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.print("Segundo: ");
        int segundo = scanner.nextInt();
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
