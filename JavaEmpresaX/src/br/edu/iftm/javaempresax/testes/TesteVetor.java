package br.edu.iftm.javaempresax.testes;

import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {
        /*int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;*/
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tamanho so vetor: ");
        int tamanhoVetor = teclado.nextInt();

        int[] vetorDeInteiros = new int[tamanhoVetor];
        /*vetorDeInteiros[0] = 1;
        vetorDeInteiros[1] = 2;
        vetorDeInteiros[2] = 3;
        vetorDeInteiros[3] = 4;
        vetorDeInteiros[4] = 5;*/

        System.out.println("Digite valores inteiros para o vetor");
        for (int i = 0; i < vetorDeInteiros.length; i++) {
            System.out.printf("\nvetor[%d] = ", i+1);
            vetorDeInteiros[i] = teclado.nextInt();
        }

        System.out.println("\n\nVetor impresso");
        for (int i = 0; i < vetorDeInteiros.length; i++) {
            System.out.printf("\n\nvetor[%d] = %d",i+1,vetorDeInteiros[i]);
        }

        //System.out.println(vetorDeInteiros[4]);
    }
}