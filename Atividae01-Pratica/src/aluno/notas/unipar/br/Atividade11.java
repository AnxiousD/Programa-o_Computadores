package aluno.notas.unipar.br;

import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[10];
        int quantidade = 0;
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== SISTEMA DE NOTAS =====");
            System.out.println("1 - Cadastrar notas");
            System.out.println("2 - Listar notas");
            System.out.println("3 - Calcular média");
            System.out.println("4 - Maior e menor nota");
            System.out.println("5 - Consultar nota por número");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Quantos alunos deseja cadastrar (1 a 10)? ");
                    quantidade = scanner.nextInt();

                    if (quantidade < 1 || quantidade > 10) {
                        System.out.println("Quantidade inválida!");
                        quantidade = 0;
                    } else {
                        for (int i = 0; i < quantidade; i++) {

                            do {
                                System.out.print("Digite a nota do aluno " + (i + 1) + " (0 a 10): ");
                                notas[i] = scanner.nextDouble();

                                if (notas[i] < 0 || notas[i] > 10) {
                                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                                }

                            } while (notas[i] < 0 || notas[i] > 10);
                        }

                        System.out.println("Notas cadastradas com sucesso!");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {
                        System.out.println("\n--- NOTAS CADASTRADAS ---");

                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
                        }
                    }
                    break;

                case 3:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {
                        double soma = 0;

                        for (int i = 0; i < quantidade; i++) {
                            soma += notas[i];
                        }

                        double media = soma / quantidade;

                        System.out.println("Média da turma: " + media);
                    }
                    break;

                case 4:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {
                        double maior = notas[0];
                        double menor = notas[0];

                        for (int i = 1; i < quantidade; i++) {

                            if (notas[i] > maior) {
                                maior = notas[i];
                            }

                            if (notas[i] < menor) {
                                menor = notas[i];
                            }
                        }

                        System.out.println("Maior nota: " + maior);
                        System.out.println("Menor nota: " + menor);
                    }
                    break;

                case 5:
                    if (quantidade == 0) {
                        System.out.println("Nenhuma nota cadastrada.");
                    } else {
                        System.out.print("Digite o número do aluno (1 a "
                                + quantidade + "): ");

                        int aluno = scanner.nextInt();

                        if (aluno < 1 || aluno > quantidade) {
                            System.out.println("Número do aluno inválido!");
                        } else {
                            System.out.println("Nota do aluno " + aluno + ": "
                                    + notas[aluno - 1]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}