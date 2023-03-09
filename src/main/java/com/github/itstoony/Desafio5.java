package com.github.itstoony;

import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra ou frase: ");
        String palavra = scanner.nextLine();
        String palavraInvertida = inverterString(palavra);
        System.out.println("Palavra/frase invertida: " + palavraInvertida);
    }

    public static String inverterString(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int tamanho = caracteres.length;
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }
        return new String(caracteres);
    }

}
