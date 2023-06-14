import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        /*
         * Escreva um programa que leia um valor inteiro N. Este N é a quantidade de
         * linhas de saída que serão apresentadas na execução do programa.
         * 
         * Entrada
         * O arquivo de entrada contém um número inteiro positivo N.
         * 
         * Saída
         * Imprima a saída conforme o exemplo fornecido.
         * 
         * 
         * 
         * For example:
         * 
         * Test Input Result
         * Teste01
         * 7
         * 1 2 3 PULA
         * 5 6 7 PULA
         * 9 10 11 PULA
         * 13 14 15 PULA
         * 17 18 19 PULA
         * 21 22 23 PULA
         * 25 26 27 PULA
         */

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int N = teclado.nextInt();

        for (int i = 1; i <= N; i++) {
            int primeiro = (i - 1) * 4 + 1;
            int segundo = primeiro + 1;
            int terceiro = segundo + 1;
            System.out.printf("%d %d %d PULA%n", primeiro, segundo, terceiro);
        }

    }
}
