package com.company.view;

import com.company.entidades.*;

import java.io.*;

public class Principal {

    public static void main(String[] args) throws IOException {
        //INSTÂNCIAS
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Bib bib1 = new Bib("" , " ", 0, "", 0);
        Cliente cli1 = new Cliente(" ", 0);
        Funcionario fun1 = new Funcionario("");
        Livro livro1 = new Livro(" ", " ");

        //REGISTRA FUNCIONÁRIO + BOAS VINDAS
        System.out.print("Nome do funcionário: ");
        fun1.setNome(in.readLine());
        System.out.println(fun1.getNome());
        System.out.print("Informe seu cargo: ");
        fun1.setCargo(in.readLine());
        System.out.print("Informe sua senha: ");
        fun1.setSenha(in.readLine());
        System.out.println(fun1.getSenha());

        //INFOS
        System.out.println(bib1.toString());
        System.out.println("*****************************************");
        System.out.println(fun1.toString());

        //MENU
        int opcao = 0;

        do {
            System.out.println("+-----Biblioteca Bicho da Seda-----+");
            System.out.println("+--------O que faremos hoje?-------+");
            System.out.println("|1. Comprar livros                 |");
            System.out.println("|2. Cadastrar Livro                |");
            System.out.println("|3. Cadastrar Cliente              |");
            System.out.println("|4. Registrar Aluguel              |");
            System.out.println("|5. Registrar Devolução            |");
            System.out.println("|6. Gerar Multa                    |");
            System.out.println("|7. Quitar Multa                   |");
            System.out.println("|8. Mostrar detalhes de livro      |");
            System.out.println("|0. Sair                           |");
            System.out.println("+----------------------------------+");
            opcao = Integer.parseInt(in.readLine());

            switch (opcao) {
                case 1: //COMPRAR LIVRO
                    System.out.print("Compra registrada no valor de R$: ");
                    bib1.setCaixa(Double.parseDouble(in.readLine()));
                    System.out.println(bib1.getCaixa(""));
                    System.out.print("Saldo Disponível: ");
                    System.out.println(bib1.getCaixa());
                    break;
                case 2: //CADASTRAR LIVRO
                    //VERIFICAÇÃO DO CPF DO FUNCIONÁRIO
                    System.out.print("CPF do responsável pelo registro " +
                            "(sem espaços, pontos ou traço): ");
                    fun1.setCpf(in.readLine());
                    System.out.print("Comfirma? " + fun1.getCpf() + " (S ou N)");
                    String confirma = in.readLine();
                    if (confirma.toUpperCase().equals("N")) {
                        System.out.print("Atenção: última tentativa. Digite o CPF:");
                        fun1.setCpf(in.readLine());
                    }
                    System.out.println(fun1.getCpf() + ", OK!");

                    //RECEBE TÍTULO E AUTOR
                    System.out.print("CADASTRA LIVRO \nTítulo do Livro: ");
                    livro1.setTitulo(in.readLine());

                    System.out.print("Autor: ");
                    livro1.setAutor(in.readLine());

                    //RETORNA A CONFIRMAÇÃO DO CADASTRO
                    System.out.println(livro1.cadastraLivro("", ""));
                    System.out.println(fun1.toString());
                    break;
                case 3: //CADASTRAR CLIENTE
                    System.out.println("Cadastro de Novos Clientes");
                    System.out.print("Nome Completo: ");
                    cli1.setNome(in.readLine());

                    System.out.print("CPF (sem espaços, pontos ou traços): ");
                    cli1.setCpf(in.readLine());

                    System.out.print("Endereço: ");
                    cli1.setEndereco(in.readLine());

                    System.out.print("Email (até o ...@): ");
                    cli1.setEmail(in.readLine());

                    System.out.printf("Nome: %s | CFP: %s | Endereço: %s | E-mail: %s\n",
                            cli1.getNome(), cli1.getCpf(), cli1.getEndereco(), cli1.getEmail());
                    break;
                case 4: //REGISTRAR ALUGUEL
                    //SELECIONA O LIVRO
                    System.out.println("Digite o número do livro: ");
                    System.out.println("1 - Um novo Mundo - Eckhar Tolle");
                    System.out.println("2 - Lógicade Programação - Edécio Fernando");
                    cli1.setLivroAlugado(in.readLine());

                    //SELECIONA O CLIENTE CADASTRADO
                    System.out.println("Selecioneo cliente cadastrado: ");
                    System.out.println("1 - Thais Knuth");
                    System.out.println("2 - Angelo Luz");
                    cli1.setNome(in.readLine());
                    if (cli1.getNome().equals("1")) {
                        cli1.setNome("Thais Knuth");
                        System.out.println(cli1.getNome());
                    } else if (cli1.getNome().equals("2")) {
                        cli1.setNome("Angelo Luz");
                        System.out.println(cli1.getNome());
                    } else {
                        System.out.println("Código não Encontrado");
                    }

                    //COMPLETA OS DADOS DO CLIENTE PARA SAIR NO toString
                    System.out.print("Email para contato: (até o ...@):");
                    cli1.setEmail(in.readLine());

                    //RETORNA A CONFIRMAÇÃO DO ALUGUEL
                    System.out.println(cli1.getLivroAlugado());
                    System.out.println(cli1.toString());
                    break;

                case 5://REGISTRAR DEVOLUCÃO
                    System.out.println("Título a ser devolvido: ");
                    cli1.setLivroDevolvido(in.readLine());
                    System.out.println(cli1.getLivroDevolvido());
                    break;
                case 6: //GERAR MULTA
                    System.out.print("Nome Completo do Cliente: ");
                    cli1.setNome(in.readLine());

                    System.out.print("Email (até o ...@): ");
                    cli1.setEmail(in.readLine());

                    System.out.print("Dias de Atraso: ");
                    cli1.setMulta(Double.parseDouble(in.readLine()));
                    System.out.print("Valor da Multa R$: ");
                    System.out.println(cli1.getMulta());
                    System.out.println("Referente ao Título: ");
                    cli1.setLivroDevolvido(in.readLine());
                    cli1.setLivroAlugado(cli1.getLivroDevolvido());
                    System.out.println(cli1.toString());
                    break;
                case 7: //QUITAR MULTA
                    System.out.println("| CAIXA |");
                    System.out.print("Total recebido em R$: ");
                    double valorEntrada = Double.parseDouble(in.readLine());

                    System.out.print("Valor da multa gerada em R$: ");
                    double multa = Double.parseDouble(in.readLine());

                    System.out.print("Troco R$: ");
                    //System.out.println(cli1.pagarMulta(valorEntrada, multa));
                    System.out.println(cli1.pagarMulta(valorEntrada));
                    break;

                case 8:
                    System.out.println("| Selecione um número para saber MAIS |");
                    System.out.println("1 - Um novo Mundo - Eckhar Tolle");
                    System.out.println("2 - Lógicade Programação - Edécio Fernando");
                    livro1.setDetalhes(in.readLine());
                    System.out.println(livro1.getDetalhes());
                    break;
            }

        } while (opcao != 0);


    }
}