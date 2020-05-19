package com.company.entidades;

public class Livro {
    private String titulo;
    private String autor;
    private String detalhes;


    public Livro(String titulo, String autor){
        setTitulo(getTitulo());
        setAutor(getAutor());
    }

    public String cadastraLivro(String titulo, String autor) {
        String obra = "Título: " + getTitulo() + " :: " + "Autor: " + getAutor();

        return "Livro Cadastrado com Sucesso: " + obra;
    }


    //ENCAPSULAMENTO
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null ||titulo.equals(" ")){
            this.titulo = "O título não pode ficar em branco. Tente novamente digitando Enter.";
        }
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        /*if (autor.equals("")||autor.equals(" ")){
            this.autor = "Autor não pode ficar em branco. Tente novamente digitando Enter.";
        }else{
            this.autor = autor;
        }*/
        this.autor = autor;
    }


    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        if (detalhes.equals("1")) {
            this.detalhes = "Um Novo Mundo | Eckhar Tolle | 274 Páginas | Editora: Companhia das Letras | Ano: 2016";
        } else if (detalhes.equals("2")) {
            this.detalhes = "Lógica de Programação | Edécio Fernando | 317 Páginas | Editora: Novatec | Ano: 2018";
        } else {
            this.detalhes = "Código não encontrado";
        }
    }
}
