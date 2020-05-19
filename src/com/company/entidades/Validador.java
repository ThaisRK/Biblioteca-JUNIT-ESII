package com.company.entidades;

public class Validador {
    public static boolean validaCaixa(double valorEntrada, Cliente cli) {
    // Confere o valor dos atributos da classe
        // Cliente cli = new Cliente("Thais", 18);

        if (valorEntrada >= cli.multa) {
            return true;
        } else{
            return false;
            //throw new Error("Error: Valor de entrada deve ser maior ou igual ao valor da multa");
        }
    }
}
