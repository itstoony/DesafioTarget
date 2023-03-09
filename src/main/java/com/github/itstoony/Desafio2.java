package com.github.itstoony;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Desafio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número inteiro desejado: ");
        int target = scanner.nextInt();
        scanner.close();

        int before = 0;
        int after = 1;
        int sum;

        Set<Integer> numbers = new HashSet<>();

        for(int x = 0; x <= 45; ++x) {
            sum = before + after;
            before = after;
            after = sum;

            numbers.add(before);
        }

        if (!numbers.contains(target)) {
            System.out.println("O número " + target + " não percente a sequência de Fibonnaci");
        } else {
            System.out.println("O número " + target + " percente a sequência de Fibonnaci");
        }

    }
}
