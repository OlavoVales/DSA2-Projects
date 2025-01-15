package unidade00;

/* unidade 00 (nivelamento) - 00b - exercicios iniciais:
Repita o exercicio acima considerando que os elementos do array estão ordenados
de forma crescente. Uma sugestão seria começar a pesquisar pelo meio do array*/

//a logica que fiz no exercicio anterior soluciona também o problema deste enunciado dado

import java.util.Scanner;

public class u00bExerciciosIniciais2 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        int[] arrayDeNumeros = {10, 11, 12, 13, 14};

        System.out.println("Digite o numero que deseja saber se esta contido ou nao no array: ");
        int numeroDigitado = sc1.nextInt();

        if (verificaPresencaNumero(numeroDigitado, arrayDeNumeros)){
            System.out.println("o numero digitado " + numeroDigitado + " está contido no array");
        } else {
            System.out.println("o numero digitado " + numeroDigitado + " NÃO está contido no array");
        }

        sc1.close();
    }

    static boolean verificaPresencaNumero(int numeroDigitado, int[] arrayDeNumeros) {
        int quantidadeElementosArray = arrayDeNumeros.length;

        for (int i = 0; i < quantidadeElementosArray; i++) {
            if (arrayDeNumeros[i] == numeroDigitado) {
                return true;
            }
        }
        return false;
    }

}