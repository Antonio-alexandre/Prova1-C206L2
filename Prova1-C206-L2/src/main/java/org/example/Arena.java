package org.example;

import java.util.Objects;

public class Arena {
    String nome;
    String lugar;
    Rapper [] rappers = new Rapper[20];

    //Variáveis auxiliares para identificar o primeiro e último lugares da arena
    Rapper primeiro;
    Rapper ultimo;

    void addRapper(Rapper rapper){
        for (int i = 0; i < rappers.length; i++){
            if(rappers[i] == null) { //Verifica se a posição i do vetor é nula, e caso for, armazena o rapper nela
                rappers[i] = rapper;
                break;
            }
        }
    }

    void mostraInfo(){
        System.out.println("Nome da arena: " +nome);
        System.out.println("Onde fica a arena: " +lugar);
        System.out.println("Rappers que batalharam: ");
        System.out.println();
        for(int i = 0; i < rappers.length; i++){
            if(rappers[i] != null) //Caso a posição i do vetor tenha algum rapper armazenado, exibe as informações dele
                rappers[i].mostraInfo();
        }
    }

    void microfoneDou(){
        System.out.println("Rappers com microfone dourado: ");
        for(int i = 0; i < rappers.length; i++)
        {
            if(rappers[i] != null)
                if(Objects.equals(rappers[i].mic.material, "Dourado")) //Verifica se o material é dourado, e caso for, exibe o nome do rapper na saída
                    System.out.println(rappers[i].nome + ", ");
        }
    }

    void ranking(){
        primeiro = rappers[0];
        ultimo = rappers[0];
        for(int i = 0; i < rappers.length; i++)
        {
            if(rappers[i] != null)
                if(primeiro.nota < rappers[i].nota) //Verifica qual a maior nota, e armazena o objeto na variável "primeiro"
                    primeiro = rappers[i];
        }
        System.out.println("Primeiro colocado: " +primeiro.nome);
        for(int i = 0; i < rappers.length; i++)
        {
            if(rappers[i] != null)
                if(ultimo.nota > rappers[i].nota) //Verifica qual a menor nota, e armazena o objeto na variável "ultimo"
                    ultimo = rappers[i];
        }
        System.out.println("Último colocado: " +ultimo.nome);
    }
}
