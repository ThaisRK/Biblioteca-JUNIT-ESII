package com.company.entidades;

public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;
    private String senha;

    public Funcionario(String nome) {
        setNome(getNome());
    }

    //ENCAPSULAMENTO
    public String getNome() {
        return "Bem vindo(a), " + nome;
    }

    public void setNome(String nome) {
        if (nome.length() <= 50 && nome.length() >= 4 && nome.split(" ").length >= 2) {
            this.nome = nome;
        } else {
            this.nome = "Por favor, o nome deter ter no mínimo 4 caracteres " +
                    "e no máximo 50. Deve conter nome e sobrenome.";
        }
    }

    public String getCpf() {
        return (cpf.substring(0, 3) + "." + cpf.substring(3, 6) +
                "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11));
    }

    public void setCpf(String cpf) {
        if (cpf.length() != 11) {
            cpf = "CPF deve conter 11 algarismos, dispensando pontos, espaços ou hífens";
        }

        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = "Rua 2, Nº15";
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = 1200;
    }

    public String getSenha() {
        return "       Acesso Liberado";
    }

    public void setSenha(String senha) {
        if (senha.equals("123")) {
            this.senha = senha;
        } else {
            System.exit(0);
        }
    }

    @Override
    public String toString() {
        return "Funcionario: " + nome +
                "\nCargo: " + cargo +
                "\nSalario: " + salario;
    }


}
