package br.unipar.vetores;

import java.util.Scanner;

public class Atvidade1 {

    public static void main() {

        String[] nomes = new String[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro nome");
        nomes[0] = sc.next();

        System.out.println("Informe o segundo nome");
        nomes[1] = sc.next();

        System.out.println("Inform o terceiro valor");
        nomes[2] = sc.next();

        double[] precos = new double[3];

        System.out.println("Informe o priemiro preço");
        precos[0] = sc.nextDouble();

        System.out.println("Informe o segundo preço");
        precos[1] = sc.nextDouble();

        System.out.println("Informe o terceiro preço");
        precos[2] = sc.nextDouble();

        double[] quant = new double[3];

        System.out.println("Informe a quantidade do 1 produtdo");
        quant[0] = sc.nextDouble();;

        System.out.println("Informe a quantidade do 2 produtdo");
        quant[1] = sc.nextDouble();

        System.out.println("Informe a quantidade do 3 produtdo");
        quant[2] = sc.nextDouble();

        double[] subtotal = new double[3];

        subtotal[0] = precos[0] * quant[0];
        subtotal[1] = precos[1] * quant[1];
        subtotal[2] = precos[2] * quant[2];

        double totalFinal;

        totalFinal = subtotal[0] + subtotal[1] + subtotal[2];

        System.out.println("O produto " + nomes[0] + " possui o subtotal de: R$ " + subtotal[0]);

        System.out.println("O produto " + nomes[1] + " possui o subtotal de: R$ " + subtotal[1]);

        System.out.println("O produto " + nomes[2] + " possui o subtotal de: R$ " + subtotal[2]);

        System.out.println("O valor total da compra é: " + totalFinal);


    }

}
