package exerciciostres;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ListaTresExercicioDois {
    public static void main(String[] args) {
        Scanner leitura2 = new Scanner(System.in);
        System.out.println("Kadu Floresta");
        
        /*
        Exercicio2 - IMPORTAÇÃO de ARQUIVO TXT
        Crie um programa que leia e imprima no console todas as linhas de
        um arquivo de texto.
        */ 

        System.out.printf("Informe o Nome de Arquivo Texto:\n");
        String nome = leitura2.nextLine();

        System.out.printf("\nConteúdo do Arquivo Texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            /*
             * lê a primeira linha a variável "linha" recebe o valor "null" quando o
             * processo de repetição atingir o final do arquivo texto
             */
            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        leitura2.close();
        System.out.println();
    }
}
