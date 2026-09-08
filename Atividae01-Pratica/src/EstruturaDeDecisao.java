import java.util.Scanner;

public class EstruturaDeDecisao {

    public static void main() {

        /*
        > - maior que
        >= - maior igual
        < - menor que
        <= - menor igual
        == - igual
        equal - igual para string
        != - diferente
         */

        //PEDIR ALGOOOO
        Scanner sc = new Scanner(System.in);
        int idade = 0;

        System.out.println("Informe sua Idade");
        idade = sc.nextInt();

        System.out.println("Sua idade é : " + idade);
        //IF é uma pergunta
        //IF(condição) resposta else -> resposta

        if (idade <= 18) {
            System.out.println("Menor de idade");
        } else if (idade >= 60) {
            System.out.println("Taffe");
        } else {
            System.out.println("Adulto");
        }
    }

}
