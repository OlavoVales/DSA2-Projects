import java.util.Scanner;

public class FIZERRADO {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int somaPares = 0;
        
        System.out.print("digite a quantidade de numeros que deseja armazenar: ");
        int limiteDeNumeros = scanner.nextInt();
        int arrayDeNumeros[] = new int[limiteDeNumeros];
        
        for (int i = 0; i < limiteDeNumeros; i++){
            System.out.print("digite o " + i+1 + " numero desejado: ");
            arrayDeNumeros[i] = scanner.nextInt();
            
            if(arrayDeNumeros[i] % 2 == 0){
               somaPares += arrayDeNumeros[i];
            }
        }
        
        System.out.print("a soma dos numeros pares contidos no array dado eh: " + somaPares);

        scanner.close();
    }
}
