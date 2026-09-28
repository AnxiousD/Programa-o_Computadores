package game.store.estoque.unipar.br;
import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] jogos = new String[5];
        int[] estoque = new int[5];

        int cadastrados = 0;
        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== GAME STORE =====");
            System.out.println("1 - Cadastrar jogo");
            System.out.println("2 - Listar estoque");
            System.out.println("3 - Vender jogo");
            System.out.println("4 - Repor estoque");
            System.out.println("5 - Consultar jogo");
            System.out.println("6 - Ver total de unidades");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    if (cadastrados >= 5) {
                        System.out.println("Estoque cheio!");
                    } else {

                        System.out.print("Digite o nome do jogo: ");
                        jogos[cadastrados] = scanner.nextLine();

                        System.out.print("Digite a quantidade inicial: ");
                        int quantidade = scanner.nextInt();

                        if (quantidade < 0) {
                            System.out.println("Quantidade inválida!");
                        } else {
                            estoque[cadastrados] = quantidade;
                            cadastrados++;

                            System.out.println("Jogo cadastrado com sucesso!");
                        }
                    }
                    break;

                case 2:
                    if (cadastrados == 0) {
                        System.out.println("Nenhum jogo cadastrado.");
                    } else {

                        System.out.println("\n--- ESTOQUE ---");

                        for (int i = 0; i < cadastrados; i++) {
                            System.out.println(
                                    (i + 1) + " - " + jogos[i]
                                            + ": " + estoque[i] + " unidades"
                            );
                        }
                    }
                    break;

                case 3:
                    if (cadastrados == 0) {
                        System.out.println("Nenhum jogo cadastrado.");
                    } else {

                        System.out.println("\n--- JOGOS ---");

                        for (int i = 0; i < cadastrados; i++) {
                            System.out.println(
                                    (i + 1) + " - " + jogos[i]
                                            + ": " + estoque[i] + " unidades"
                            );
                        }

                        System.out.print("Escolha o jogo: ");
                        int numero = scanner.nextInt();

                        if (numero < 1 || numero > cadastrados) {
                            System.out.println("Escolha inválida!");
                        } else {

                            System.out.print("Quantidade para vender: ");
                            int quantidade = scanner.nextInt();

                            if (quantidade <= 0) {
                                System.out.println("Escolha inválida!");
                            } else if (quantidade > estoque[numero - 1]) {
                                System.out.println("Estoque insuficiente!");
                            } else {

                                estoque[numero - 1] -= quantidade;

                                System.out.println(
                                        "Venda realizada! "
                                                + jogos[numero - 1]
                                                + " agora tem "
                                                + estoque[numero - 1]
                                                + " unidades."
                                );
                            }
                        }
                    }
                    break;

                case 4:
                    if (cadastrados == 0) {
                        System.out.println("Nenhum jogo cadastrado.");
                    } else {

                        System.out.println("\n--- JOGOS ---");

                        for (int i = 0; i < cadastrados; i++) {
                            System.out.println(
                                    (i + 1) + " - " + jogos[i]
                                            + ": " + estoque[i] + " unidades"
                            );
                        }

                        System.out.print("Escolha o jogo: ");
                        int numero = scanner.nextInt();

                        if (numero < 1 || numero > cadastrados) {
                            System.out.println("Escolha inválida!");
                        } else {

                            System.out.print("Quantidade para repor: ");
                            int quantidade = scanner.nextInt();

                            if (quantidade <= 0) {
                                System.out.println("Escolha inválida!");
                            } else {

                                estoque[numero - 1] += quantidade;

                                System.out.println(
                                        "Estoque reposto! "
                                                + jogos[numero - 1]
                                                + " agora tem "
                                                + estoque[numero - 1]
                                                + " unidades."
                                );
                            }
                        }
                    }
                    break;

                case 5:
                    if (cadastrados == 0) {
                        System.out.println("Nenhum jogo cadastrado.");
                    } else {

                        System.out.print("Digite o número do jogo: ");
                        int numero = scanner.nextInt();

                        if (numero < 1 || numero > cadastrados) {
                            System.out.println("Jogo não encontrado.");
                        } else {

                            System.out.println(
                                    "Nome: " + jogos[numero - 1]
                            );

                            System.out.println(
                                    "Quantidade: " + estoque[numero - 1]
                                            + " unidades"
                            );
                        }
                    }
                    break;

                case 6:
                    int total = 0;

                    for (int i = 0; i < cadastrados; i++) {
                        total += estoque[i];
                    }

                    System.out.println(
                            "Total de unidades disponíveis: " + total
                    );
                    break;

                case 0:
                    System.out.println("Obrigado por usar a Game Store!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}
