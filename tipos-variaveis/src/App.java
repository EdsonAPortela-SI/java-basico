import java.util.Scanner;

public class App {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int numeroAtleta = 0;
        double alturaAtleta = 0;
        int numeroMaiorAtleta = 0;
        double alturaMaiorAtleta = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o número do atleta " + i + ":");
            numeroAtleta = input.nextInt();

            System.out.println("Digite a altura do atleta " + i + " em centímetros:");
            alturaAtleta = input.nextDouble();

            if (alturaAtleta > alturaMaiorAtleta) {
                alturaMaiorAtleta = alturaAtleta;
                numeroMaiorAtleta = numeroAtleta;
            }
        }

        System.out.println("O maior atleta é o número " + numeroMaiorAtleta);
        System.out.println("Altura: " + alturaMaiorAtleta + " centímetros");

        input.close();
    }

}
