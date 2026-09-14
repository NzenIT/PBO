package Praktikum;

import java.util.*;

public class Materi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Elemen array yang dimasukkan:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}