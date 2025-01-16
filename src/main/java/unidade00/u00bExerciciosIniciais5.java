package unidade00;

import java.util.Scanner;

/*
Um aluno desenvolveu o código abaixo, corrija-o:

boolean isConsoante(String s, int n){
    boolean resp = true;
    if (n != s.length()){
        if (s.charAt(n) < '0' || s.charAt(n) > '9'){
            if (s.charAt(n) == 'A' || s.charAt(n) == 'E' || s.charAt(n) == 'I' || s.charAt(n) == 'O' ||
                s.charAt(n) == 'U' || s.charAt(n) == 'a' || s.charAt(n) == 'e' || s.charAt(n) == 'i' ||
                s.charAt(n) == 'o' || s.charAt(n) == 'u'){
                resp = false;
            } else {
                n++;
                resp = isConsoante(s, n);
            }
        } else {
            resp = false;
        }
    }
    return resp;
}

levando em consideracao as funções dadas:

char toUpper(char c) {
    return (c >= 'a' && c <= 'z') ? ((char)(c - 32)) : c;
}

boolean isVogal(char c) {
    c = toUpper(c);
    return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
}

boolean isLetra(char c) {
    return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
}

boolean isConsoante(char c) {
    return (isLetra(c) == true && isVogal(c) == false);
}
*/

public class u00bExerciciosIniciais5{

    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Digite o caractere desejado: ");
        char caractere = sc1.next().charAt(0);

        if(!isLetra(caractere)){
            System.out.print("O caractere " + caractere + " nao eh uma letra. ");
        }else if(isConsoante(caractere)){
            System.out.print("a letra " + caractere + " eh uma letra e consoante. ");
        }else{
            System.out.print("a letra " + caractere + " eh uma letra e vogal");
        }
    }

    static char toUpper(char c) {
        return (c >= 'a' && c <= 'z') ? ((char)(c - 32)) : c;
    }

    static boolean isVogal(char caractere) {
        caractere = toUpper(caractere);
        return (caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U') && isLetra(caractere);
    }

    static boolean isLetra(char caractere) {
        return (caractere >= 'A' && caractere <= 'Z' || caractere >= 'a' && caractere <= 'z');
    }

    static boolean isConsoante(char caractere){

        return !isVogal(caractere) && isLetra(caractere);

        /*
        if(isVogal(letra)){
            return false;
        }

        return true;
         */
    }
}