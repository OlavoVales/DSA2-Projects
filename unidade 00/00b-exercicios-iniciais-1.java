/* unidade 00 (nivelamento) - 00b - exercicios iniciais:
Faça um método que receba um array de inteiros e um numero inteiro x 
e retorne um valor booleano informando se o elemento x está contido no array */

Scanner sc1 = new Scanner(System.in);

System.out.println("Digite o numero que deseja saber se esta contido ou nao no array: ");
int numeroDigitado = sc1.nextInt();

boolean verificaPresencaNumero(int numeroDigitado) {
    int arrayDeNumeros[] = {10, 2, 23, 34, 5};
    int quantidadeElementosArray = arrayDeNumeros.length;
    boolean condicao = false;

    for (int i = 0; i < quantidadeElementosArray; i++) {
        if (arrayDeNumeros[i] == numeroDigitado) {
            condicao = true;
            return condicao;
        }
    }

    return condicao;
}

verificaPresencaNumero(numeroDigitado);
