package unidade00;

/* unidade 00 (nivelamento) - 00b - exercicios iniciais:
Faça um metodo que receba um array de inteiros e um numero inteiro x
e retorne um valor booleano informando se o elemento x está contido no array */

import java.util.Scanner;

public class u00bExerciciosIniciais1 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Digite o numero que deseja saber se esta contido ou nao no array: ");
        int numeroDigitado = sc1.nextInt();

        if (verificaPresencaNumero(numeroDigitado)){
            System.out.println("o numero digitado " + numeroDigitado + " está contido no array");
        } else {
            System.out.println("o numero digitado " + numeroDigitado + " NÃO está contido no array");
        }

        sc1.close();
    }

    static boolean verificaPresencaNumero(int numeroDigitado) {
        int arrayDeNumeros[] = {10, 2, 23, 34, 5};
        int quantidadeElementosArray = arrayDeNumeros.length;

        for (int i = 0; i < quantidadeElementosArray; i++) {
            if (arrayDeNumeros[i] == numeroDigitado) {
                return true;
            }
        }
        return false;
    }
}
