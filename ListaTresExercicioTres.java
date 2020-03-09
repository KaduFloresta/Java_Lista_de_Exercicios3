package exerciciostres;

import java.util.Scanner;

public class ListaTresExercicioTres {
    public static void main(String[] args) {
        Scanner ent3 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

        /*
        Exercicio3 - MAIN 2 VALORES
        Crie um programa que receba como entrada da classe Main dois
        valores numéricos e calcule as operações básicas com eles.
        */ 

        int A = 0;
        int B = 0;
        int adic;
        int subtr;
        int multip;
        int div;

        System.out.println("Digite o 1º valor: ");
        A = ent3.nextInt();
        System.out.println("Digite o 2º valor: ");
        B = ent3.nextInt();

        adic = ((A + B));
        subtr = (A - B);
        multip = (A * B);
        div = (A / B);

        System.out.println("\n" + A + " + " + B + " = " + adic);
        System.out.println(+A + " - " + B + " = " + subtr);
        System.out.println(+A + " * " + B + " = " + multip);
        System.out.println(+A + " / " + B + " = " + div);
        ent3.close();
    }
}
