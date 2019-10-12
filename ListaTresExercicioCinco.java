package exerciciostres;

import java.util.HashSet;
import java.util.Scanner;

public class ListaTresExercicioCinco {
    public static void main(String[] args) {
        HashSet<String> hash5 = new HashSet<String>();
        Scanner ent5 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio5 - NOMES ALEATÓRIOS
        Crie um programa que receba o nome de 5 pessoas e aleatorize eles.
        */ 

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º Nome: ");
            String aux = ent5.nextLine();
            hash5.add(aux);

        }
        System.out.println(hash5); // imprime os nomes aleatorios.
        ent5.close();
        hash5.clear();
    }
}
