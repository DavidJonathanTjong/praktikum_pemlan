package praktikumsatu;

import java.util.Scanner;

public class nomorEmpat {

    public static void main(String[] args) {
        System.out.println("- Tabel Perkalian -");
        Scanner input = new Scanner(System.in);
        System.out.print("Perkalian: ");
        int inputan = input.nextInt();
        System.out.print("x\t |\t");
        for (int i = 1; i <= inputan; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 1; i <= inputan; i++) {
            System.out.print("-----------");
        }
        System.out.println("");
        for (int i = 1; i <= inputan; i++) {
            System.out.print(i + "\t |\t");
            for (int j = 1; j <= inputan; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println("");
        }
    }
}
