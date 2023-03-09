package com.github.itstoony;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Desafio3 {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(calcularA());
        System.out.println("A: " + a);

        Set<Integer> b = new TreeSet<>(calcularB());
        System.out.println("B: " + b);

        Set<Integer> c = new TreeSet<>(calcularC());
        System.out.println("C: " + c);

        Set<Integer> d = new TreeSet<>(calcularD());
        System.out.println("D: " + d);

        Set<Integer> e = new TreeSet<>(calcularE());
        System.out.println("E: " + e);

        Set<Integer> f = new TreeSet<>(calcularF());
        System.out.println("F: " + f);

    }


    public static Set<Integer> calcularA() {
        Set<Integer> sequencia = new TreeSet<>();

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                sequencia.add(i);
            }
        }

        return sequencia;
    }

    public static TreeSet<Integer> calcularB() {
        TreeSet<Integer> sequencia = new TreeSet<>(Arrays.asList(2,4,8,16,32,64));

        int ultimo = sequencia.last();

        for (int i = 1; i <= 5000; i++) {

            if (i == (ultimo * 2)) {
                sequencia.add(i);
                ultimo = i;
            }

        }

        return sequencia;
    }

    public static TreeSet<Integer> calcularC() {
        TreeSet<Integer> sequencia = new TreeSet<>();
        for (int i = 0; i <= 7; i++) {
            sequencia.add(i * i);
        }
        return sequencia;
    }

    public static TreeSet<Integer> calcularD() {
        TreeSet<Integer> sequencia = new TreeSet<>();
        for (int i = 2; i <= 10; i += 2) {
            sequencia.add(i * i);
        }
        return sequencia;
    }

    public static TreeSet<Integer> calcularE() {
        TreeSet<Integer> sequencia = new TreeSet<>();
        int a = 1;
        int b = 1;
        sequencia.add(a);
        sequencia.add(b);
        while (b < 13) {
            int c = a + b;
            sequencia.add(c);
            a = b;
            b = c;
        }
        return sequencia;
    }

    public static TreeSet<Integer> calcularF() {
        return new TreeSet<>(Arrays.asList(2,10,12,16,17,18,19,200));
    }

}
