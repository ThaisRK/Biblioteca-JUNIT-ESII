package com.company.entidades;

public class Bib {
    private String endereco;
    private String email;
    private double caixa;
    private String[] acervoObras;
    private int estoque;
    //private double precoCompra;


    public Bib(String endereco, String email, double caixa, String acervoObras, int estoque) {
        setCaixa(getCaixa());
        setEmail(getEmail());
        setEndereco(getEndereco());
        setAcervoObras(getAcervoObras());
        setEstoque(getEstoque());
    }



    //ENCAPSULAMENTO

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = "Avenida Bento Gonçalvez, Nº1213";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = "biblioteva_avenida@gmail.com";
    }

    public double getCaixa() {
        return caixa;
    }

    public String getCaixa(String saldoInsu) {
        if (this.caixa < 0)
            saldoInsu = "Saldo Insuficiente para compra";
        return saldoInsu;
    }

    public void setCaixa(double precoCompra) {
        this.caixa = 300-precoCompra;
        /*if (precoCompra <= this.caixa) {
            this.caixa = this.caixa - precoCompra;
        } else if (precoCompra > this.caixa) {
            this.caixa = this.caixa - precoCompra;
        }*/
    }

    @Override
    public String toString() {
        return "Status da Biblioteca: Aberto " +
                "\nLocal: " + this.endereco +
                ", \nContato: " + this.email +
                ", \nCaixa Atual: " + this.caixa;
    }


    public String[] getAcervoObras() {
        return acervoObras;
    }

    public void setAcervoObras(String[] acervoObras) {
        this.acervoObras = acervoObras;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
