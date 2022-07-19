package desafio_domino;

import java.io.IOException;
import java.util.Scanner;

public class duploN {
    //public static void main(String[] args) {
/*        // Ler entrada do usuario
        Scanner leEntrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leEntrada.nextInt();

        //Restricoes 0<=N<=10000

        if (numero < 0 || numero > 10000) {
            System.out.println("Você não digitou um número válido. Tente de novo");
            numero = leEntrada.nextInt();
        }
        //inicializando a variavel que contera a saida
        int resultado;
        resultado = ((numero+1)*(numero+2))/2;

        System.out.println("O dominó é do tipo duplo-" + numero);
        System.out.println("A quantidade de peças do seu dominó é: " + resultado);*/

        public static void main(String[] args) throws IOException {

            Scanner input = new Scanner(System.in);
            String[] nomes = new String[5];
            for (int i = 0; i < nomes.length; i++)
            {
// TODO: complete os espaços em branco com sua solução para o problema
                nomes[i] = input.nextLine();
            }

            int pos = input.nextInt();
            System.out.println(nomes[pos]);

        }
    }
//}
