import java.util.Scanner;

public class ProvaSeuNome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Eleitores autorizados
        String[] eleitores = {
                "1001", "1002", "1003", "1004", "SEU RA"
        };

        // Cargos
        String[] cargos = {
                "Deputado Federal",
                "Deputado Estadual",
                "Senador",
                "Governador",
                "Presidente"
        };

        // Números dos candidatos
        int[][] numeros = {
                {101, 102, 103},
                {201, 202, 203},
                {301, 302, 303},
                {401, 402, 403},
                {501, 502, 503}
        };

        // Nomes dos candidatos
        String[][] candidatos = {
                {"Jose Bombinha", "Ana Silva", "Carlos Lima"},
                {"Taffe da Galera", "Rodrigo Pato Depenado", "Mariana Costa"},
                {"Hulison Clone", "Juliana Rocha", "Roberto Martins"},
                {"Patrick Cobra", "Fernanda Souza", "Ricardo Oliveira"},
                {"SEU NOME", "Alessandro das Redes", "Lucas Ferreira"}
        };

        // Votos de cada eleitor
        int[][] votos = new int[5][5];

        // Quantidade de votos de cada candidato
        int[][] quantidade = new int[5][3];

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Iniciar votação");
            System.out.println("2 - Consultar votos de um eleitor");
            System.out.println("3 - Exibir resultado");
            System.out.println("4 - Mostrar vencedores");
            System.out.println("0 - Encerrar");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Número do eleitor: ");
                    String numero = sc.next();

                    int eleitor = -1;

                    // Procura o eleitor
                    for (int i = 0; i < 5; i++) {

                        if (eleitores[i].equals(numero)) {
                            eleitor = i;
                        }
                    }

                    if (eleitor == -1) {

                        System.out.println("Eleitor não autorizado!");

                    } else if (votos[eleitor][0] != 0) {

                        System.out.println("Este eleitor já votou!");

                    } else {

                        // Votação dos 5 cargos
                        for (int cargo = 0; cargo < 5; cargo++) {

                            System.out.println("\n" + cargos[cargo]);

                            // Mostra os candidatos
                            for (int i = 0; i < 3; i++) {

                                System.out.println(
                                        numeros[cargo][i]
                                                + " - "
                                                + candidatos[cargo][i]
                                );
                            }

                            int voto;
                            boolean valido;

                            do {

                                System.out.print("Digite seu voto: ");
                                voto = sc.nextInt();

                                valido = false;

                                // Verifica o voto
                                for (int i = 0; i < 3; i++) {

                                    if (voto == numeros[cargo][i]) {

                                        valido = true;

                                        votos[eleitor][cargo] = voto;

                                        quantidade[cargo][i]++;
                                    }
                                }

                                if (!valido) {
                                    System.out.println("Número inválido!");
                                }

                            } while (!valido);
                        }

                        System.out.println("Votação concluída!");
                    }

                    break;


                case 2:

                    System.out.print("Número do eleitor: ");
                    numero = sc.next();

                    eleitor = -1;

                    for (int i = 0; i < 5; i++) {

                        if (eleitores[i].equals(numero)) {
                            eleitor = i;
                        }
                    }

                    if (eleitor == -1) {

                        System.out.println("Eleitor não encontrado!");

                    } else if (votos[eleitor][0] == 0) {

                        System.out.println("Eleitor ainda não votou!");

                    } else {

                        System.out.println("\nVotos:");

                        for (int i = 0; i < 5; i++) {

                            System.out.println(
                                    cargos[i]
                                            + ": "
                                            + votos[eleitor][i]
                            );
                        }
                    }

                    break;


                case 3:

                    System.out.println("\n===== RESULTADO =====");

                    for (int cargo = 0; cargo < 5; cargo++) {

                        System.out.println("\n" + cargos[cargo]);

                        for (int i = 0; i < 3; i++) {

                            System.out.println(
                                    candidatos[cargo][i]
                                            + " - "
                                            + quantidade[cargo][i]
                                            + " votos"
                            );
                        }
                    }

                    break;


                case 4:

                    System.out.println("\n===== VENCEDORES =====");

                    for (int cargo = 0; cargo < 5; cargo++) {

                        int maior = quantidade[cargo][0];

                        // Descobre a maior quantidade
                        for (int i = 1; i < 3; i++) {

                            if (quantidade[cargo][i] > maior) {
                                maior = quantidade[cargo][i];
                            }
                        }

                        System.out.println("\n" + cargos[cargo]);

                        if (maior == 0) {

                            System.out.println("Ainda não há votos.");

                        } else {

                            // Mostra quem tem a maior quantidade
                            for (int i = 0; i < 3; i++) {

                                if (quantidade[cargo][i] == maior) {

                                    System.out.println(
                                            candidatos[cargo][i]
                                                    + " - "
                                                    + maior
                                                    + " votos"
                                    );
                                }
                            }
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

        sc.close();
    }
}