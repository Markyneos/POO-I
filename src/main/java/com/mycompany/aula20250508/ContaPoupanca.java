/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula20250508;

/**
 *
 * @author alunolab02
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }
    
    public void aplicarRendimentoPoupanca() {
        this.aplicarRendimento(0.005);
    }
}
