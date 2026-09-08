import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;
/*
*  Revisao do carro
*
* Se tiver menos  de 10mil km nao precxisa de revisao
* Se tiver entre 10mul e 20mil km nfazer revisao basica
* Se tiver entre 20 e 30 mil fazer revisao plus
* Se tiver entre 30 e 40 mil fazer revisao mega
* Se tiver maior de 40 miljogar fora
*
* Operador relacional
* && - e
* || - ou
*
*
 */

public class EstruturaDeDecisaoSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos km rodados ?");
        int kmrodados = sc.nextInt();

        if(kmrodados < 10000){
            System.out.println("Nao precisa de revisao");
        } else if (kmrodados >= 10000 && kmrodados <20000) {
            System.out.println("Revisao basica");
        } else if (kmrodados >= 20000 && kmrodados <30000) {
            System.out.println("Revisao plus");
        } else if (kmrodados >= 30000 && kmrodados <40000) {

        }else{
            System.out.println("Joga Fora!");
        }




    }

}


// Pesquisem como mudar esse conjunto de if
// Para o switch colem aqui em baixo
//switch (kmRodados / 10_000) {
//    case 0 -> System.out.println("Não precisa de revisão");
//    case 1 -> System.out.println("Revisão básica");
//    case 2 -> System.out.println("Revisão plus");
//    case 3 -> System.out.println("Revisão mega");
//    default -> System.out.println("Joga fora!");
