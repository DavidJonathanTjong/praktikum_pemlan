package praktikumsatu;

import java.util.Scanner;

public class nomorDua {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Baris : ");
        int angka = input.nextInt();
        for (int i = 1; i <= angka; i++) {
            for (int k = 0; k <= angka - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
