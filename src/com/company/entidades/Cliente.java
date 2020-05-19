package com.company.entidades;

 public class Cliente extends Pessoa {
    private String email;
    private String livroAlugado;
    private String livroDevolvido;
    //double valorEntrada;



    public Cliente(String nome, double multa) {
        setNome(nome);
        setMulta(multa);
        //setValorEntrada(valorEntrada);
    }

     public double pagarMulta(double valorEntrada) {
        if (Validador.validaCaixa(valorEntrada, this)){
            double troco = valorEntrada - multa;
            return troco;
        }else{
            throw new RuntimeException("O valor de entrada deve ser maior que a multa");
        }

    }

    //ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        /*if (nome.length() <= 50 && nome.length() >= 4 && nome.split(" ").length >= 2) {
            this.nome = nome;
        } else {
            this.nome = "";
        }*/
        this.nome = nome;
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
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@company")){
            this.email = email.toLowerCase();
        }else{
            throw new RuntimeException("E-mail Inválido");
        }
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public String getLivroAlugado() {
        //contaAlugados++;
        return "*Livro Alugado*: " + livroAlugado;
    }

    public void setLivroAlugado(String livroAlugado) {
        if (livroAlugado.equals("1")) {
            this.livroAlugado = "Um Novo Mundo - Eckhar Tolle";
        } else if (livroAlugado.equals("2")) {
            this.livroAlugado = "Lógica de Programação - Edécio Fernando";
        } else {
            this.livroAlugado = "Código não encontrado";
        }

    }

    public String getLivroDevolvido() {
        return "*Livro Devolvido*: " + livroDevolvido;
    }

    public void setLivroDevolvido(String livroDevolvido) {
        if (livroDevolvido.toLowerCase().equals("um novo mundo")) {
            this.livroDevolvido = "Um Novo Mundo - Eckhart Tolle";
        } else if (livroDevolvido.toLowerCase().equals("lógica de programação")) {
            this.livroDevolvido = "Lógica de Programação - Edécio Fernando";
        } else {
            this.livroDevolvido = "Título não encontrado";
        }
    }


    @Override
    public String toString() {
        return "Cliente: " + nome +
                " | Email: " + email +
                " | Multa: " + multa +
                " | Livro Alugado: " + livroAlugado +
                " | Livro Devolvido: " + livroDevolvido;

    }


}
