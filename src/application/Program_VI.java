package application;

import java.util.Scanner;

public class Program_VI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Quantos valores vai ter cada vetor? ");
        n = sc.nextInt();

        int[] A = new int[n], B = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }


        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < n; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = new int[n];

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }

        sc.close();
    }
}
