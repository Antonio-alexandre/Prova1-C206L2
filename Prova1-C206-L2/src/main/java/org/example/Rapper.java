package org.example;

public class Rapper {
    String nome;
    float nota;
    int idade;
    Microfone mic = new Microfone();

    //Construtor para receber as informações por parâmetro
    public Rapper(String nome, float nota, int idade){
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.mic = new Microfone();
    }

    void mostraInfo(){ //Exibe as informações do rapper
        System.out.println("Nome do rapper: " +nome);
        System.out.println("Nota do rapper: " +nota);
        System.out.println("Idade do rapper: " +idade);
        System.out.println("Material do microfone do rapper: " +mic.material);
        System.out.println();
    }
}
