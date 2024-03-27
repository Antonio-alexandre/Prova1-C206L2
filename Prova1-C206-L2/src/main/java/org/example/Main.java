package org.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Arena arena = new Arena();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da arena: ");
        arena.nome = entrada.nextLine();
        System.out.println("Digite o lugar da arena: ");
        arena.lugar = entrada.nextLine();

        int op;

        //Executa enquanto 0 não for digitado
        do {
            System.out.println("Digite a operação que deseja realizar: ");
            System.out.println("================================================================");
            System.out.println("1 - Adicionar rappers à arena;");
            System.out.println("2 - Mostrar informações da arena e de seus rappers;");
            System.out.println("3 - Mostrar quais deles têm microfone dourado;");
            System.out.println("4 - Mostrar qual ganhou a batalha, e qual ficou em último lugar;");
            System.out.println("0 - Fecha o menu");
            System.out.println("================================================================");
            op = entrada.nextInt();
            switch (op) {
                case 1: //Entra com as informações do rapper a ser adicionado na Arena
                    System.out.println("Digite o nome do rapper: ");
                    entrada.nextLine();
                    String nome = entrada.nextLine();
                    System.out.println("Digite a nota do rapper (de 0 à 10): ");
                    float nota = entrada.nextFloat();
                    System.out.println("Digite a idade do rapper (dourado, madeira ou plástico): ");
                    int idade = entrada.nextInt();
                    System.out.println("Digite o material do microfone do rapper: ");
                    Rapper rapper = new Rapper(nome, nota, idade); //Instancia o rapper a ser adicionado passando as informações como parâmetro
                    entrada.nextLine();
                    rapper.mic.material = entrada.nextLine();
                    arena.addRapper(rapper); //Adiciona o rapper previamente instanciado na arena
                    break;
                case 2:
                    arena.mostraInfo(); //Chama a função para mostrar as informações dos rappers e da arena
                    break;
                case 3:
                    arena.microfoneDou(); //Chama a função para mostrar quais tem microfone dourado
                    break;
                case 4:
                    arena.ranking(); //Chama a função para mostrar qual ganhou e qual perdeu a batalha
                    break;
                case 0:
                    break; //Finaliza o menu
                default:
                    System.out.println("Opção inválida!!!");
                    break;
            }
        }while(op != 0);
    }
}