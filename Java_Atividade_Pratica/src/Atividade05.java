public class Atividade05 {

    public class Main {
        public static void main(String[] args) {
            double media = calcularMedia(8.0, 6.0);
            boolean aprovado = estaAprovado(media);
            mostrarResultado(media, aprovado);
        }

        public static double calcularMedia(double a, double b) {
            return ( a + b ) / 2;
        }

        public static boolean estaAprovado(double media) {
            return media >= 6;
        }

        public static void mostrarResultado(double media, boolean aprovado) {
            System.out.println("Media: " + media );

            if (aprovado) {
                System.out.println("Aprovado");
            }else  {
                System.out.println("Reprovado");
            }
        }

    }

}
