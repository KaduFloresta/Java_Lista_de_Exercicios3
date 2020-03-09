package lista3;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ListaTresExercicioUm {
    public static void main(String[] args) throws IOException {
        Scanner ent31 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio1 - TABUADA e EXPORTAÇÃO de TXT
        Crie um programa que receba um valor e calcule a tabuada deste valor,
        salvando seu resultado em um arquivo de texto.
        */

        int Num31; // Valor da Variável
        int inicio31, fim31;

        System.out.println("Informe a Tabuada: ");
        Num31 = ent31.nextInt();
        System.out.println("Informe o inicio da tabuada: ");
        inicio31 = ent31.nextInt();
        System.out.println("Informe o fim da tabuada: ");
        fim31 = ent31.nextInt();

        FileWriter tabuada31 = new FileWriter("tabuada.txt");
        PrintWriter gravarArq31 = new PrintWriter(tabuada31);

        gravarArq31.printf("---Resultado---%n");
        for (int i = inicio31; i <= fim31; i++) {
            System.out.println(" " + Num31 + " x " + i + " = " + Num31 * i);

            gravarArq31.printf(" %2d X %d = %2d %n", Num31, i, (Num31 * i));
        }
        gravarArq31.close();

        ent31.close();
    }
}
