package unidade00;

/* Faça um metodo que receba um array de inteiros e mostre na tela o maior e o menor elementos do array */

import java.util.Scanner;

public class u00bExerciciosIniciais3{
    public static void main(String[] args){

        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("digite a quantidade de elementos que o array ira possuir: ");
        int quantidadeDeElementosArray = sc1.nextInt();

        int[] arrayDeNumeros = new int[quantidadeDeElementosArray];

        preencheArray(arrayDeNumeros, sc1);

        int menorMaior[] = exibeMenorMaiorElementoArray(arrayDeNumeros);

        System.out.println("o maior elemento da array eh: " + menorMaior[1] + " e o menor elemento da array eh: " + menorMaior[0]);
    }

    static void preencheArray(int[] arrayDeNumeros, Scanner sc1){

        for (int i = 0; i < arrayDeNumeros.length; i++){
            System.out.println("digite o " + (i+1) + "o elemento do array");
            arrayDeNumeros[i] = sc1.nextInt();
        }
    }

    static int[] exibeMenorMaiorElementoArray(int[] arrayDeNumeros){

        int menorNumero = arrayDeNumeros[0];
        int maiorNumero = arrayDeNumeros[0];

        for (int i = 1; i < arrayDeNumeros.length; i++){

            if(arrayDeNumeros[i] <= menorNumero){
                menorNumero = arrayDeNumeros[i];
            }else if(arrayDeNumeros[i] >= maiorNumero){
                maiorNumero = arrayDeNumeros[i];
            }
        }
        
        return new int[]{menorNumero, maiorNumero};
    }
}