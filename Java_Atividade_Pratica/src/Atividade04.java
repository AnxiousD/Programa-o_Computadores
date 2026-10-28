public class Atividade04 {

    public class Main {
        public static void main(String[] args) {
            int resultado = calcularQuadrado(5);
            System.out.println("Resultado: " + resultado);

            int triplo = calcularTriplo(5);
            System.out.println("O Triplo do valor é: " + triplo);

        }

        public static int calcularQuadrado(int valor) {

            return valor * valor;

        }

        public static int calcularTriplo(int valor) {

            return valor * 3;

        }

    }


}

