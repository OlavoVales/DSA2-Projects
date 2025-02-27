import java.util.Scanner;

/**
 *
 * @author 1075702
 */
public class ExerciciosAlgoritmosRecursivos {
    
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
       System.out.println("qual opcao do menu deseja usar: \n [1] Soma de pares \n [2] Soma de elementos de um vetor \n [3] Contagem quantidade de repeticoes");
       int opcaoDoMenu = scanner.nextInt();
       
       switch(opcaoDoMenu){
           case 1:
               System.out.print("digite o numeros que deseja saber a soma dos pares dos anteriores: ");
               int numeroPar = scanner.nextInt();
               int resultadoSomaPares = somaPares(numeroPar);
               System.out.print("o resultado eh " + resultadoSomaPares);
               break;
           case 2:
               double[] arrayDouble = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
               double resultadoSomaElementosArray = somaElementosArray(arrayDouble, arrayDouble.length - 1);
               System.out.print("o resultado eh " + resultadoSomaElementosArray);
               break;
           case 3:
               int[] arrayInt = {1, 2, 3, 4, 5};
               System.out.print("digite o numero que deseja saber quantas vezes está no array: ");
               int numeroEscolhido = scanner.nextInt();
               int resultadoquantidadeNumero = quantidadeDeNumerosNoArray(arrayInt, numeroEscolhido, arrayInt.length - 1);
               System.out.print("o resultado eh " + resultadoquantidadeNumero);
               break;
           default:
               System.out.println("escolha uma opcao valida");
               main(args);
       }
        
        scanner.close();
    }
    
    static public int somaPares(int numeroPar){
     
        if(numeroPar != 0){
            return numeroPar + somaPares(numeroPar - 2); 
        }else{
            return 0;
        }
    }
    
    static public double somaElementosArray(double[] arrayDouble, int posicoesElementosArrayDouble){
        
        if(posicoesElementosArrayDouble >= 0){
            return arrayDouble[posicoesElementosArrayDouble] + somaElementosArray(arrayDouble, posicoesElementosArrayDouble - 1);
        }else{
            return 0;
        }
    }

    static public int quantidadeDeNumerosNoArray(int[] arrayInt, int numeroEscolhido, int posicoesElementosArrayInt){

        if(posicoesElementosArrayInt < 0){
            return 0;
        }

        if (arrayInt[posicoesElementosArrayInt] == numeroEscolhido){
            return 1  + quantidadeDeNumerosNoArray(arrayInt, numeroEscolhido, posicoesElementosArrayInt - 1);
        }else{
            return quantidadeDeNumerosNoArray(arrayInt, numeroEscolhido, posicoesElementosArrayInt - 1);
        }
    }
}