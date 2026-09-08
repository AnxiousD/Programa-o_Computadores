package br.unipar.vetores;

import java.util.Scanner;

public class    Vetor {

    public static void main(String[] args) {

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;

        //Criei um Vetor
        double[] notas = new double[5];

        //Guardei um Valor
        notas[0] = 10;
        notas [1] = 1.1;
        notas [2] = 7.3;
        notas [3] = 8.1;
        notas [4] = 3.2;

        //Usei um Valor
        double media = notas[0] + notas [1] + notas [2] + notas [3] + notas [4];
        media = media / 5;

        System.out.println("Media Final" + media);

        System.out.println("Qual é a terceira nota " + notas[2]);
        System.out.println("Qual é a quarta nota " + notas[3]);

        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome :");
        nomes [0] = sc.next();

        System.out.println("Informe o nome 2");
        nomes [1] = sc.next();

        System.out.println("Informe o 3 nome");
        nomes [2] = sc.next();

        System.out.println("Informe o 4 nome");
        nomes [3] = sc.next();

        System.out.println("Informe o 5 nome");
        nomes [4] = sc.next();

        System.out.println("A nota do " + nomes[0] + "é" + notas[0]);

    }

}
