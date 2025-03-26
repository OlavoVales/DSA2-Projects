package estudoprova1;

public class exercicio2 {
 
    public static void main(String[] args) {
        int[] vetorBase = {10, 20, 30, 40, 50, 60, 70};

        int[]resultado = maiorMenorElementosArray(vetorBase);
        
        System.err.print("o maior elemento do vetor dado inicialmente eh: " + resultado[0] + " e o menor eh: " + resultado[1]);
    }

    public static int[] maiorMenorElementosArray(int[] vetorA){
        int impares = 1;
        int pares = 0;
        int tamanhoArray = vetorA.length;
        int numeroSobra = 0;
        int menorNumero = 0;
        int maiorNumero = 0;
        int[] retorno = new int[2];

        if(tamanhoArray % 2 == 1){
            numeroSobra = vetorA[tamanhoArray - 1];
        }

        int tamanhoVetoresDivididos = tamanhoArray/2;
        int[] vetorMaiores = new int[tamanhoVetoresDivididos];
        int[] vetorMenores = new int[tamanhoVetoresDivididos];

        for(int i = 0; i < tamanhoVetoresDivididos; i++){
            if(vetorA[pares] > vetorA[impares]){
                vetorMaiores[i] = vetorA[pares];
                vetorMenores[i] = vetorA[impares];
            } else {
                vetorMenores[i] = vetorA[pares];
                vetorMaiores[i] = vetorA[impares];
            }
            impares += 2;
            pares += 2;
        }

        maiorNumero = vetorMaiores[0];
        menorNumero = vetorMenores[0];

        for(int j = 1; j < tamanhoVetoresDivididos; j++){
            
            if(maiorNumero < vetorMaiores[j]){
                maiorNumero = vetorMaiores[j];
            }

            if(menorNumero > vetorMenores[j]){
                menorNumero = vetorMenores[j];
            }
        }

        if(numeroSobra > maiorNumero){
            maiorNumero = numeroSobra;
        }

        if(numeroSobra < menorNumero){
            numeroSobra = menorNumero;
        }

        retorno[0] = maiorNumero;
        retorno[1] = menorNumero;

        return retorno;
    }
}